package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        // Initialize services
        UserSettingsService userSettings = new UserSettingsService();
        AppSettingsService appSettings = new AppSettingsService();

        // Configure application settings
        appSettings.setAppName("Mon Application");
        appSettings.setAppVersion("1.0.0");

        // Configure user settings
        userSettings.setUserTheme("dark");
        userSettings.setUserLanguage("fr");

        // Display configurations
        System.out.println("=== Configuration de l'application ===");
        System.out.println("Nom de l'application: " + appSettings.getAppName());
        System.out.println("Version: " + appSettings.getAppVersion());

        System.out.println("\n=== Configuration de l'utilisateur ===");
        System.out.println("Thème: " + userSettings.getUserTheme());
        System.out.println("Langue: " + userSettings.getUserLanguage());

        // Démonstration du Singleton
        Configuration config1 = Configuration.getInstance();
        Configuration config2 = Configuration.getInstance();
        System.out.println("\n=== Démonstration du Singleton ===");
        System.out.println("Les instances sont identiques: " + (config1 == config2));
    }
}