package com.faztty.Faztty.repositorySQL;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faztty.Faztty.entitySQL.DetalleVP;

@Repository
public interface DetalleVPRepository extends CrudRepository<DetalleVP, Long>{


}
