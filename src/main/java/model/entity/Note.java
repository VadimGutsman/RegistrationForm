package model.entity;

import model.services.Group;

public class Note {
    private String name;
    private String surName;
    private String patronymic;
    private String surnameAndName;
    private String nickname;
    private String comment;
    private Group group;
    private String homePhoneNumber;
    private String firstMobileNumber;
    private String secondMobileNumber;
    private String email;
    private String skype;
    private Address address;
    private String wholeAddress;
//    private String dateOfCreating;
//    private String dateOfModifying;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public void setFirstMobileNumber(String firstMobileNumber) {
        this.firstMobileNumber = firstMobileNumber;
    }

    public void setSecondMobileNumber(String secondMobileNumber) {
        this.secondMobileNumber = secondMobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void concatWholeAddress() {
        this.wholeAddress = new StringBuilder().append(address.getPostalCode() + " ").
                append(address.getCityName() + " ").append(address.getStreetName() + " ").
                append(address.getStreetName() + " ").append(address.getFlatNumber() + " ").
                append(address.getHouseNumber()).toString();

    }

    public void concatSurnameAndName() {
        this.surnameAndName = new StringBuilder().append(surName + " ").
                append(name.charAt(0) + ".").toString();
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getComment() {
        return comment;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getFirstMobileNumber() {
        return firstMobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public String getWholeAddress() {
        return wholeAddress;
    }

    public String getSurnameAndName() {
        return surnameAndName;
    }

    public String getSecondMobileNumber() {
        return secondMobileNumber;
    }

    public Group getGroup() {
        return group;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
