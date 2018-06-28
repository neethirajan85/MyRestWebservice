package com.neethi.rest.webservice.MyRestWebservice.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static com.google.common.base.Predicates.or;

//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//	@Bean
//	public Docket api()
//	{
//		return new Docket(DocumentationType.SWAGGER_2);
//	}
//	
//}
@Configuration
@EnableSwagger2
public class SwaggerConfig {                                    
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)
          .groupName("public-api")
          .apiInfo(apiInfo())
          .select()                                  
          .paths(postPaths())                          
          .build();                                           
    }

	private Predicate<String> postPaths() {
		// TODO Auto-generated method stub
		return or(regex("/user*"), regex("/user*"));
	}

	private ApiInfo apiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfoBuilder().title("User API")
				.description("User API for CRUD operation")
				.termsOfServiceUrl("www.neethi.com")
				.contact("neethirajan85@gmail.com").license("User-API")
				.licenseUrl("neethirajan85@gmail.com").version("1.0").build();
	}
}
