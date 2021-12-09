package com.jsonparser.models.projects;

import com.jsonparser.models.projects.common_models.report_files.ReportFiles;
import com.jsonparser.models.projects.epics.Epics;
import com.jsonparser.models.projects.root_causes.RootCauses;

import java.util.List;

public class Projects {
    private String name;
    private String releaseGroup;
    private List<ReportFiles> reportFiles;
    private List<Projects> childProjects;
    private List<RootCauses> rootCauses;
    private List<Epics> epics;

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

    public List<Projects> getChildProjects() {
        return childProjects;
    }

    public void setChildProjects(List<Projects> childProjects) {
        this.childProjects = childProjects;
    }

    public List<RootCauses> getRootCauses() {
        return rootCauses;
    }

    public void setRootCauses(List<RootCauses> rootCauses) {
        this.rootCauses = rootCauses;
    }

    public List<Epics> getEpics() {
        return epics;
    }

    public void setEpics(List<Epics> epics) {
        this.epics = epics;
    }

    @Override
    public String toString() {
        return "{\"Projects\":{"
                + "\"name\":\"" + name + "\""
                + ", \"releaseGroup\":\"" + releaseGroup + "\""
                + ", \"reportFiles\":" + reportFiles
                + ", \"childProjects\":" + childProjects
                + ", \"rootCauses\":" + rootCauses
                + ", \"epics\":" + epics
                + "}}";
    }
}
