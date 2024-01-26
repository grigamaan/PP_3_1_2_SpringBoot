package com.java.web.PP_3_1_2_SpringBoot.repository;

import com.java.web.PP_3_1_2_SpringBoot.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}