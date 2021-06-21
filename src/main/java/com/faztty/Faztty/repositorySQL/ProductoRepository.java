package com.faztty.Faztty.repositorySQL;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faztty.Faztty.entitySQL.Categoria;
import com.faztty.Faztty.entitySQL.Negocio;
import com.faztty.Faztty.entitySQL.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

	Iterable<Producto> findAllByOrderByPuntuacionAsc();

	Iterable<Producto> findAllByCategoriaAndNegocioOrderByPuntuacionAsc(Categoria c,Negocio n);



	Iterable<Producto> findAllByNegocioOrderByPuntuacionAsc(Negocio n);


	Iterable<Producto> findAllByNegocioOrderByIdAsc(Negocio n);

}
