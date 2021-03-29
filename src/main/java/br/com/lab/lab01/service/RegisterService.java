package br.com.lab.lab01.service;

import org.springframework.http.ResponseEntity;

import br.com.lab.lab01.model.dto.PersonDto;

public interface RegisterService {

    ResponseEntity<PersonDto> searchPersonById(Long personId);
    
}
