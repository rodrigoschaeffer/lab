package br.com.lab.lab01.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person {
    
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private char sex;
    @Column
    private Date birth;

}