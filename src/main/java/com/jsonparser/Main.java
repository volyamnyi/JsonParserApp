package com.jsonparser;

import com.jsonparser.settings_model.Settings;

public class Main {


    public static void main(String[] args) {
    SettingsGsonParser parser = new SettingsGsonParser();
        Settings settings = parser.parse();
        System.out.println("Settings "+ settings.toString());
    }
}
