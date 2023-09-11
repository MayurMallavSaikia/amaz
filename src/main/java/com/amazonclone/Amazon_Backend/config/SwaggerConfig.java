package com.amazonclone.Amazon_Backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {
	
	
	String scheme = "bearerScheme";
	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI() 
				.addSecurityItem(new SecurityRequirement()
						.addList(scheme))
				.components(new Components().addSecuritySchemes(scheme, new SecurityScheme()
						.name(scheme).type(SecurityScheme.Type.HTTP).bearerFormat("JWT").scheme("bearer")))
				.info(new Info().title("E-Commerce Application")
			.description("Backend APIs for E-Commerce app")
			.version("v1.0.0"));
			
	
	}
	
}
