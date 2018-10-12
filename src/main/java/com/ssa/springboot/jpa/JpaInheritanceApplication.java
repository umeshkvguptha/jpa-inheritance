package com.ssa.springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class JpaInheritanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaInheritanceApplication.class, args);
	}
	
	   @Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.any())
	                .paths(PathSelectors.any())	
	                .build()
	                .apiInfo(metaData());
	    }
	   
	    private ApiInfo metaData() {
	        return new ApiInfoBuilder()
	                .title("Sprint Boot + JPA + In Memory Database(H2)")
	                .description("Sprint Boot + JPA + In Memory Database(H2)")
	                .version("1.0.0")
	                .license("Apache License Version 2.0")
	                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
	                .contact(new Contact("Umesh kumar K.V", "https://linkedin.com/in/umesh-kumar-kv-3398a835", "umeshkvguptha.writing@gmail.com"))
	                .build();
	    }
}
