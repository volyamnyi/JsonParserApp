package com.jsonparser.settings_model.projects_model.root_causes_model;

public class RootCauses {
    private String name;
    private String description;

    @Override
    public String toString() {
        return "{\"RootCauses\":{"
                + "\"name\":\"" + name + "\""
                + ", \"description\":\"" + description + "\""
                + "}}";
    }
}
