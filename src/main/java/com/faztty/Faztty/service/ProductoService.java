package com.faztty.Faztty.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;
import java.util.LinkedHashSet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.faztty.Faztty.bean.FotoBean;
import com.faztty.Faztty.bean.ProductoBean;
import com.faztty.Faztty.entity.Categoria;
import com.faztty.Faztty.entity.Usuario;
import com.faztty.Faztty.entity.Producto;
import com.faztty.Faztty.repository.CategoriaRepository;
import com.faztty.Faztty.repository.UsuarioRepository;
import com.faztty.Faztty.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	ProductoRepository repoProducto;
	
	@Autowired
	CategoriaRepository repoCategoria;

	@Autowired
	UsuarioRepository repoUsuario;
	
	public Iterable<Producto> getProductosByCategoriaNegocio(Long idCategoria, Long idUsuario)throws FileNotFoundException, SQLException, IOException {
		Categoria c=repoCategoria.findById(idCategoria).get();
		Usuario n=repoUsuario.findById(idUsuario).get();
		Iterable<Producto> listp = repoProducto.findAllByCategoriaAndUsuarioOrderByPuntuacionAsc(c,n);
		for(Producto p: listp) {
			//p.setImagen_ruta(downloadFoto3(p.getImagen_blob()));
			//p.setImagen_blob(null);
		}
			
		return listp;
	}
	
	public Iterable<ProductoBean> getProductosBeanByCategoriaUsuario(Long idCategoria, Long idUsuario){
		Categoria c=repoCategoria.findById(idCategoria).get();
		Usuario n=repoUsuario.findById(idUsuario).get();
		LinkedHashSet<ProductoBean> pbL = new LinkedHashSet<ProductoBean>();
		ProductoBean pb=new ProductoBean();
		System.out.println("Iniciando el bean");
		for (Producto p: repoProducto.findAllByCategoriaAndUsuarioOrderByPuntuacionAsc(c,n)) {
			pb.setId(p.getId());
			pb.setImagen(p.getImagen());
			pb.setMarca(p.getMarca());
			pb.setNombre(p.getNombre());
			pb.setPrecio(p.getPrecio());
			pb.setPuntuacion(p.getPuntuacion());
			pb.setCategoria(p.getCategoria().getNombre());
			System.out.println(pb.toString());
			pbL.add(pb);
		}
		return pbL;
		
	}
	public Iterable<Producto> getProductosByUsuario(Long idUsuario) throws FileNotFoundException, SQLException, IOException {
		
		Usuario n=repoUsuario.findById(idUsuario).get();
		Iterable<Producto> listp = repoProducto.findAllByUsuarioOrderByIdAsc(n);
		for(Producto p: listp) {
			//System.out.println(p.getImagen_blob());
			//if(p.getImagen_blob()!=null)
			//	p.setImagen_ruta(downloadFoto3(p.getImagen_blob()));
			//p.setImagen_blob(null);
			
		}
		return listp;
	}
	
	public Producto getProducto(Long idProducto) throws FileNotFoundException, SQLException, IOException {
		Producto p = repoProducto.findById(idProducto).get();
		//p.setImagen_ruta(downloadFoto3(p.getImagen_blob()));
		//p.setImagen_blob(null);
		return p;
	}
	
	public Producto agregarProducto(Long id_negocio,ProductoBean pb) {
		Producto p = new Producto();
		p.setCategoria(repoCategoria.findById(pb.getCatid()).get());
		p.setImagen(pb.getImagen());
		p.setMarca(pb.getMarca());
		p.setNombre(pb.getNombre());
		p.setPrecio(pb.getPrecio());
		p.setPuntuacion((long)50);
		p.setUsuario(repoUsuario.findById(id_negocio).get());
		repoProducto.save(p);
		//p.setImagen_blob(null);
		return p;
	}
	
	public Producto modificarProducto(ProductoBean pb, Long id) {
		Producto p= repoProducto.findById(id).get();
		p.setCategoria(repoCategoria.findById(pb.getCatid()).get());
		p.setImagen(pb.getImagen());
		p.setMarca(pb.getMarca());
		p.setNombre(pb.getNombre());
		p.setPrecio(pb.getPrecio());
		
		repoProducto.save(p);
		//p.setImagen_blob(null);
		
		return p;
	}
	
	public Producto eliminarProducto(Long id) {
		Producto p= repoProducto.findById(id).get();
		repoProducto.delete(p);	
		return p;
	}
	

	
	
}
