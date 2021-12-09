package com.jsonparser.models.release_groups.releases.sprints;

public class Sprints {
    private String name;
    private String length;
    private String startDateOffset;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(String startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    @Override
    public String toString() {
        return "{\"Sprints\":{"
                + "\"name\":\"" + name + "\""
                + ", \"length\":\"" + length + "\""
                + ", \"startDateOffset\":\"" + startDateOffset + "\""
                + "}}";
    }
}
