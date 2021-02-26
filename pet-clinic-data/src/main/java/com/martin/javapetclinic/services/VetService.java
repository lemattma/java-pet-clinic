package com.martin.javapetclinic.services;

import com.martin.javapetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id );

    Vet save(Vet vet);

    Set<Vet> findAll();
}
