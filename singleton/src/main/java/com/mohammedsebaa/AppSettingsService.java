package com.mohammedsebaa;

public class AppSettingsService {
    private Configuration config;

    public AppSettingsService() {
        this.config = Configuration.getInstance();
    }

    public void setAppVersion(String version) {
        config.setConfig("app.version", version);
    }

    public String getAppVersion() {
        return config.getConfig("app.version");
    }

    public void setAppName(String name) {
        config.setConfig("app.name", name);
    }

    public String getAppName() {
        return config.getConfig("app.name");
    }
}