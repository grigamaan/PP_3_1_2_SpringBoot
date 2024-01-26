package com.java.web.PP_3_1_2_SpringBoot.service;

import java.util.List;
import com.java.web.PP_3_1_2_SpringBoot.model.User;
public interface UserService {

    public List getAllUsers();
    public Object getUserById(Long id);
    public boolean saveUser(User user);
    public boolean deleteUserById(Long id);

}