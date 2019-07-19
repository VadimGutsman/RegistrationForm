package controller;

import model.Address;
import model.Note;
import view.Messages;
import view.View;

import java.util.Scanner;

import static controller.Regex.*;

public class InputData {
    private Scanner sc;
    private View view;

    private String name;
    private String surName;
    private String patronymic;
    private String nickname;
    private String comment;
    private String homePhoneNumber;
    private String firstMobileNumber;
    private String secondMobileNumber;
    private String email;
    private String skype;

    private String postalCode;
    private String cityName;
    private String streetName;
    private String flatNumber;
    private String houseNumber;

    public InputData(Scanner sc, View view) {
        this.sc = sc;
        this.view = view;
    }

    public void createData() {
        UtilityController utilityController = new UtilityController(sc,view);

        this.name =
                utilityController.checkStringValue
                        (Messages.INPUT_NAME_DATA, NAME_LAT);
        this.surName =
                utilityController.checkStringValue
                        (Messages.INPUT_SURNAME_DATA, SURNAME_LAT);
        this.patronymic =
                utilityController.checkStringValue
                        (Messages.INPUT_PATRONYMIC_DATA, PATRONYMIC_LAT);
        this.nickname =
                utilityController.checkStringValue
                        (Messages.INPUT_NICKNAME_DATA, NICKNAME);
        this.comment =
                utilityController.checkStringValue
                        (Messages.INPUT_COMMENT_DATA, COMMENT);
        this.homePhoneNumber =
                utilityController.checkStringValue
                        (Messages.INPUT_HOME_PHONE_NUMBER_DATA, HOME_PHONE_NUMBER);
        this.firstMobileNumber =
                utilityController.checkStringValue
                        (Messages.INPUT_FIRST_MOBILE_NUMBER_DATA, FIRST_MOBILE_NUMBER);
        this.secondMobileNumber =
                utilityController.checkStringValue
                        (Messages.INPUT_SECOND_MOBILE_NUMBER_DATA, SECOND_MOBILE_NUMBER);
        this.email =
                utilityController.checkStringValue
                        (Messages.INPUT_EMAIL_DATA, EMAIL);
        this.skype =
                utilityController.checkStringValue
                        (Messages.INPUT_SKYPE_DATA, SKYPE);
        this.postalCode =
                utilityController.checkStringValue
                        (Messages.INPUT_POSTAL_CODE_DATA, POSTAL_CODE);
        this.cityName =
                utilityController.checkStringValue
                        (Messages.INPUT_CITY_NAME_DATA, CITY_NAME_LAT);
        this.streetName =
                utilityController.checkStringValue
                        (Messages.INPUT_STREET_NAME_DATA, STREET_NAME_LAT);
        this.flatNumber =
                utilityController.checkStringValue
                        (Messages.INPUT_FLAT_NUMBER_DATA, FLAT_NUMBER);
        this.houseNumber =
                utilityController.checkStringValue
                        (Messages.INPUT_HOUSE_NUMBER_DATA, HOUSE_NUMBER);
    }

    public Note createNote() {
        Note note = new Note();

        note.setName(name);
        note.setSurName(surName);
        note.setPatronymic(patronymic);
        note.concatSurnameAndName();
        note.setNickname(nickname);
        note.setComment(comment);
        note.setHomePhoneNumber(homePhoneNumber);
        note.setFirstMobileNumber(firstMobileNumber);
        note.setSecondMobileNumber(secondMobileNumber);
        note.setEmail(email);
        note.setSkype(skype);
        note.setAddress(createAddress());
        note.concatWholeAddress();

        return note;
    }

    private Address createAddress() {
        Address address = new Address();

        address.setPostalCode(postalCode);
        address.setCityName(cityName);
        address.setStreetName(streetName);
        address.setFlatNumber(flatNumber);
        address.setHouseNumber(houseNumber);

        return address;
    }
}
