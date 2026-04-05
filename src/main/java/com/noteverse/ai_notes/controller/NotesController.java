package com.noteverse.ai_notes.controller;


import com.noteverse.ai_notes.dto.NotesRequestDTO;
import com.noteverse.ai_notes.dto.NotesResponseDTO;
import com.noteverse.ai_notes.entity.Notes;
import com.noteverse.ai_notes.service.NotesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notes")
public class NotesController {

    private final NotesService notesService;

    public NotesController(NotesService notesService) {
        this.notesService = notesService;
    }

    @PostMapping
    public ResponseEntity<NotesResponseDTO> saveNotes(@RequestBody NotesRequestDTO notesRequestDTO){
        return ResponseEntity.ok(notesService.saveNotes(notesRequestDTO));
    }
}
