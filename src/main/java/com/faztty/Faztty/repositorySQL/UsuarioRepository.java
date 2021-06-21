package com.faztty.Faztty.repositorySQL;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faztty.Faztty.entitySQL.Negocio;
import com.faztty.Faztty.entitySQL.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Usuario findByUsername(String username);
		
}
