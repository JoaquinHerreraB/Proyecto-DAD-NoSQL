package com.faztty.Faztty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faztty.Faztty.bean.UsuarioBean;
import com.faztty.Faztty.bean.CompradorBean;
import com.faztty.Faztty.bean.NegocioBean;
import com.faztty.Faztty.entity.Usuario;
import com.faztty.Faztty.entity.TipoNegocio;
import com.faztty.Faztty.repository.UsuarioRepository;
import com.faztty.Faztty.repository.TipoNegocioRepository;



@Service
public class UsuarioService  {
	
	@Autowired
	UsuarioRepository repoUsuario;
	@Autowired
	TipoNegocioRepository repoTipo;
	
	public Usuario  getUsuario(Long id){
		return repoUsuario.findById(id).get();
	}

	public UsuarioBean autenticacion(UsuarioBean ub){
		Usuario u= repoUsuario.findByUsername(ub.getUsername());
		
		if(u!=null) {
			ub.setId(u.getId());
			if(ub.getPassword().equals("12345"))
				if(u.getPassword().equals("$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC")) 
					if(repoUsuario.findById(ub.getId()).isPresent()) {
						
						ub.setTipo("N");
					}
					else ub.setTipo("C");
			return ub;
		}
			
		return null;
			
	}
	//NEGOCIO
	
	public Iterable<Usuario> getUsuarios(){
		return repoUsuario.findAllByOrderByPuntuacionAsc();
	}
		
	public Iterable<Usuario> getUsuariosByTipo(Long idTipo) {
		

		TipoNegocio tn=repoTipo.findById(idTipo).get();
		return repoUsuario.findAllByTipoNegocioOrderByPuntuacionAsc(tn);
	}
	
	public Usuario registrar(NegocioBean nb) {
			Usuario n= new Usuario();
			
			n.setUsername(nb.getUsername());
			n.setEmail(nb.getEmail());
			n.setPassword("$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC");
			//n.setPassword((nb.getContra()));
			n.setDireccion(nb.getDireccion());
			n.setImagen(nb.getImagen());
			n.setNombre(nb.getNombre());
			n.setTipoNegocio(repoTipo.findById(nb.getTn()).get());
			n.setRUC(nb.getRuc());
			n.setPuntuacion((long)50);
			repoUsuario.save(n);
			return n;
	}
	//COMPRADOR
	public Usuario registrar(CompradorBean cb) {
			Usuario c= new Usuario();
			
			c.setUsername(cb.getUsername());
			c.setEmail(cb.getEmail());
			
			c.setPassword("$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC");
			//c.setPassword((cb.getContra()));
			c.setDni(cb.getDni());
			c.setFirstName(cb.getFirstname());
			c.setLastName(cb.getLastname());
			repoUsuario.save(c);
			return c;
	}


}
