package com.jsonparser.settings_model.projects_model.epics_model;

import java.util.List;

public class Epics {
    private String name;
    private String description;
    private Long sSizes;
    private Long startDateOffset;
    private List<String> releases;

    @Override
    public String toString() {
        return "{\"Epics\":{"
                + "\"name\":\"" + name + "\""
                + ", \"description\":\"" + description + "\""
                + ", \"sSizes\":\"" + sSizes + "\""
                + ", \"startDateOffset\":\"" + startDateOffset + "\""
                + ", \"releases\":" + releases
                + "}}";
    }
}
