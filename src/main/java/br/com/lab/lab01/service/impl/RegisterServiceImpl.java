package br.com.lab.lab01.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.lab.lab01.dto.PersonDto;
import br.com.lab.lab01.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Override
    public ResponseEntity<PersonDto> searchPersonById(Long personId) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
