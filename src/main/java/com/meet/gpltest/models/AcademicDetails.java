package com.meet.gpltest.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "academic_details")
@Data
public class AcademicDetails {

    @Id
    private String id;

    private String enrollmentNumber;

    private String program;

    private String department;

    private int currentSemester;
}
