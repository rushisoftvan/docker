package com.learn.docker.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;

import java.time.Instant;

@Entity
@Table(name= "users")
@Getter
@Setter
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="created_on")
    private Instant createdOn;

    @Column(name="updated_on")
    private Instant updatedOn;


    @PrePersist
    public void prePersist(){
        this.createdOn = Instant.now();
    }

    @PreUpdate
    public void preUpdate(){
       this.updatedOn=Instant.now();
    }

}
