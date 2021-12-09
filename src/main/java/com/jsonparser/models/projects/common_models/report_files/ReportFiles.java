package com.jsonparser.models.projects.common_models.report_files;

public class ReportFiles {
    private String fileLocation;
    private Long startDateOffset;

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public Long getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(Long startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    @Override
    public String toString() {
        return "{\"ReportFiles\":{"
                + "\"fileLocation\":\"" + fileLocation + "\""
                + ", \"startDateOffset\":\"" + startDateOffset + "\""
                + "}}";
    }
}
