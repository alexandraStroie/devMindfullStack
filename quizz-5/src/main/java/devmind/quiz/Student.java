package devmind.quiz;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Student {

    private String lastName;
    private String firstName;
    private double grade;

    public Student() {
    }

    public Student(String lastName, String firstName, double grade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.grade = grade;
    }



}
