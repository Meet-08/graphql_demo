package com.meet.gpltest.dto;

import lombok.Data;

@Data
public class AcademicDetailsInput {
    private String enrollmentNumber;
    private String program;
    private String department;
    private int currentSemester;

}
