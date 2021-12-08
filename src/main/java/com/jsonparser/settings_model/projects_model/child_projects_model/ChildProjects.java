package com.jsonparser.settings_model.projects_model.child_projects_model;

import com.jsonparser.settings_model.projects_model.common_objects.report_files_model.ReportFiles;

import java.util.List;

public class ChildProjects {
    private String name;
    private String releaseGroup;
    private List<ReportFiles> reportFiles;
    private List<ChildProjects> childProjects;

    @Override
    public String toString() {
        return "{\"ChildProjects\":{"
                + "\"name\":\"" + name + "\""
                + ", \"releaseGroup\":\"" + releaseGroup + "\""
                + ", \"reportFiles\":" + reportFiles
                + ", \"childProjects\":" + childProjects
                + "}}";
    }
}
