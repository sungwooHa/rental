package com.study.inflearn_msa.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Inflearn MSA API")
                    .version("1.0")
                    .description("Inflearn MSA 프로젝트의 API 문서입니다.")
            )
    }
}