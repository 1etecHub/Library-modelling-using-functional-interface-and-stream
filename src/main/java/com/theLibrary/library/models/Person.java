package com.theLibrary.library.models;

import com.theLibrary.library.enums.Role;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    private String name;
    private Role role;
    private String bookRequestTitle;


    public Person(String name, Role role, String bookRequestTitle) {
        this.name = name;
        this.role = role;
        this.bookRequestTitle = bookRequestTitle;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getBookRequestTitle() {
        return bookRequestTitle;
    }

    public void setBookRequestTitle(String bookRequestTitle) {
        this.bookRequestTitle = bookRequestTitle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", bookRequestTitle='" + bookRequestTitle + '\'' +
                '}';
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getRole().compareTo(o2.getRole());
    }

}
