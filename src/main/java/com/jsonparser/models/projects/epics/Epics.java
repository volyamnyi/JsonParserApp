package com.jsonparser.models.projects.epics;

import java.util.List;

public class Epics {
    private String name;
    private String description;
    private Long sSizes;
    private Long startDateOffset;
    private List<String> releases;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getsSizes() {
        return sSizes;
    }

    public void setsSizes(Long sSizes) {
        this.sSizes = sSizes;
    }

    public Long getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(Long startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    public List<String> getReleases() {
        return releases;
    }

    public void setReleases(List<String> releases) {
        this.releases = releases;
    }

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
