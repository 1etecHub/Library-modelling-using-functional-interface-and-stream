package com.theLibrary.library.models;

public class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
