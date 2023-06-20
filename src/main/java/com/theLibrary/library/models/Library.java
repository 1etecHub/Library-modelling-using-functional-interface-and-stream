package com.theLibrary.library.models;


import java.util.*;

public class Library  {
    List<Book> bookList;
     Queue<Person> personQueue;

    public Library(List<Book> bookList, Queue<Person> personQueue) {
        this.bookList = bookList;
        this.personQueue = personQueue;
    }

    public Library() {
        bookList = new ArrayList<>();
        personQueue = new LinkedList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Queue<Person> getPersonQueue() {
        return personQueue;
    }

    public void setPersonQueue(Queue<Person> personQueue) {
        this.personQueue = personQueue;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + bookList +
                ", personQueue=" + personQueue +
                '}';
    }
}
