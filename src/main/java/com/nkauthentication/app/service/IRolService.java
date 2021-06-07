package com.nkauthentication.app.service;

import java.util.List;

import com.nkauthentication.app.entity.Rol;


public interface IRolService {
	
	public List<Rol> findAll();
	public Rol save(Rol rol);
	public Rol findbyRol(Long id);
	public void deleteById(Long id);

}
