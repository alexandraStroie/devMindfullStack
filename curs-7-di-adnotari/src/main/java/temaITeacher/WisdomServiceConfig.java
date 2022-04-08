package temaITeacher;

import org.springframework.stereotype.Component;

public class WisdomServiceConfig {

    public WisdomWordsService wisdomWordsService() {
        return new WisdomWordsService();
    }

}
