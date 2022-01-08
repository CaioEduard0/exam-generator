package com.example.examgenerator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Professor extends AbstractEntity {

    @NotBlank(message = "The name cannot be empty.")
    private String name;

    @Email(message = "This e-mail is not valid.")
    @NotBlank(message = "The e-mail cannot be empty.")
    @Column(unique = true)
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
