package model;

import java.util.LinkedList;
import java.util.List;

public class Notebook {
    private List<Note> notes;

    Notebook() {
        this.notes = new LinkedList<>();
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNewNote(Note note) {
        notes.add(note);
    }
}
