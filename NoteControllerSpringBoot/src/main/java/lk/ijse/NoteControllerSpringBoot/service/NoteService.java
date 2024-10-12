package lk.ijse.NoteControllerSpringBoot.service;



import lk.ijse.NoteControllerSpringBoot.dto.NoteStatus;
import lk.ijse.NoteControllerSpringBoot.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {
    void saveNote(NoteDTO noteDTO);
    List<NoteDTO> getAllNotes();
    NoteStatus getNote(String noteId);
    void deleteNote(String noteId);
    void updateNote(String noteId, NoteDTO noteDTO);
}
