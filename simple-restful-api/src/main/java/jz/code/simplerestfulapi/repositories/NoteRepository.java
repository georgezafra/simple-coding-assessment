package jz.code.simplerestfulapi.repositories;

import jz.code.simplerestfulapi.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

//interface that defines noterepository that is inheriting all CRUD methods from jpa nhibernate
//because of the inheritance there is no need to explicitly define anything here.
public interface NoteRepository extends JpaRepository<Note, Long> {
}
