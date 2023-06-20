package com.theLibrary.library.services;

import com.theLibrary.library.models.Book;
import com.theLibrary.library.models.Library;
import com.theLibrary.library.models.Person;

import java.util.List;
import java.util.Queue;

public interface LibrarianServices {
    String addBooks(Book book, Library library);
    String giveBook(Queue<Person>personQueue, List<Book>bookList, Library library);

    String issueBook(Queue<Person> personQueue, Library library);

    String reduceBook(Library library);





}
