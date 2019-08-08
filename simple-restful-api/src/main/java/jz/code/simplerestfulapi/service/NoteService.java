package jz.code.simplerestfulapi.service;

import jz.code.simplerestfulapi.domain.Note;

import java.util.List;

//interface that defines the noteservice
public interface NoteService {
    Note findNoteById(Long id);
    List<Note> findAllNotes();
    Note saveNote(Note note);
    Note updateNote(Note note);
    void deleteNote(Note note);
    Note findNoteByBody(String body);
}
