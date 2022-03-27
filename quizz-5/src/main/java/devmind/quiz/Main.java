package devmind.quiz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);

        Student student = context.getBean("student", Student.class);
        Student student2 = context.getBean("studentPrototype", Student.class);

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getGrade());

        System.out.println("\nprototype:");
        System.out.println(student2.getFirstName());
        System.out.println(student2.getLastName());
        System.out.println(student2.getGrade());

        context.close();
    }
}
