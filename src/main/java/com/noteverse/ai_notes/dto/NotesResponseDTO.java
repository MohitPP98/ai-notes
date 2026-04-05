package com.noteverse.ai_notes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class NotesResponseDTO {

    private Long id;
    private String videoUrl;
    private String content;
}
