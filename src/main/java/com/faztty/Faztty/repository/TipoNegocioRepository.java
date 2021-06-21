package com.faztty.Faztty.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.faztty.Faztty.entity.TipoNegocio;
import com.faztty.Faztty.entity.Usuario;


public interface TipoNegocioRepository extends MongoRepository<TipoNegocio, String>{

	Optional<TipoNegocio> findById(Long idTipo);

}
