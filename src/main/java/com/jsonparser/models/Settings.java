package com.jsonparser.models;

import com.jsonparser.models.projects.Projects;
import com.jsonparser.models.release_groups.ReleaseGroups;

import java.util.List;

public class Settings {
    private List<ReleaseGroups> releaseGroups;
    private List<Projects> projects;

    public List<ReleaseGroups> getReleaseGroups() {
        return releaseGroups;
    }

    public void setReleaseGroups(List<ReleaseGroups> releaseGroups) {
        this.releaseGroups = releaseGroups;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "{\"Settings\":{"
                + "\"releaseGroups\":" + releaseGroups
                + ", \"projects\":" + projects
                + "}}";
    }
}
