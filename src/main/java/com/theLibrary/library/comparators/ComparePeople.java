package com.theLibrary.library.comparators;

import com.theLibrary.library.models.Person;

import java.util.Comparator;

public class ComparePeople implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getRole().compareTo(o2.getRole());
    }
}
