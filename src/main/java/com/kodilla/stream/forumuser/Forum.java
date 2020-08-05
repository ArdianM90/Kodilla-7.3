package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    //konstruktor
    public Forum() {
        this.userList.add(new ForumUser("001", "ArdianM", 'M', LocalDate.of(1990, 5, 15), 600));
        this.userList.add(new ForumUser("002", "SmalecK", 'M', LocalDate.of(1999, 7, 2), 500));
        this.userList.add(new ForumUser("003", "Kuska", 'M', LocalDate.of(2005, 2, 20), 450));
        this.userList.add(new ForumUser("004", "Anna", 'F', LocalDate.of(1999, 5, 19), 1450));
        this.userList.add(new ForumUser("005", "Kinia", 'F', LocalDate.of(2000, 12, 19), 751));
        this.userList.add(new ForumUser("005", "Lena", 'F', LocalDate.of(1991, 4, 14), 141));
        this.userList.add(new ForumUser("006", "NoName1", 'M', LocalDate.of(1990, 5, 15), 0));
        this.userList.add(new ForumUser("007", "NoName2", 'F', LocalDate.of(1991, 4, 14), 0));
    }

    //gettery
    public List<ForumUser> getUserList() {
        return userList;
    }
}
