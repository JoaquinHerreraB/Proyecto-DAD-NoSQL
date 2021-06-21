package com.faztty.Faztty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faztty.Faztty.entitySQL.Categoria;
import com.faztty.Faztty.repositorySQL.CategoriaRepository;



@Service
public class CategoriaService {
	@Autowired
	CategoriaRepository repo;
	
	public Categoria getCategoria(Long id) {
		return repo.findById(id).get();
	}
	
	public Iterable<Categoria> getCategorias(){
		return repo.findAllByOrderByIdAsc();
	}
}
