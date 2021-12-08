package com.jsonparser.settings_model.projects_model;

import com.jsonparser.settings_model.projects_model.child_projects_model.ChildProjects;
import com.jsonparser.settings_model.projects_model.common_objects.report_files_model.ReportFiles;
import com.jsonparser.settings_model.projects_model.epics_model.Epics;
import com.jsonparser.settings_model.projects_model.root_causes_model.RootCauses;

import java.util.List;

public class Projects {
    private String name;
    private String releaseGroup;
    private List<ReportFiles> reportFiles;
    private List<ChildProjects> childProjects;
    private List<RootCauses> rootCauses;
    private List<Epics> epics;

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
