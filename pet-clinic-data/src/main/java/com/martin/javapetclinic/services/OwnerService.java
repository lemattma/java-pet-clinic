package com.martin.javapetclinic.services;

import com.martin.javapetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
