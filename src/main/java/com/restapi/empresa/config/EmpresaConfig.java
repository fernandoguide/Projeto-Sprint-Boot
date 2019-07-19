package com.restapi.empresa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class EmpresaConfig {

	
		@Bean
		public Docket api() {
			return new Docket(DocumentationType.SWAGGER_2).select()
					.apis(RequestHandlerSelectors.basePackage("com.restapi.empresa"))
					.paths(PathSelectors.any()).build()
					.apiInfo(apiInfo());
			
			
		}
		
		public ApiInfo apiInfo() {
			return new ApiInfoBuilder().title("API USANDO SWAGGER")
					.description("Documentação da API de acesso  a endpoints com swagger")
					.version("1.0")
					.build();
		}
		
}
