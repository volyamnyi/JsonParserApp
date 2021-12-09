package com.jsonparser;

public class Main {

    public static void main(String[] args) {
    SettingsGsonParser parser = new SettingsGsonParser();
        System.out.println("Settings "+ parser.getSettings().toString());
    }
}
