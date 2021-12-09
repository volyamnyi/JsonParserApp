package com.jsonparser.models.projects.child_projects;

import com.jsonparser.models.projects.common_models.report_files.ReportFiles;

import java.util.List;

public class ChildProjects {
    private String name;
    private String releaseGroup;
    private List<ReportFiles> reportFiles;
    private List<ChildProjects> childProjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseGroup() {
        return releaseGroup;
    }

    public void setReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
    }

    public List<ReportFiles> getReportFiles() {
        return reportFiles;
    }

    public void setReportFiles(List<ReportFiles> reportFiles) {
        this.reportFiles = reportFiles;
    }

    public List<ChildProjects> getChildProjects() {
        return childProjects;
    }

    public void setChildProjects(List<ChildProjects> childProjects) {
        this.childProjects = childProjects;
    }

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
