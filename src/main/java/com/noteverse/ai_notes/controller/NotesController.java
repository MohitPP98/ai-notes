package com.noteverse.ai_notes.controller;


import com.noteverse.ai_notes.dto.NotesRequestDTO;
import com.noteverse.ai_notes.entity.Notes;
import com.noteverse.ai_notes.service.NotesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notes")
public class NotesController {

    private final NotesService notesService;

    public NotesController(NotesService notesService) {
        this.notesService = notesService;
    }

    @PostMapping
    public Notes saveNotes(@RequestBody NotesRequestDTO notesRequestDTO){
        Notes notes = new Notes();
        notes.setVideoUrl(notesRequestDTO.getVideoUrl());
        notes.setContent(notesRequestDTO.getContent());
        return notesService.saveNotes(notes);
    }
}
