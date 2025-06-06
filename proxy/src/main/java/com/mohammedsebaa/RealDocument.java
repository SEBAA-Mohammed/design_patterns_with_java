package com.mohammedsebaa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RealDocument implements Document {
    private String title;
    private String content;
    private String filePath;

    public RealDocument(String title, String filePath) {
        this.title = title;
        this.filePath = filePath;
        loadContent();
    }

    private void loadContent() {
        try {
            this.content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            this.content = "Erreur lors du chargement du document.";
        }
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContent() {
        return content;
    }
}
