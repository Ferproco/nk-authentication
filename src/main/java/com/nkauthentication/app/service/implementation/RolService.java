package com.nkauthentication.app.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkauthentication.app.entity.Rol;
import com.nkauthentication.app.repository.IRolRepository;
import com.nkauthentication.app.service.IRolService;

@Service
public class RolService implements IRolService {

	@Autowired
	private IRolRepository RolRepossitory;
	
	@Override
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return (List<Rol>)RolRepossitory.findAll();
	}

	@Override
	public Rol save(Rol rol) {
		// TODO Auto-generated method stub
		return RolRepossitory.save(rol);
	}

	@Override
	public Rol findbyRol(Long id) {
		// TODO Auto-generated method stub
		return RolRepossitory.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		RolRepossitory.deleteById(id);
	}

}
