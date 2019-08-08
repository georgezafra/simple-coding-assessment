package jz.code.simplerestfulapi.bootstrap;

import jz.code.simplerestfulapi.domain.Note;
import jz.code.simplerestfulapi.repositories.NoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//This is a way to add notes to an in memory h2 database
//it uses dependency injection via interface through its constructor
// and wired by spring boot
//it depends on noteservice
@Component
public class BootStrapData implements CommandLineRunner {

    private final NoteRepository noteRepository;

    public BootStrapData(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Note Data");

        Note n1 = new Note();
        n1.setBody("Today is a great day");
        noteRepository.save(n1);

        Note n2 = new Note();
        n2.setBody("Today is so awesome");
        noteRepository.save(n2);

        Note n3 = new Note();
        n3.setBody("Today is so cool");
        noteRepository.save(n3);

    }
}
