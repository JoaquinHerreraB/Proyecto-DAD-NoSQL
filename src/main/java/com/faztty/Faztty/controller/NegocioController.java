package com.faztty.Faztty.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;



import com.faztty.Faztty.entity.Producto;
import com.faztty.Faztty.entity.TipoNegocio;
import com.faztty.Faztty.entity.Usuario;
import com.faztty.Faztty.bean.CompradorBean;
import com.faztty.Faztty.bean.FotoBean;
import com.faztty.Faztty.bean.NegocioBean;
import com.faztty.Faztty.bean.ProductoBean;
import com.faztty.Faztty.bean.UsuarioBean;
import com.faztty.Faztty.entity.Categoria;
import com.faztty.Faztty.service.CategoriaService;
import com.faztty.Faztty.service.ProductoService;
import com.faztty.Faztty.service.TipoNegocioService;
import com.faztty.Faztty.service.UsuarioService;

@RestController
@CrossOrigin("*")
public class NegocioController {
	
	@Autowired
	UsuarioService uService;
	
	@Autowired
	TipoNegocioService tnService;
	

	@Autowired
	ProductoService pService;
	
	@Autowired
	CategoriaService cService;
	

	@GetMapping({"/tipoNegocio"})
	public Iterable<TipoNegocio> consultaTipoNegocio() {
		return tnService.getTipoNegocios();
	}
	
	@GetMapping({"/tipoNegocio/{id}"})
	public TipoNegocio consultaTipoNegocio(@PathVariable Long id) {
		return tnService.getTipoNegocio(id);
	}

	@GetMapping({"/productosByNegocio/{id_negocio}"})
	public Iterable<Producto> consultaProductoByNegocio(@PathVariable Long id_negocio) throws FileNotFoundException, SQLException, IOException {
		return pService.getProductosByUsuario(id_negocio);
	}
	@GetMapping({"/categoria"})
	public Iterable<Categoria> consultaCategoria() {
		return cService.getCategorias();
	}
	@GetMapping({"/productosByCategoria/{id_negocio}/{id_categoria}"})
	public Iterable<Producto> consultaProductoByCategoria(@PathVariable Long id_negocio, @PathVariable Long id_categoria) throws FileNotFoundException, SQLException, IOException {
		return pService.getProductosByCategoriaNegocio(id_categoria, id_negocio);
	}
	
	@GetMapping({"/producto/{id}"})
	public Producto consultaProducto(@PathVariable Long id) throws FileNotFoundException, SQLException, IOException {
		return pService.getProducto(id);
	}
	
	
	@PostMapping({"/nuevoProducto/{id_negocio}"})
	public Producto nuevoProducto(@PathVariable Long id_negocio,@RequestBody ProductoBean pb) {
		return pService.agregarProducto(id_negocio,pb);
	}
	
	@PostMapping({"/modificarProducto/{id_producto}"})
	public Producto modificarProducto(@PathVariable Long id_producto, @RequestBody ProductoBean pb) {
		return pService.modificarProducto( pb,id_producto);
	}
	
	@PostMapping({"/eliminarProducto/"})
	public Producto eliminarProducto(@RequestBody ProductoBean pb) {
		return pService.eliminarProducto( pb.getId());
	}
	
	@PostMapping({"/autentica"})
	public UsuarioBean login(@RequestBody UsuarioBean ub) {
		return uService.autenticacion(ub);
	}
	/*
	@PostMapping("/uploadFotoProducto")
	public Producto uploadFotoProducto(@RequestParam("archivo") MultipartFile archivo,
			@RequestParam("producto_id") Long id) {
		return pService.uploadFoto(archivo, id);
	}
	
	
	@GetMapping("/downloadFotoProducto/{id_producto}")
	public FotoBean downloadFotoProducto(@PathVariable Long id_producto) throws SQLException {
		return pService.downloadFoto(id_producto);
	}
	*/
	
	

}
