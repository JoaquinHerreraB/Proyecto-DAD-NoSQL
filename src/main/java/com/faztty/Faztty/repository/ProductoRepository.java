package com.faztty.Faztty.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.faztty.Faztty.entity.Categoria;
import com.faztty.Faztty.entity.Producto;
import com.faztty.Faztty.entity.Usuario;

public interface ProductoRepository extends MongoRepository<Producto, String> {
	public List<Producto> findFirst10ByOrderById();

	public Iterable<Producto> findAllByCategoriaAndUsuarioOrderByPuntuacionAsc(Categoria c, Usuario n);

	public Iterable<Producto> findAllByUsuarioOrderByIdAsc(Usuario n);

	public Optional<Producto> findById(Long idProducto);
	
}
