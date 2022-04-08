import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp{

    public static void main(String[] args) {

        // create the object
//        TeacherFactory teacherFactory = new TeacherFactory();
//        String teacherType = "";
//
//        try (InputStream input = new FileInputStream("config.properties")) {
//
//            Properties prop = new Properties();
//
//            // load a properties file
//            prop.load(input);
//            teacherType = prop.getProperty("teacherType");
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        ITeacher theTeacher = teacherFactory.getTeacher(teacherType);
//
//        // use the object
//        System.out.println(theTeacher.getHomework());
//        MyContainer myContainer = new MyContainer();
//        ITeacher teacher = myContainer.getTeacher();

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        ITeacher theTeacher = context.getBean("myTeacher", ITeacher.class);

        // call methods on the bean
        System.out.println(theTeacher.getWisdom());
        System.out.println(theTeacher.getHomeWork());
        System.out.println(theTeacher.getHomework());

        // close the context
        context.close();

    }

}