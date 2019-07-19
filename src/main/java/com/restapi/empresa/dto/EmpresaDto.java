package com.restapi.empresa.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

public class EmpresaDto {

	
	private Long id;
	private String razaoSocial;
	private String cnpj;
	
	
	public EmpresaDto() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	
	
	@NotNull(message = "Razao social nao pode ser vazia")
	@Length(min = 5, max = 200,
	message = "Razao social deve conter entre 5 e 200 caracteres")
	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}

	@NotNull(message="CNPJ nao pode ser vazio")
	@CNPJ(message="cnpj invalido") 
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	@Override
	public String toString() {
		return "EmpresaDTo [id=" + id + ", razaoSocial" + razaoSocial + ", CNPJ="+ cnpj + "]";
	}
}
