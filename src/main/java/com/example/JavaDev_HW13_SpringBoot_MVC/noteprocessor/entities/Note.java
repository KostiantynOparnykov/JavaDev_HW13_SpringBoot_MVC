package com.example.JavaDev_HW13_SpringBoot_MVC.noteprocessor.entities;

import lombok.Data;

@Data
public class Note {
    private Long id;
    private String title;
    private String content;
}
