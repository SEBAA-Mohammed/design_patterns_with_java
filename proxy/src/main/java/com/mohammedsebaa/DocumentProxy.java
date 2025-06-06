package com.mohammedsebaa;

import java.time.LocalDateTime;

public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String title;
    private String filePath;
    private User user;
    private int niveauRequis;

    public DocumentProxy(String title, String filePath, User user, int niveauRequis) {
        this.title = title;
        this.filePath = filePath;
        this.user = user;
        this.niveauRequis = niveauRequis;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContent() {
        if (user.getNiveauAcces() >= niveauRequis) {
            if (realDocument == null) {
                realDocument = new RealDocument(title, filePath);
            }
            logAccess(true);
            return realDocument.getContent();
        } else {
            logAccess(false);
            return "Accès refusé au document : droits insuffisants.";
        }
    }

    private void logAccess(boolean success) {
        String status = success ? "SUCCÈS" : "ÉCHEC";
        System.out.println(LocalDateTime.now() + " | Utilisateur: " + user.getNom() + " | Document: " + title
                + " | Accès: " + status);
    }
}
