package br.com.lab.lab01.factory;

import br.com.lab.lab01.model.dto.PersonDto;
import br.com.lab.lab01.model.entity.Person;

public final class PersonFactory {

    public static Person createPerson(PersonDto personDto) {
        return Person.builder()
                .name(personDto.getName())
                .sex(personDto.getSex())
                .birth(personDto.getBirth())
                .build();
    }
    
}
