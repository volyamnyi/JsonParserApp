package com.jsonparser;

import com.google.gson.Gson;
import com.jsonparser.settings_model.Settings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SettingsGsonParser {
    public Settings parse(){

        Gson gson = new Gson();
        try(FileReader reader = new FileReader("src/main/java/com/jsonparser/setting_json/settings.json")) {
            Settings settings = gson.fromJson(reader,Settings.class);
            return settings;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
