package com.formacion.app.rol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formacion.app.rol.entity.TB_LGL_ROL;

@Repository
public interface RolRepo extends JpaRepository<TB_LGL_ROL, Long> {

}
