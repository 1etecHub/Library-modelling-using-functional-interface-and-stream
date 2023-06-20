package com.theLibrary.library.servicesImplementation;

import com.theLibrary.library.enums.Role;
import com.theLibrary.library.models.Book;
import com.theLibrary.library.models.Library;
import com.theLibrary.library.models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class LibrarianServicesImpTest {
    LibrarianServicesImp librarianServicesImp;
    PriorityQueue<Person> personQueue;
    Book book1
    Library library;
    @BeforeEach
    void setUp() {
        librarianServicesImp = new LibrarianServicesImp();
        personQueue = new PriorityQueue<>(Comparator.comparing(Person::getRole));
        book1 = new Book("intro to java", "Kotlin", 3);
        library = new Library();
        librarianServicesImp.addBooks(book1, library);
    }

    @Test
    void addBooks() {
        String actual = librarianServicesImp.addBooks(book1,library);
    }

    @Test
    void issueBook() {
    }

    @Test
    void reduceBook() {
    }
}
