package com.noteverse.ai_notes.service.impl;

import com.noteverse.ai_notes.dto.NotesRequestDTO;
import com.noteverse.ai_notes.dto.NotesResponseDTO;
import com.noteverse.ai_notes.entity.Notes;
import com.noteverse.ai_notes.exception.NotesException;
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
    public NotesResponseDTO saveNotes(NotesRequestDTO notesRequestDTO) {

        if (notesRequestDTO.getContent() == null) {
            throw new NotesException("Content cannot be null");
        }

        Notes notes = new Notes();

        notes.setVideoUrl(notesRequestDTO.getVideoUrl());
        notes.setContent(notesRequestDTO.getContent());

        Notes savedNotes = notesRepository.save(notes);

        return new NotesResponseDTO(savedNotes.getId(), savedNotes.getVideoUrl(), savedNotes.getContent());
    }
}
