package com.jsonparser.settings_model.release_groups_model;

import com.jsonparser.settings_model.release_groups_model.releases_model.Releases;

import java.util.List;

public class ReleaseGroups {
    private String name;
    private List<Releases> releases;

    @Override
    public String toString() {
        return "{\"ReleaseGroups\":{"
                + "\"name\":\"" + name + "\""
                + ", \"releases\":" + releases
                + "}}";
    }
}
