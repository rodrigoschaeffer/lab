package br.com.lab.lab01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lab.lab01.model.entity.Person;

public interface PersonDao extends JpaRepository<Person, Long>{
        
}
