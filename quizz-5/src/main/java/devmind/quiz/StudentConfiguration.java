package devmind.quiz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("devmind.quiz")
public class StudentConfiguration {


    @Bean
    public Student student(){
        return new Student("Stroie", "Alexandra", 10);
    }

    @Bean
    @Scope("prototype")
    public Student studentPrototype() {
        Student student = new Student();
        student.setFirstName("Ion");
        student.setLastName("Popescu");
        student.setGrade(8.50);
        return student;
    }
}
