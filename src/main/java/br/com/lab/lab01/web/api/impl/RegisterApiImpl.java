package br.com.lab.lab01.web.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.lab.lab01.dto.PersonDto;
import br.com.lab.lab01.service.RegisterService;
import br.com.lab.lab01.web.api.RegisterApi;

public class RegisterApiImpl implements RegisterApi{

    @Autowired
    private RegisterService registerService;

    @Override
    public ResponseEntity<PersonDto> searchPersonById(Long personId){
        ResponseEntity<PersonDto> serviceReturn = registerService.searchPersonById(personId);
        return serviceReturn;
    }
    
}
