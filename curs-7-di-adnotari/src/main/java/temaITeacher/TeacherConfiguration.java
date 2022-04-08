package temaITeacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan()
@Import(WisdomServiceConfig.class)
public class TeacherConfiguration {

    @Autowired
    WisdomWordsService wisdomWordsService;

    @Bean
    public JavaTeacher mySecondJavaTeacher() {
        //return new JavaTeacher(wisdomWordsService());
        JavaTeacher javaTeacher = new JavaTeacher(wisdomWordsService, 5);
        return javaTeacher;
    }

    @Bean
    public JavaTeacher myJavaTeacher() {
        return new JavaTeacher(wisdomWordsService);
    }

    @Bean
    public MathTeacher mathTeacher() {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.setWisdomService(wisdomWordsService);
        //mathTeacher.setWisdomService(null);
        return mathTeacher;
    }
}
