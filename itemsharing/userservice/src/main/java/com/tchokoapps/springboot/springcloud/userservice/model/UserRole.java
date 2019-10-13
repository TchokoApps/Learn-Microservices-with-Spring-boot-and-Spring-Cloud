package com.tchokoapps.springboot.springcloud.userservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserRole extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    public UserRole() {
    }

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }
}
