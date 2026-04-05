package com.noteverse.ai_notes.repository;

import com.noteverse.ai_notes.entity.Notes;
import org.springframework.data.repository.CrudRepository;

public interface NotesRepository extends CrudRepository<Notes, Long> {
}
