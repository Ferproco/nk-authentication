package com.nkauthentication.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkauthentication.app.entity.Rol;

@Repository
public interface IRolRepository extends CrudRepository<Rol, Long>{

}
