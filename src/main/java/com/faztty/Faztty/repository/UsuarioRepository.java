package com.faztty.Faztty.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.faztty.Faztty.entity.TipoNegocio;
import com.faztty.Faztty.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

	Optional<Usuario> findById(Long id);

	Usuario findByUsername(String username);

	Iterable<Usuario> findAllByOrderByPuntuacionAsc();

	Iterable<Usuario> findAllByTipoNegocioOrderByPuntuacionAsc(TipoNegocio tn);

}
