package com.nkauthentication.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkauthentication.app.entity.Usuario;
import com.nkauthentication.app.model.JwtUser;
import com.nkauthentication.app.model.Login;
import com.nkauthentication.app.model.Session;
import com.nkauthentication.app.security.JwtGenerator;
import com.nkauthentication.app.service.IUsuarioService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/token")
public class TokenController {
	
	@Autowired
	private IUsuarioService UsuarioService;
	
	private JwtGenerator jwtGenerator;
	
	public TokenController(JwtGenerator jwtGenerator) {
		this.jwtGenerator = jwtGenerator;
	}
	
	@PostMapping
	public ResponseEntity<?> generate(@RequestBody final Login login){
		JwtUser jwtUser = new JwtUser();
		jwtUser = existUser(login);
		if(jwtUser != null) {
			String token = jwtGenerator.generate(jwtUser);
			if (token.equals(""))
				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
			else
				return new ResponseEntity<>(new Session(jwtGenerator.generate(jwtUser),jwtUser), HttpStatus.OK);
			
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	private JwtUser existUser(Login login) {
		
		Usuario user = UsuarioService.findByLogin(login.getUser(), login.getPassword());		
		if(user != null) {
			JwtUser jwtUser = new JwtUser();
			jwtUser.setUserName(user.getNombreusuario());
			jwtUser.setId(user.getId());
			jwtUser.setRole("Admin");
			jwtUser.setEmpresaid(user.getEmpresaid());
			return jwtUser;			
		}
		else {
			return null;
		}
	}
}
