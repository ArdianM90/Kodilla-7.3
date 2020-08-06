package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class ForumUser {
    private final String id;
    private final String login;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsCount;

    //konstruktor
    public ForumUser(String id, String login, char sex, LocalDate birthDate, int postsCount) {
        this.id = id;
        this.login = login;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsCount = postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser "+id+": login-"+login +"; płeć-"+sex+"; data urodzenia-"+birthDate+"; posty-"+postsCount+"; minęło lat od urodzenia: "+this.getBirthDate().until(LocalDate.now(), ChronoUnit.YEARS);
    }

    //gettery
    public String getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public int getPostsCount() {
        return postsCount;
    }
}
