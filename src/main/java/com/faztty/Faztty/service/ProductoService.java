package com.faztty.Faztty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faztty.Faztty.bean.ProductoBean;
import com.faztty.Faztty.entity.Producto;
import com.faztty.Faztty.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	ProductoRepository repoProducto;
	public Iterable<Producto> getProductosByCategoriaNegocio(Long idCategoria, Long idNegocio){
		return null;
	
	};
	public Iterable<ProductoBean> getProductosBeanByCategoriaNegocio(Long idCategoria, Long idNegocio){
		return null;
	}
	public Iterable<Producto> getProductosByNegocio(Long idNegocio){
		return null;
	}
	public Producto getProducto(Long idProducto) {
		return null;
	}
	public Producto agregarProducto(Long id_negocio,ProductoBean pb) {
		return null;
		
	}
	public Producto modificarProducto(ProductoBean pb, Long id) {
		return null;
		
	}
	public Producto eliminarProducto(Long id) {
		return null;
		
	}
	
	
	
}
