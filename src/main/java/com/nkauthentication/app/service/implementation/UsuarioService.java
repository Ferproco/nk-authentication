package com.nkauthentication.app.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkauthentication.app.entity.Usuario;
import com.nkauthentication.app.repository.IUsuarioRepository;
import com.nkauthentication.app.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuarioRepository UsuarioRepository;
	
	@Override
	public List<Usuario> findAll(Long EmpresaId) {
		// TODO Auto-generated method stub
		return (List<Usuario>)UsuarioRepository.findByEmpresaId(EmpresaId);
	}

	@Override
	public Usuario findByLogin(String Login, String Password) {
		// TODO Auto-generated method stub
		return UsuarioRepository.findByUserNameAndPassword(Login, Password);
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return UsuarioRepository.save(usuario);
	}

	@Override
	public Usuario findByUserName(String NombreUsuario) {
		// TODO Auto-generated method stub
		return UsuarioRepository.findByUserName(NombreUsuario);
	}

}
