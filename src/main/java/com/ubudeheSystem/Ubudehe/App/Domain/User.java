package com.ubudeheSystem.Ubudehe.App.Domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private Boolean active;
    @NotEmpty(message = "Password is required!")
    @NotNull
    @Size(min=7, message = "Password should be at least 8 characters long")
    private String password;
    private String roles;
    @Column(unique = true)
    @NotEmpty(message = "Email is required!")
    @Email(message = "Invalid email")
    @NotNull
    private String email;
    @NotEmpty(message = "First Name is required!")
    private String firstName;
    @NotEmpty(message = "Last Name is required!")
    private String lastName;
    @CreationTimestamp
    private LocalDateTime createDateTime; 
    @UpdateTimestamp
    private LocalDateTime updateDateTime;


    
}