package com.example.curs15restapijson.course;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProgrammingLangs {
    @JsonProperty("lang_name")
    private String name;
    private String description;
}
