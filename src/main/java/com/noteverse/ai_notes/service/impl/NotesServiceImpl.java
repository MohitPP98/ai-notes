package com.noteverse.ai_notes.service.impl;

import com.noteverse.ai_notes.entity.Notes;
import com.noteverse.ai_notes.repository.NotesRepository;
import com.noteverse.ai_notes.service.NotesService;
import org.springframework.stereotype.Service;

@Service
public class NotesServiceImpl implements NotesService {
    private final NotesRepository notesRepository;

    public NotesServiceImpl(NotesRepository notesRepository ){
        this.notesRepository = notesRepository;
    }


    @Override
    public Notes saveNotes(Notes notes) {
        return notesRepository.save(notes);
    }
}
