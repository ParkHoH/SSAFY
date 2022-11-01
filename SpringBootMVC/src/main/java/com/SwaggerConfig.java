package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// ver 2: localhost/{root-context}/swagge-ui.html
// ver 3: localhost/{root-context}/swagge-ui/index.html


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
//	@Bean
//	public Docket makeDocket() {
//		Docket docket = new Docket(DocumentationType.SWAGGER_2); // swagger 핵심 클래스
//		ApiSelectorBuilder builder = docket.select(); // 문서 작성을 위한 내부 초기화 작업
//		
//		builder = builder.apis(RequestHandlerSelectors.basePackage("com.rest.controller"))
//					.paths(PathSelectors.ant("/customers/**"));
//		
//		docket = builder.build();
//		return docket;
//	}

	@Bean
	public Docket makeDocket2() {
		return new Docket(DocumentationType.SWAGGER_2)
							.select()
							.apis(RequestHandlerSelectors.basePackage("com.rest.controller"))
							.paths(PathSelectors.ant("/customers/**"))
							.build();
	}
	
	private ApiInfo apiInfo() {
		ApiInfoBuilder b = new ApiInfoBuilder();
		b.title("Customer API 입니다.");
		b.description("Customer Description 입니다.");
		b.version("1.0");
		ApiInfo ai = b.build();
		
		return ai;
	}
}
