package com.formacion.app.usuarios.repositoryone.services.User;
 

import java.util.List;

import com.formacion.app.commons.services.CommonService;
import com.formacion.app.usuarios.repositoryone.entity.TB_LGL_USER;

public interface UserServices extends CommonService<TB_LGL_USER> {
	 
	public void guardarUsuariosTransitorios(List<TB_LGL_USER> usuarios);
}
