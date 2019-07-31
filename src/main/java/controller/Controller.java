package controller;

import model.Notebook;
import model.services.NotUniqueNicknameException;
import view.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private Notebook notebook;

    public Controller(View view, Notebook notebook) {
        this.view = view;
        this.notebook = notebook;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputData in = new InputData(sc,view);
        in.createData();

        while(true) {
            try {
                notebook.setNewNote(in.createNote());
                break;
            } catch (NotUniqueNicknameException e) {
                view.printMessage(e.getMessage());
            }
        }

    }
}
