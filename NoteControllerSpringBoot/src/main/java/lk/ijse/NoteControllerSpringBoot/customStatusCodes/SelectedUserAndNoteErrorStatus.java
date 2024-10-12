package lk.ijse.NoteControllerSpringBoot.customStatusCodes;


import lk.ijse.NoteControllerSpringBoot.dto.NoteStatus;
import lk.ijse.NoteControllerSpringBoot.dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserAndNoteErrorStatus implements UserStatus, NoteStatus {
    private int statusCode;
    private String statusMessage;
}
