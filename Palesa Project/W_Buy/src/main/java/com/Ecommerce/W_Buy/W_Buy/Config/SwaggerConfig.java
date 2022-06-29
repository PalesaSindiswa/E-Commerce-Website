package com.Ecommerce.W_Buy.W_Buy.Config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@Configuration
@EnableSwagger2
public class SwaggerConfig  {
	


	 @Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(getApiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.Ecommerce.W_Buy.W_Buy"))
	                .paths(PathSelectors.any())
	                .build();


	        }
	        private ApiInfo getApiInfo() {

	            return new ApiInfoBuilder()
	                    .title("W_BUY  PALESA Ecommerce API")
	                    .description("W_BUY Documentation Palesa Tsotetsi Ecommerce api")
	                    .version("1.0.0")
	                    .license("Apache 2.0")
	                    .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
	                    .build();
	        }

}
