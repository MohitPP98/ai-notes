package com.noteverse.ai_notes.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="notes")
@Data
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String videoUrl;

    @Column(length = 100000)
    private String content;
}
