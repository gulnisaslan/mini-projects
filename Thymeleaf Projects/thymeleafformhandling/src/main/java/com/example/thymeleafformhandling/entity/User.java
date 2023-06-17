package com.example.thymeleafformhandling.entity;

import java.util.Date;
import java.util.Objects;

public class User {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private String profession;
    private boolean married;
    private Date birthday;
    public User() {
    }
    public User(String name, String email, String password, String gender, String note, String profession, boolean married, Date birthday) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.note = note;
        this.profession = profession;
        this.married = married;
        this.birthday = birthday;
    }
   

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public boolean isMarried() {
        return this.married;
    }

    public boolean getMarried() {
        return this.married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User name(String name) {
        setName(name);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User gender(String gender) {
        setGender(gender);
        return this;
    }

    public User note(String note) {
        setNote(note);
        return this;
    }

    public User profession(String profession) {
        setProfession(profession);
        return this;
    }

    public User married(boolean married) {
        setMarried(married);
        return this;
    }

    public User birthday(Date birthday) {
        setBirthday(birthday);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(gender, user.gender) && Objects.equals(note, user.note) && Objects.equals(profession, user.profession) && married == user.married && Objects.equals(birthday, user.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, password, gender, note, profession, married, birthday);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", gender='" + getGender() + "'" +
            ", note='" + getNote() + "'" +
            ", profession='" + getProfession() + "'" +
            ", married='" + isMarried() + "'" +
            ", birthday='" + getBirthday() + "'" +
            "}";
    }

    
    

}
