package com.end.beck.desafio.imedback.Model;

import java.io.Serializable;
import java.text.DateFormat;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
public class Attendance implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    
     
    @JoinColumn(name = "patient", referencedColumnName = "name")
    private Patient patient;
    
    @Column
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    private ZonedDateTime starDateTime;
    
    @Column
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    private ZonedDateTime endDateTime;



}
