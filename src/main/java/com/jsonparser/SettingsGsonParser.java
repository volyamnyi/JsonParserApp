package com.jsonparser;

import com.google.gson.Gson;
import com.jsonparser.models.Settings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SettingsGsonParser {
    private Settings settings;
    private Gson gson;
        public SettingsGsonParser() {
            gson = new Gson();
            try(FileReader reader = new FileReader("settings.json")) {
               this.settings = gson.fromJson(reader,Settings.class);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    public Settings getSettings(){
            return settings;
    }
}

