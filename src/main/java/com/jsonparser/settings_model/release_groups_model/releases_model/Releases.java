package com.jsonparser.settings_model.release_groups_model.releases_model;

import com.jsonparser.settings_model.release_groups_model.releases_model.sprints_model.Sprints;

import java.util.List;

public class Releases {
    private String name;
    private String length;
    private String startDateOffset;
    private List<Sprints> sprints;

    @Override
    public String toString() {
        return "{\"Releases\":{"
                + "\"name\":\"" + name + "\""
                + ", \"length\":\"" + length + "\""
                + ", \"startDateOffset\":\"" + startDateOffset + "\""
                + ", \"sprints\":" + sprints
                + "}}";
    }
}
