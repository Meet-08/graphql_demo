package com.meet.gpltest.dto;

import lombok.Data;

@Data
public class CreateStudentInput {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String phone;
    private AcademicDetailsInput academicDetails;

}
