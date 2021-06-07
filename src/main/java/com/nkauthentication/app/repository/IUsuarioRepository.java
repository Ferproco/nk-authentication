package com.nkauthentication.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.nkauthentication.app.entity.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario,Long>{

	@Query(value = "Select * from seguridad.usuario u WHERE u.email = :uemail AND u.password = :upassword", nativeQuery = true)
	public Usuario findByUserNameAndPassword(@Param("uemail")    String username,
            								 @Param("upassword") String password);
	
	@Query(value = "Select * from seguridad.usuario u WHERE u.empresaid = :empresaid", nativeQuery = true)
	public List<Usuario> findByEmpresaId(@Param("empresaid") Long empresaid);
	
	@Query(value = "Select * from seguridad.usuario u WHERE u.nombreusuario = :username", nativeQuery = true)
	public Usuario findByUserName(@Param("username") String username);
	
}
