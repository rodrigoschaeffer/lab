package br.com.lab.lab01.model.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDto {
    
    private Long id;
    private String name;
    private char sex;
    private Date birth;
    private int age;

}
