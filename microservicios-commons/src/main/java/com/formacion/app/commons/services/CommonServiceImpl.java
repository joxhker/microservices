package com.formacion.app.commons.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

@Service
public class CommonServiceImpl<E, R extends JpaRepository<E, Long>> implements CommonService<E> {

	@Autowired
	protected R repoEntity;
	
	@Transactional(readOnly = true)
	@Override
	public List<E> findAll() {
		return repoEntity.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<E> findById(Long id) {
		// TODO Auto-generated method stub
		return repoEntity.findById(id);
	}

	@Transactional
	@Override
	public E save(E entity) {
		// TODO Auto-generated method stub
		return repoEntity.saveAndFlush(entity);
	}

}
