package br.com.lab.lab01.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.lab.lab01.model.dto.PersonDto;
import br.com.lab.lab01.model.entity.Person;
import br.com.lab.lab01.model.repository.PersonDao;
import br.com.lab.lab01.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private PersonDao personDao;

    @Override
    public ResponseEntity<PersonDto> searchPersonById(Long personId) {
        Person person = this.personDao.getOne(personId);
        PersonDto personDto = new PersonDto();
        if(person != null){
            personDto.setId(person.getId());
            personDto.setName(person.getName());
            personDto.setSex(person.getSex());
            personDto.setBirth(person.getBirth());
            return ResponseEntity.status(200).body(personDto);
        } else {
            return ResponseEntity.status(400).body(null);
        }
    }
    
}
