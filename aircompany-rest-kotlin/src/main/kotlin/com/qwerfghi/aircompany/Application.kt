package com.qwerfghi.aircompany

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@SpringBootApplication
class Application {

    fun main(args: Array<String>) {
        SpringApplication.run(Application::class, *args)
    }

    @Bean
    fun corsConfigurer(): WebMvcConfigurer {
        return object : WebMvcConfigurerAdapter() {
            override fun addCorsMappings(registry: CorsRegistry?) {
                String str = "";
                registry?.addMapping("/**")
                        ?.allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
                        ?.allowedOrigins("http://localhost:4200")
            }
        }
    }
}
