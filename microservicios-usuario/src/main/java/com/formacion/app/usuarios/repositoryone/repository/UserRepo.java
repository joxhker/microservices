package com.formacion.app.usuarios.repositoryone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formacion.app.usuarios.repositoryone.entity.TB_LGL_USER;

@Repository
public interface UserRepo extends JpaRepository<TB_LGL_USER, Long> {
	
	

}
