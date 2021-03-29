package br.com.lab.lab01.web.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lab.lab01.model.dto.PersonDto;
import br.com.lab.lab01.service.RegisterService;
import br.com.lab.lab01.web.api.RegisterApi;

@RestController
@RequestMapping(path = "/register")
public class RegisterApiImpl implements RegisterApi{

    @Autowired
    private RegisterService registerService;

    @Override
    public ResponseEntity<PersonDto> searchPersonById(Long personId){
        System.out.println("Recebeu o parametro: " + personId);
        ResponseEntity<PersonDto> serviceReturn = registerService.searchPersonById(personId);
        return serviceReturn;
    }
    
}
