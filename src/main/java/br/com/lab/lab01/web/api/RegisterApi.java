package br.com.lab.lab01.web.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.lab.lab01.model.dto.PersonDto;

@RequestMapping(path = "/register")
public interface RegisterApi {

    @CrossOrigin
    @GetMapping(path = "person/{personId}")
    ResponseEntity<PersonDto> searchPersonById(
        @PathVariable Long personId
    );
    
    @CrossOrigin
    @PostMapping(path = "person")
    ResponseEntity<PersonDto> savePerson(
        @RequestBody PersonDto personDto
    );

}

