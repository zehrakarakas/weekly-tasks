package com.cydeo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String email;
    private String Password;
    private String address;
    private String address2;
    private String City;
    private String state;
    private String zipCode;

}
