package temaITeacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("javaTeacher")
public class JavaTeacher implements ITeacher{

    private WisdomWordsService wisdomService;
    public int age;
    private String workPlace;

    // constructor unic care primeste ca parametru un obiect de tipul WisdomWordsService
    @Autowired
    public JavaTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
        this.age = 100;
    }

    public JavaTeacher(WisdomWordsService wisdomService, int age) {
        this.wisdomService = wisdomService;
        this.age = age;
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public int getAge() {
        return age;
    }

    public String getWorkPlace() {
        return workPlace;
    }
}