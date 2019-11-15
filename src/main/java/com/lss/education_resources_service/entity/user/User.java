package com.lss.education_resources_service.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lss.education_resources_service.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
@JsonIgnoreProperties({"updateTime","password"})
public class User extends BaseEntity implements Serializable {


    private String username;

    private String password;

    private String city;

    @Column(unique = true,length =15)
    private String mobile;

    private String email;

    private UserRole  role = UserRole.User;

    public enum UserRole{
        User,
        Teacher,
        SUPER_MANAGER,
        MANAGER
    }
}
