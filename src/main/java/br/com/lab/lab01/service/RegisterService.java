package br.com.lab.lab01.service;

import org.springframework.http.ResponseEntity;

import br.com.lab.lab01.dto.PersonDto;

public interface RegisterService {

    ResponseEntity<PersonDto> searchPersonById(String personId);

    ResponseEntity<PersonDto> searchPersonById(Long personId);
    
}
