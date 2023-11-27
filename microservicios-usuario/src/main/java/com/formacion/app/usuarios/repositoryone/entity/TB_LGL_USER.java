package com.formacion.app.usuarios.repositoryone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TB_LGL_USER")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class TB_LGL_USER {

	@Id
    @GeneratedValue(generator = "proto_user",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "proto_user",allocationSize = 1,sequenceName = "SEQ_LGL_USER")
    @Column(name = "ID_USER")
    private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "PHONE")
	private String phone;	
	
	@Column(name = "STATUS")
	private String status;
	
}

