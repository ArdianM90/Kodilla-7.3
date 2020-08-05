package com.kodilla;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        //co to jest?
        //SpringApplication.run(KodillaCourseApplication.class, args);

        //przykład 1 - stream w kolekcjach
        //People.getList().stream().forEach(System.out::println);

        //przykład 2 - operacje transformujące stream
        //People.getList().stream()
                //.map(s -> s.toUpperCase())
                //.forEach(System.out::println);
        //inny sposób (przez referencję) na to samo:
        //People.getList().stream()
                //.map(String::toUpperCase)
                //.forEach(s -> System.out.println(s));

        //przykład 3 - operacje filtrujące stream
        //People.getList().stream()
                //.filter(s -> s.length() > 11)
                //.forEach(System.out::println);

        //przykład 4 - kaskadowe łączenie różnych operacji
        //People.getList().stream()
                //.map(String::toUpperCase)
                //.filter(s -> s.length() > 11)
                //.map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                //.filter(s -> s.substring(0, 1).equals("M"))
                //.forEach(System.out::println);

        //przykład 5 - stream na kolekcjach dowolnych obiektów
        //BookDirectory theBookDirectory = new BookDirectory();
        //theBookDirectory.getList().stream()
                //.filter(book -> book.getYearOfPublication() > 2005)
                //.forEach(System.out::println);

        //przykład 6 - kollektor toList
        //BookDirectory theBookDirectory = new BookDirectory();
        //List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                //.filter(book -> book.getYearOfPublication() > 2005)
                //.collect(Collectors.toList());
        //System.out.println("# elements: " + theResultListOfBooks.size());
        //theResultListOfBooks.stream()
                //.forEach(System.out::println);

        //przykład 7 - kollektor toMap
        //BookDirectory theBookDirectory = new BookDirectory();
        //Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                //.filter(book -> book.getYearOfPublication() > 2005)
                //.collect(Collectors.toMap(Book::getSignature, book -> book));
        //System.out.println("# elements: " + theResultMapOfBooks.size());
        //theResultMapOfBooks.entrySet().stream()
                //.map(entry -> entry.getKey() + ": " + entry.getValue())
                //.forEach(System.out::println);

        //przykład 8 - kollektor joining()
        //BookDirectory theBookDirectory = new BookDirectory();
        //String theResultStringOfBooks = theBookDirectory.getList().stream()
                //.filter(book -> book.getYearOfPublication() > 2005)
                //.map(Book::toString)
                //.collect(Collectors.joining(",\n","<<",">>"));
        //System.out.println(theResultStringOfBooks);

        //ZADANIE
        Forum theForum = new Forum();
        Map<String, ForumUser> reasultListOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'F')
                .filter(user ->  (LocalDate.now().getYear() - user.getBirthDate().getYear()) > 20)
                .filter(user -> user.getPostsCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));
        System.out.println("# elements: " + reasultListOfUsers.size());
        reasultListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}
