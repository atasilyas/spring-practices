package com.atasilyas.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private String username;
    private String surname;
    private Date birthDate;
    private String description;

 }
