package com.example.craigspetitions;

import java.util.ArrayList;
import java.util.List;

public class Petition {

    private String title;
    private String description;
    private List<String> signatures = new ArrayList<>();

    public Petition(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void addSignature(String name) {
        signatures.add(name);
    }
}
