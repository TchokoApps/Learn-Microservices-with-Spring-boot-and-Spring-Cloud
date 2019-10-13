package com.tchokoapps.springboot.springcloud.userservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Item extends BaseEntity {

    private String name;
    private String status;
    private String description;
    private String itemCodition;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date addDate;

    @ManyToOne
    @JsonIgnore
    private User user;

    public Item() {
    }
}
