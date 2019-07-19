package com.restapi.empresa.controllers;

//import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.empresa.dto.EmpresaDto;
import com.restapi.empresa.response.Response;


@RestController
@RequestMapping("api/empresa")
public class EmpresaController {

	
	/**

	62

	API RESTful com Spring Boot e Java 8 - http://kazale.com

	* Versionamento de API pelo Header 'X-API-Version', define versão 'v1'.
	*
	* @param nome
	* @return ResponseEntity<Response<String>>
	* **/
		
		@Cacheable("TESTE GET")
		@GetMapping(value="/{nome}", headers="X-API-Version=v1")
		public String exemplo(@PathVariable("nome")String nome) {
			return "Ola " + nome;
		}
		
		
		
		@PostMapping
		public ResponseEntity<Response<EmpresaDto>> cadastrar(
			 @RequestBody EmpresaDto empresaDto, BindingResult result){
			
			Response<EmpresaDto>response = new Response<EmpresaDto>();
			
			if(result.hasErrors()) {
				result.getAllErrors().forEach(error->
				response.getErrors().add(error.getDefaultMessage()));
				
				return ResponseEntity.badRequest().body(response);
			}
			
			
			empresaDto.setId(1L);
			response.setData(empresaDto);
			
			return ResponseEntity.ok(response);
		}
}
