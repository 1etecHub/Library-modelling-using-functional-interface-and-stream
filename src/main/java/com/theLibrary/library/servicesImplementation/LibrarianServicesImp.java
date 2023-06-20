package com.theLibrary.library.servicesImplementation;

import com.theLibrary.library.models.Book;
import com.theLibrary.library.models.Library;
import com.theLibrary.library.models.Person;
import com.theLibrary.library.services.LibrarianServices;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LibrarianServicesImp implements LibrarianServices {
    @Override
    public String addBooks(Book book, Library library) {
        library.getBookList().add(book);

        return null;
    }

    @Override
    public String giveBook(Queue<Person> personQueue,List<Book> bookList, Library library) {
        int size = library.getPersonQueue().size();
        for (Book books : library.getBookList()) {

            for (int x = 0; x < size; x++) {
                if (library.getPersonQueue().contains(books.getTitle()) == library.getBookList().contains(books.getTitle()) &&
                        books.getQuantity() > 0) {

                    System.out.println("the person " + library.getPersonQueue().peek().getName() + " gets the book: " +
                            library.getPersonQueue().peek().getBookRequestTitle());
                    library.getPersonQueue().poll();

                    System.out.println("available people in queue: " + library.getPersonQueue());
                    System.out.println("================================");

                    books.setQuantity(books.getQuantity() - 1);


                } else {
                    System.out.println("Sorry there is no book available at the moment");
                }
            }

        }

        return null;
    }

    @Override
    public String issueBook(Queue<Person> personQueue,  Library library) {

        while (!personQueue.isEmpty()) {
            Person currentPerson = personQueue.peek();
            boolean check = library.getBookList().stream()
                    .anyMatch(book -> book.getTitle().equals(currentPerson.getBookRequestTitle())
                            && book.getQuantity() > 0);
            if (check) {
                reduceBook(library);
                System.out.println("The person " + currentPerson.getName() + " gets the book: " + currentPerson.getBookRequestTitle());
                personQueue.poll();
            } else {
                System.out.println("The book " + currentPerson.getBookRequestTitle() + " is currently not available for " + currentPerson.getName());
                personQueue.poll(); // Remove the person from the queue even if the book is not available
            }
        }
        return  "";
    }

        @Override
    public String reduceBook(Library library) {
                Person currentPerson = library.getPersonQueue().peek();
                Predicate<Book> pr = b-> b.getTitle().equals(currentPerson.getBookRequestTitle());
            for(Book book: library.getBookList()) {
                if(pr.test(book)){
                book.setQuantity(book.getQuantity() - 1);}
            }
            return "";
        }
}










                /*library.getBookList().stream()
                        .filter(book -> book.getTitle().equals(currentPerson.getBookRequestTitle()))
                        .forEach(book -> book.setQuantity(book.getQuantity() - 1));
                return "";*/



















        /*Person currentPerson = library.getPersonQueue().peek();
        for(Book book: library.getBookList()){
         if(book.getTitle().equals(currentPerson.getBookRequestTitle())) {


             book.setQuantity(book.getQuantity() - 1);
         }
        }
        return "";
        }*/



