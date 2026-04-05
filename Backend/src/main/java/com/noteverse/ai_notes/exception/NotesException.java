package com.noteverse.ai_notes.exception;

import org.apache.logging.log4j.message.Message;

public class NotesException extends RuntimeException {

    public NotesException(String msg) {
        super(msg);
    }
}
