package com.contabilizei.teste.customer.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id",unique=true,nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer id;
	
	@Column(name="nome")
	private String name;
	
	@Column(name="id_federac")
	private Integer idFederac;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdFederac() {
		return idFederac;
	}

	public void setIdFederac(Integer idFederac) {
		this.idFederac = idFederac;
	}
	
}
