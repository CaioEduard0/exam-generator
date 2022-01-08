package com.example.examgenerator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class User extends AbstractEntity {

    @NotBlank(message = "The username cannot be empty.")
    @Column(unique = true)
    private String username;

    @NotBlank(message = "The password cannot be empty.")
    private String password;

    @OneToOne
    private Professor professor;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
