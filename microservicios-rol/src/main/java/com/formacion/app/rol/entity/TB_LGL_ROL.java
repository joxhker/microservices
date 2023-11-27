package com.formacion.app.rol.entity;

import java.time.LocalDateTime;

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
@Table(name = "TB_LGL_ROL")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class TB_LGL_ROL {
	
	@Id
	@GeneratedValue(generator = "protoRol",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "protoRol", allocationSize = 1, sequenceName = "SEQ_LGL_ROL")
	@Column(name="ID_ROL")
	private Long idRol;

	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="FLAG")
	private String flag;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="DATE_REGISTERED")
	private LocalDateTime dateRegistered;
}
