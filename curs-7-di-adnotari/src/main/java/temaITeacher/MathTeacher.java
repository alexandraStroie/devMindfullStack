package temaITeacher;

import org.springframework.stereotype.Component;

@Component("mathTeacher")
public class MathTeacher implements ITeacher{

    private WisdomWordsService wisdomService;
    private static final String MATH_TEACHER_PREFIX = "Math teacher says: ";

    @Override
    public String getWisdom() {
        return MATH_TEACHER_PREFIX + wisdomService.getMessage();
    }

    public void setWisdomService(WisdomWordsService wisdomSevice) {
        this.wisdomService = wisdomSevice;
    }


}
