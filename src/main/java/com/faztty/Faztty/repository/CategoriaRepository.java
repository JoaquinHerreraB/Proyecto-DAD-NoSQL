package com.faztty.Faztty.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.faztty.Faztty.entity.Categoria;


public interface CategoriaRepository extends MongoRepository<Categoria, String> {


	public Optional<Categoria> findById(Long id);

	public Iterable<Categoria> findAllByOrderByIdAsc();
}
