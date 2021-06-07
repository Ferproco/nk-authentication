package com.nkauthentication.app.service;

import java.util.List;
import com.nkauthentication.app.entity.Usuario;


public interface IUsuarioService {

	public List<Usuario> findAll(Long idempresa);	
	public Usuario findByLogin(String Login, String Password);
	public Usuario findByUserName(String NombreUsuario);
	public Usuario save(Usuario usuario);
	
}
