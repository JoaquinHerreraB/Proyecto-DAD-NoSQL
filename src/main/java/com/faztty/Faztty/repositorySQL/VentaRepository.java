package com.faztty.Faztty.repositorySQL;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faztty.Faztty.entitySQL.Venta;


@Repository
public interface VentaRepository extends CrudRepository<Venta, Long> {

}
