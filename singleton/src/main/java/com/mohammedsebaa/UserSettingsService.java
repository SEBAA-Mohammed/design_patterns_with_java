package com.mohammedsebaa;

public class UserSettingsService {
    private Configuration config;

    public UserSettingsService() {
        this.config = Configuration.getInstance();
    }

    public void setUserTheme(String theme) {
        config.setConfig("user.theme", theme);
    }

    public String getUserTheme() {
        return config.getConfig("user.theme");
    }

    public void setUserLanguage(String language) {
        config.setConfig("user.language", language);
    }

    public String getUserLanguage() {
        return config.getConfig("user.language");
    }
}