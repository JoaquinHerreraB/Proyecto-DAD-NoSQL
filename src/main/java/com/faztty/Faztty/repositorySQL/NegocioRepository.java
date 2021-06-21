package com.faztty.Faztty.repositorySQL;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faztty.Faztty.entitySQL.Negocio;
import com.faztty.Faztty.entitySQL.TipoNegocio;

@Repository
public interface NegocioRepository extends CrudRepository<Negocio, Long>{

	Iterable<Negocio> findAllByOrderByPuntuacionAsc();



	Iterable<Negocio> findAllByTipoNegocioOrderByPuntuacionAsc(TipoNegocio tn);

}
