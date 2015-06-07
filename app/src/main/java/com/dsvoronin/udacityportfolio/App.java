package com.dsvoronin.udacityportfolio;

public class App {
    private final String title;
    private final Action action;
    private final boolean important;

    public App(String title, Action action) {
        this.title = title;
        this.action = action;
        this.important = false;
    }

    public App(String title, Action action, boolean important) {
        this.title = title;
        this.action = action;
        this.important = important;
    }

    public String getTitle() {
        return title;
    }

    public Action getAction() {
        return action;
    }

    public boolean isImportant() {
        return important;
    }
}
