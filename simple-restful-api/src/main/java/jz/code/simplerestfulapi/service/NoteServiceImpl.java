package jz.code.simplerestfulapi.service;

import jz.code.simplerestfulapi.domain.Note;
import jz.code.simplerestfulapi.repositories.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//implementation of the noteservice
//it uses dependency injection via interface and constructor through spring boot
//it depends on noterepository which is injected on its constructor
@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    @Override
    public Note findNoteById(Long id) {
        return (Note) noteRepository.findById(id).get();
    }

    //TODO: This implementation is not correct. This was just for debugging purposes since the method was never
    //executed when calling the GET endpoint with the query parameter
    @Override
    public Note findNoteByBody(String body) {
        return (Note) noteRepository.findById(1L).get();
    }

    @Override
    public List<Note> findAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note updateNote(Note note) {
        Note _note = noteRepository.findById(note.getId()).get();
        _note.setBody(note.getBody());
        return noteRepository.save(_note);
    }

    @Override
    public void deleteNote(Note note) {
        noteRepository.deleteById(note.getId());
    }
}
