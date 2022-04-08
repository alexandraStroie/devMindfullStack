import lombok.Data;

@Data
public class JavaTeacher implements ITeacher{

    private WisdomWordsService wisdomService;
    private HomeworkService homeworkService;

    // constructor unic care primeste ca parametru un obiect de tipul WisdomWordsService
    public JavaTeacher(WisdomWordsService wisdomService, HomeworkService  homeworkService) {
        this.wisdomService = wisdomService;
        this.homeworkService = homeworkService;
    }


    @Override
    public String getHomeWork() {
        return "Create 100 classes";
    }

    @Override
    public String getHomework() {
        return homeworkService.getMessage();
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }


}