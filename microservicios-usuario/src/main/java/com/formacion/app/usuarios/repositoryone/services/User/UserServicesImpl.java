package com.formacion.app.usuarios.repositoryone.services.User;
 
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service; 

import com.formacion.app.commons.services.CommonServiceImpl;
import com.formacion.app.usuarios.repositoryone.entity.TB_LGL_USER;
import com.formacion.app.usuarios.repositoryone.repository.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class UserServicesImpl extends CommonServiceImpl<TB_LGL_USER, UserRepo> implements UserServices {

	 @PersistenceContext
      private EntityManager entityManager;;
	
	 @Transactional
	    public void guardarUsuariosTransitorios(List<TB_LGL_USER> usuarios) {
	        Session session = entityManager.unwrap(Session.class);
	        
	        for (int i = 0; i < usuarios.size(); i++) {
	            session.save(usuarios.get(i));

	            // Flush y clear para mejorar el rendimiento al procesar grandes cantidades de datos
	            if (i % 100 == 0) {
	                session.flush();
	                session.clear();
	            }
	        }
	        // Manejar el remanente después del bucle
	        session.flush();
	        session.clear();
	 }
 

}
