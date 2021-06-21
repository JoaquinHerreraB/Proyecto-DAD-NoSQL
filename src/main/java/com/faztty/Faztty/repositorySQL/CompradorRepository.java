package com.faztty.Faztty.repositorySQL;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faztty.Faztty.entitySQL.Comprador;

@Repository
public interface CompradorRepository extends CrudRepository<Comprador, Long> {



}
