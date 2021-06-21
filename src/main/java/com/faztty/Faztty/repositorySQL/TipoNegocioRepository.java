package com.faztty.Faztty.repositorySQL;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faztty.Faztty.entitySQL.TipoNegocio;

@Repository
public interface TipoNegocioRepository  extends CrudRepository<TipoNegocio, Long>{

}
