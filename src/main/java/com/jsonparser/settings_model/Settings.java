package com.jsonparser.settings_model;

import com.jsonparser.settings_model.projects_model.Projects;
import com.jsonparser.settings_model.release_groups_model.ReleaseGroups;

import java.util.List;

public class Settings {
    private List<ReleaseGroups> releaseGroups;
    private List<Projects> projects;

    @Override
    public String toString() {
        return "{\"Settings\":{"
                + "\"releaseGroups\":" + releaseGroups
                + ", \"projects\":" + projects
                + "}}";
    }
}
