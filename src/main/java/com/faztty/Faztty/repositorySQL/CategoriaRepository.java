package com.faztty.Faztty.repositorySQL;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faztty.Faztty.entitySQL.Categoria;


@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

	Iterable<Categoria> findAllByOrderByIdAsc();

}
