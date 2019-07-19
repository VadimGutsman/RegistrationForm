package controller;

import view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner sc;
    private View view;

    public UtilityController(Scanner sc, View view) {
        this.sc = sc;
        this.view = view;
    }

    public String checkStringValue(String message, String regex) {
        String input;
        view.printStringInput(message);
        while (!(sc.hasNext() && (input = sc.nextLine()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return input;
    }
}
