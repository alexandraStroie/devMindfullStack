package com.example.curs15restapijson.course;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*
ex1: Creeaza un fisier JSON care sa contina date in formatul celor prezentate in capitoul exemplu_de_json. Scrie o aplicatie care sa citeasca datele din acest fisier si sa le translateze intr-un obiect Java (hints: JAXB, Jackson).
ex2: Creeaza un fisier JSON care sa contina un array de date in formatul celor prezentate in capitoul exemplu_de_json. Scrie o aplicatie care sa citeasca datele din acest fisier si sa le translateze intr-un array de obiecte Java.

https://www.baeldung.com/jackson-object-mapper-tutorial
 */
public class Ex1 {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        /* ex1 */
        Course course1 = objectMapper.readValue(new File("src/main/resources/course_details.json"), Course.class);
//        System.out.printf("ex1", course1.getCourseName());


        /* ex2 */
        List<Course> listCourse = objectMapper.readValue(
                new File("src/main/resources/course_details_array.json"),
                new TypeReference<List<Course>>(){});

        listCourse.forEach(x -> System.out.println(x.toString()));


        List<ProgrammingLangs> listProgrammingLang = objectMapper.readValue(
                new File("src/main/resources/programmingLangs.json"),
                new TypeReference<List<ProgrammingLangs>>(){});

        listCourse.forEach(x -> System.out.println(x.toString()));

    }
}
