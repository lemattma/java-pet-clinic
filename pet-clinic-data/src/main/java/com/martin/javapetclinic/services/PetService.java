package com.martin.javapetclinic.services;

import com.martin.javapetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id );

    Pet save(Pet pet);

    Set<Pet> findAll();
}
