package com.formacion.app.rol.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.app.commons.controllers.CommonController;
import com.formacion.app.rol.entity.TB_LGL_ROL;
import com.formacion.app.rol.services.RolService;

@RestController
@CrossOrigin("*")
public class RolController extends CommonController<TB_LGL_ROL,RolService> {

	
	
}
