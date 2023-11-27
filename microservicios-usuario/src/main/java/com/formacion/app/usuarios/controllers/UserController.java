package com.formacion.app.usuarios.controllers;
 
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.app.commons.controllers.CommonController;
import com.formacion.app.usuarios.repositoryone.entity.TB_LGL_USER;
import com.formacion.app.usuarios.repositoryone.services.User.UserServices;
 

@RestController
@CrossOrigin(origins = "*") 
public class UserController extends CommonController<TB_LGL_USER, UserServices> {

    @PostMapping("/guardar-lote")
    public void guardarUsuarios(@RequestBody List<TB_LGL_USER> usuarios) {
    	this.service.guardarUsuariosTransitorios(usuarios);
    }
	
}
