package com.app.ecom.service;

import com.app.ecom.model.UserDTO;
import com.app.ecom.model.UserResponse;

public interface UserService {

    UserDTO registerUser(UserDTO userDto);

    UserResponse getAllUsers(Integer pageNumber,Integer pageSize, String sortBy, String sortOrder);

    UserDTO getUserById(Long userId);

    UserDTO updateUser(Long userId, UserDTO userDTO);

    String deleteUser(Long UserId);
}
