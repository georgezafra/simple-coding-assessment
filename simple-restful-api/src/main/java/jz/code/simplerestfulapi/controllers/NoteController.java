package jz.code.simplerestfulapi.controllers;

import jz.code.simplerestfulapi.domain.Note;
import jz.code.simplerestfulapi.service.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//this is the controller that manages all http requests to the api
//it uses dependency injection via interface and its constructor through spring boot
//it depends on noteservice which is injected on its constructor
@RestController
@RequestMapping(NoteController.BASE_URL)
public class NoteController {

    public static final String BASE_URL = "/api/notes";

    private final NoteService noteService;

    public NoteController(NoteService noteService){
        this.noteService = noteService;
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.findAllNotes();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id){
        return noteService.findNoteById(id);
    }

    //TODO: was not able to make this method work, when called it always executes getAllNotes()
    @RequestMapping(value="/notes")
    @ResponseBody
    public Note getNoteByBody(@RequestParam("query") String body){
       return noteService.findNoteByBody(body);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Note createNote(@RequestBody Note note){
        return noteService.saveNote(note);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Note updateNote(@RequestBody Note note){
        return noteService.updateNote(note);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.GONE)
    public void DeleteNote(@RequestBody Note note){
        noteService.deleteNote(note);
    }
}
