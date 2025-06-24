package com.meet.gpltest;

import com.meet.gpltest.dto.CreateStudentInput;
import com.meet.gpltest.models.AcademicDetails;
import com.meet.gpltest.models.Student;
import com.meet.gpltest.repository.AcademicDetailsRepository;
import com.meet.gpltest.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;
    private final AcademicDetailsRepository academicDetailsRepository;

    @QueryMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @QueryMapping
    public Student getStudent(@Argument("id") String id) {
        return studentRepository.findById(id).orElse(null);
    }

    @MutationMapping
    public Student createStudent(@Argument("input") CreateStudentInput createStudentInput) {
        AcademicDetails details = new AcademicDetails();
        var detailsInput = createStudentInput.getAcademicDetails();
        details.setEnrollmentNumber(detailsInput.getEnrollmentNumber());
        details.setCurrentSemester(detailsInput.getCurrentSemester());
        details.setDepartment(detailsInput.getDepartment());
        details.setProgram(detailsInput.getProgram());

        var savedDetails = academicDetailsRepository.save(details);

        Student student = new Student();
        student.setEmail(createStudentInput.getEmail());
        student.setFirstName(createStudentInput.getFirstName());
        student.setLastName(createStudentInput.getLastName());
        student.setDateOfBirth(createStudentInput.getDateOfBirth());
        student.setAcademicDetails(savedDetails);

        return studentRepository.save(student);
    }

}
