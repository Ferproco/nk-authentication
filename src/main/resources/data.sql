INSERT INTO seguridad.rol(descripcion, activo, actualizadoel, borrado, creadoel, nombre) VALUES ('Administrador', true, null, false, now(), 'Administrador');
INSERT INTO seguridad.usuario(
            accesotoken, activo, actualizadoel, actualizartoken, borrado, 
            codigouser, creadoel, email, emailconfirmado, empresaid, esadministrador, 
            imagen, nombrecompleto, nombreusuario, ocupacion, password, telefono, 
            telefonoconfirmado, valido, vencepassword)
    VALUES ('', true, null, '', false, 
            'c2d29867-3d0b-d497-9191-18a9d8ee7830', now(), 'vonealmar@gmail.com', false, 1, true, 
            '', 'Alfonso Araujo', 'vonealmar@gmail.com', 'Jefe de Proyecto', '123456', '3213740026', 
            false, true, null);













































