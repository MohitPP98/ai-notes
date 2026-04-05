package com.noteverse.ai_notes.dto;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class NotesRequestDTO {
    @NotNull
    private String videoUrl;
    @NotNull
    private String content;
}
