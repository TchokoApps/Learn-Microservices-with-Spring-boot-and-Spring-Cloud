package com.tchokoapps.springboot.springcloud.userservice.ripositories;

import com.tchokoapps.springboot.springcloud.userservice.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
