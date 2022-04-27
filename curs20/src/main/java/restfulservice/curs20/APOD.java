package restfulservice.curs20;

import com.fasterxml.jackson.annotation.JsonProperty;

public class APOD {

    public final String albums;
    public final String totalCount;

    public APOD(@JsonProperty("albums") String albums,
                @JsonProperty("totalCount") String totalCount) {
        this.albums = albums;
        this.totalCount = totalCount;

    }
}
