package com.example.curs15restapijson.course;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Course {

    public String courseName;
    public Trainer trainer;
    public Boolean online;
    public ArrayList<CourseDays> courseDays;
}
