package com.nkauthentication.app.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkauthentication.app.service.IUsuarioService;
import com.nkauthentication.app.entity.Usuario;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("seguridad")
public class UsuarioController {

	@Autowired
	private IUsuarioService Usuarioservice;



	@GetMapping("usuario/{idempresa}")
	public ResponseEntity<?> ListarUsuarios(@PathVariable(name = "idempresa") Long idempresa) {
		List<Usuario> LstUsuarios = Usuarioservice.findAll(idempresa);
		if (LstUsuarios != null) {
			if (LstUsuarios.size() != 0) {
				return new ResponseEntity<>(LstUsuarios, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("usuario")
	public ResponseEntity<?> GuardarContacto(@RequestBody Usuario usuario) throws Exception {
		Usuario usuarioOut;
		try {
			Usuario usuarioUpdate = Usuarioservice.findByUserName(usuario.getNombreusuario());
			if (usuarioUpdate != null) {
				/*
				 * contactoUpdate.setLugarenvio(contacto.getLugarenvio());
				 * contactoUpdate.setCodlistaprecio(contacto.getCodlistaprecio());
				 * contactoUpdate.setDireccionexogena(contacto.getDireccionexogena());
				 * contactoUpdate.setCoddepartamento(contacto.getCoddepartamento());
				 * contactoUpdate.setCodmunicipio(contacto.getCodmunicipio());
				 * contactoUpdate.setId(contacto.getId());
				 * contactoUpdate.setCodvendedor(contacto.getCodvendedor());
				 * contactoUpdate.setCodnegocio(contacto.getCodnegocio());
				 * contactoUpdate.setNumeroidentificacion(contacto.getNumeroidentificacion());
				 * contactoUpdate.setCodtipoidentificacion(contacto.getCodtipoidentificacion());
				 * contactoUpdate.setCodtipopersona(contacto.getCodtipopersona());
				 * contactoUpdate.setCodpais(contacto.getCodpais());
				 * contactoUpdate.setRazonsocial(contacto.getRazonsocial());
				 * contactoUpdate.setTelefonomovil(contacto.getTelefonomovil());
				 * contactoUpdate.setTelefonofijo1(contacto.getTelefonofijo1());
				 * contactoUpdate.setTelefonofijo2(contacto.getTelefonofijo2());
				 * contactoUpdate.setTelefonofax(contacto.getTelefonofax());
				 * contactoUpdate.setDireccionfiscal(contacto.getDireccionfiscal());
				 * contactoUpdate.setCorreoe(contacto.getCorreoe());
				 * contactoUpdate.setCodtipocontacto(contacto.getCodtipocontacto());
				 * contactoUpdate.setCodformapago(contacto.getCodformapago());
				 * contactoUpdate.setCodtipocontibuyente(contacto.getCodtipocontibuyente());
				 * contactoUpdate.setStatus(contacto.getStatus());
				 * contactoUpdate.setNombreprimero(contacto.getNombreprimero());
				 * contactoUpdate.setNombresegundo(contacto.getNombresegundo());
				 * contactoUpdate.setApellidoprimero(contacto.getApellidoprimero());
				 * contactoUpdate.setApellidosegundo(contacto.getApellidosegundo());
				 * contactoUpdate.setPaginaweb(contacto.getPaginaweb());
				 * contactoUpdate.setLimitecreditohasta(contacto.getLimitecreditohasta());
				 * contactoUpdate.setFechacreditodesde(contacto.getFechacreditodesde());
				 * contactoUpdate.setFechacreditohasta(contacto.getFechacreditohasta());
				 * contactoUpdate.setObservaciones(contacto.getObservaciones());
				 * contactoUpdate.setDescuentocondicionado(contacto.getDescuentocondicionado());
				 * contactoUpdate.setCodigodv(contacto.getCodigodv());
				 * contactoUpdate.setResponsableiva(contacto.getResponsableiva());
				 */
				usuarioOut = Usuarioservice.save(usuarioUpdate);
			} else {
				usuarioOut = Usuarioservice.save(usuario);
			}
			if (usuarioOut != null) {
				return new ResponseEntity<>(usuarioOut, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		} 
		catch (Exception m) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	

}
