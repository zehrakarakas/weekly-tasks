package com.cydeo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.awt.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  //  @NotNull         -->   @NotNull
  // @NotEmpty        -->   @NotNull + @NotEmpty
  //  @NotBlank        -->   @NotNull + @NotEmpty + @NotBlank

   // @NotNull         // -->  Field shouldn't be null
  //  @NotEmpty       // --->  Field shouldn't be ""
   // @NotBlank      //  --->  Field shouldn't be "      "

    @NotBlank
    @Size(max=12,min=2)
    private String firstName;

    @NotBlank
    @Size(max=12,min=2)
    private String lastName;
    //Thymeleaf accepts yyy-MM-dd
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String Password;
    private String address;
    private String address2;
    private String City;
    private String state;
    private String zipCode;

}
