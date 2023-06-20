package com.theLibrary.library.services;

import com.theLibrary.library.models.Library;
import com.theLibrary.library.models.Person;

import java.util.Queue;
@FunctionalInterface
public interface PersonServices {
    String joinQueue(Person person, Library library);
}
