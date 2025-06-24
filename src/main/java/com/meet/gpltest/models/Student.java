package com.meet.gpltest.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "students")
@Data
public class Student {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private String email;

    private String phone;

    @DocumentReference(collection = "academic_details")
    private AcademicDetails academicDetails;

}
