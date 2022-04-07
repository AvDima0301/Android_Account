package com.example.example;

public class Account {
    private String Email;
    private String FName;
    private String SName;
    private String Photo;
    private String Phone;
    private String Password;

    public Account() {}

    public Account(String email, String FName, String SName, String photo, String phone, String password) {
        Email = email;
        this.FName = FName;
        this.SName = SName;
        Photo = photo;
        Phone = phone;
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

}
