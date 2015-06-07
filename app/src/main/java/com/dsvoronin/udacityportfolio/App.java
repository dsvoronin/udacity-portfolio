package com.dsvoronin.udacityportfolio;

public class App {
    private final String title;
    private final Action action;

    public App(String title, Action action) {
        this.title = title;
        this.action = action;
    }

    public String getTitle() {
        return title;
    }

    public Action getAction() {
        return action;
    }
}
