package com.theLibrary.library;

import com.theLibrary.library.comparators.ComparePeople;
import com.theLibrary.library.enums.Role;
import com.theLibrary.library.models.Book;
import com.theLibrary.library.models.Library;
import com.theLibrary.library.models.Person;
import com.theLibrary.library.comparators.TitleComparator;
import com.theLibrary.library.services.PersonServices;
import com.theLibrary.library.servicesImplementation.LibrarianServicesImp;
import com.theLibrary.library.servicesImplementation.PersonServicesImp;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {

		Library library = new Library();

		LibrarianServicesImp librarianServicesImp = new LibrarianServicesImp();
		Book book1 = new Book("Java Concept", "Eben", 1);
		Book book2 = new Book("Intro to java", "Eben", 1);

		librarianServicesImp.addBooks(book1, library);
		librarianServicesImp.addBooks(book2, library);
		System.out.println(library.getBookList());
		System.out.println("========================");


		PersonServicesImp personServicesImp = new PersonServicesImp();

		Person person1 = new Person("Pelzman", Role.SENIOR_STUDENT, "Intro to java");
		Person person2 = new Person("ubong", Role.TEACHER, "Java Concept");
		Person person3 = new Person("nosa", Role.JUNIOR_STUDENT, "Java Concept");
		Person person4 = new Person("bello", Role.TEACHER, "Intro to java");
		Person person5 = new Person("felix", Role.JUNIOR_STUDENT, "Java Concept");


		personServicesImp.joinQueue(person1, library);
		personServicesImp.joinQueue(person2, library);
		personServicesImp.joinQueue(person3, library);
		personServicesImp.joinQueue(person4, library);
		personServicesImp.joinQueue(person5, library);

		System.out.println(library.getPersonQueue());
		System.out.println("=========================");

		//THE FIRST COME FIRST SERVE IMPLEMENTATION USING COMPARATOR AND PRIORITY QUEUE
//		PriorityQueue<Person> listOfPerson = new PriorityQueue<>(Comparator.comparing(Person::getRole));
//		listOfPerson.addAll(library.getPersonQueue());
//		library.setPersonQueue(listOfPerson);
//		System.out.println(library.getPersonQueue());
//		System.out.println("=========================");

			System.out.println(librarianServicesImp.issueBook(library.getPersonQueue(), library));

			//library.getPersonQueue().poll();
		}
	}

