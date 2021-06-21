package com.faztty.Faztty.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.faztty.Faztty.entity.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String> {
	public List<Producto> findFirst10ByOrderById();
	
}
