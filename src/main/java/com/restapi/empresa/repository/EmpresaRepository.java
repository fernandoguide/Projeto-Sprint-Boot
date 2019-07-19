package com.restapi.empresa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.empresa.models.EmpresaModel;



public interface EmpresaRepository extends JpaRepository<EmpresaModel, Long>{
	 
	EmpresaModel findByCnpj(String cnpj);
}
