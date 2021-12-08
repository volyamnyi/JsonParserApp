package com.jsonparser.settings_model.release_groups_model.releases_model.sprints_model;

public class Sprints {
    private String name;
    private String length;
    private String startDateOffset;

    @Override
    public String toString() {
        return "{\"Sprints\":{"
                + "\"name\":\"" + name + "\""
                + ", \"length\":\"" + length + "\""
                + ", \"startDateOffset\":\"" + startDateOffset + "\""
                + "}}";
    }
}
