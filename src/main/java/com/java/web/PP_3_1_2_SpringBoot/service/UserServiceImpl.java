package com.java.web.PP_3_1_2_SpringBoot.service;

import com.java.web.PP_3_1_2_SpringBoot.model.User;
import com.java.web.PP_3_1_2_SpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl() {

    }

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public List getAllUsers() {
        List list = new ArrayList();
        repository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public Object getUserById(Long id) {
        User user = repository.findById(id).get();
        return user;
    }

    @Transactional
    @Override
    public boolean saveUser(User user) {
        try {
            repository.save(user);
            return true;
        }catch(Exception ex) {
            return false;
        }
    }

    @Transactional
    @Override
    public boolean deleteUserById(Long id) {
        try {
            repository.deleteById(id);
            return true;
        }catch(Exception ex) {
            return false;
        }

    }

}