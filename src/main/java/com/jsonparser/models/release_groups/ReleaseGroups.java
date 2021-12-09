package com.jsonparser.models.release_groups;

import com.jsonparser.models.release_groups.releases.Releases;

import java.util.List;

public class ReleaseGroups {
    private String name;
    private List<Releases> releases;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Releases> getReleases() {
        return releases;
    }

    public void setReleases(List<Releases> releases) {
        this.releases = releases;
    }

    @Override
    public String toString() {
        return "{\"ReleaseGroups\":{"
                + "\"name\":\"" + name + "\""
                + ", \"releases\":" + releases
                + "}}";
    }
}
