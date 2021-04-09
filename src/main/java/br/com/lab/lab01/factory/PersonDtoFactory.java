package br.com.lab.lab01.factory;

import br.com.lab.lab01.model.dto.PersonDto;
import br.com.lab.lab01.model.entity.Person;

public final class PersonDtoFactory {

    public static PersonDto createPerson(Person person) {
        return PersonDto.builder()
                .id(person.getId())
                .name(person.getName())
                .sex(person.getSex())
                .birth(person.getBirth())
                .build();
    }
    
}
