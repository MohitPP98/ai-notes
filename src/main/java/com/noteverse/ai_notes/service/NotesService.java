package com.noteverse.ai_notes.service;

import com.noteverse.ai_notes.dto.NotesRequestDTO;
import com.noteverse.ai_notes.dto.NotesResponseDTO;
import com.noteverse.ai_notes.entity.Notes;

public interface NotesService {

     NotesResponseDTO saveNotes(NotesRequestDTO notesRequestDTO);
}
