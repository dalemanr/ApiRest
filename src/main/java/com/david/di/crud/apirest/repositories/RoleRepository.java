package com.david.di.crud.apirest.repositories;

import com.david.di.crud.apirest.entities.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName (String name);
}
