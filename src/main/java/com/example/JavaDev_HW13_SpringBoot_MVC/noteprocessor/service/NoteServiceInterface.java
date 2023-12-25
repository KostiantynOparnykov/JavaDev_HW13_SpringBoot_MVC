package com.example.JavaDev_HW13_SpringBoot_MVC.noteprocessor.service;

import com.example.JavaDev_HW13_SpringBoot_MVC.noteprocessor.entities.Note;
import com.example.JavaDev_HW13_SpringBoot_MVC.noteprocessor.exceptions.NoteProcessingExceptions;

import java.util.List;

public interface NoteServiceInterface {
    List<Note> listAll();
    Note add(Note note);
    void deleteById(Long id) throws NoteProcessingExceptions;
    void update(Note note) throws NoteProcessingExceptions;
    Note getById(Long id) throws NoteProcessingExceptions;
}
