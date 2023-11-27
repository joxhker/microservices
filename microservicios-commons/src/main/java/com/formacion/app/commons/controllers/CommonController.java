package com.formacion.app.commons.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 

import com.formacion.app.commons.services.CommonService;
 
  
public class CommonController<E, s extends CommonService<E>> {

	@Autowired
	protected s service;
	
	
	@GetMapping(value = "v1/")
	public ResponseEntity<?> get(){
		return ResponseEntity.ok().body(service.findAll());		
	}
	
	@GetMapping(value = "v1/{id}")
	public ResponseEntity<?> getId(@PathVariable Long id){
		Optional<E> op = service.findById(id);
		if(op.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(op);
	}
	
	@PostMapping(value = "v1/")
	public ResponseEntity<?> save(@RequestBody E entity){ 
		System.out.println(entity);
		return new ResponseEntity<>(service.save(entity),HttpStatus.CREATED);
	}
	
}
