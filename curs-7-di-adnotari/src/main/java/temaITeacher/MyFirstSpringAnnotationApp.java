package temaITeacher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyFirstSpringAnnotationApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TeacherConfiguration.class);

        JavaTeacher javaTeacher = context.getBean("myJavaTeacher", JavaTeacher.class);
        MathTeacher mathTeacher = context.getBean("mathTeacher", MathTeacher.class);

        System.out.println(javaTeacher.getWisdom());
        System.out.println(mathTeacher.getWisdom());

        context.close();
    }
}
