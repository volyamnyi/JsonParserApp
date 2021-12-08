package com.jsonparser.settings_model.projects_model.common_objects.report_files_model;

public class ReportFiles {
    private String fileLocation;
    private Long startDateOffset;

    @Override
    public String toString() {
        return "{\"ReportFiles\":{"
                + "\"fileLocation\":\"" + fileLocation + "\""
                + ", \"startDateOffset\":\"" + startDateOffset + "\""
                + "}}";
    }
}
