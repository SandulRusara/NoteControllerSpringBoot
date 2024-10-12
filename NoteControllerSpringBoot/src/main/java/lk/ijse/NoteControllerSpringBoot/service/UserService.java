package lk.ijse.NoteControllerSpringBoot.service;


import lk.ijse.NoteControllerSpringBoot.dto.UserStatus;
import lk.ijse.NoteControllerSpringBoot.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserStatus getUser(String userId);
    void deleteUser(String userId);
    void updateUser(String userId, UserDTO userDTO);
}
