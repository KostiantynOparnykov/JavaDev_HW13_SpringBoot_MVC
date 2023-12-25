package com.example.JavaDev_HW13_SpringBoot_MVC.noteprocessor.exceptions;

public class NoteProcessingExceptions extends Exception{
    public NoteProcessingExceptions(Long id){
        super("Note not found " + id );
    }
}
