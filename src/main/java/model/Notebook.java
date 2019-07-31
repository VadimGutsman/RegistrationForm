package model;

import model.entity.Note;
import model.services.NotUniqueNicknameException;

import java.util.LinkedList;
import java.util.List;

import static view.Messages.NOT_UNIQUE_NICKNAME;

public class Notebook {
    private List<Note> notes;

    Notebook() {
        this.notes = new LinkedList<>();
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNewNote(Note newNote) throws NotUniqueNicknameException {
        for (Note note: notes) {
            if (note.getNickname().equals(newNote.getNickname())){
                throw new NotUniqueNicknameException(NOT_UNIQUE_NICKNAME);
            }
        }
        notes.add(newNote);
    }
}
