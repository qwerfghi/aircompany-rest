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
                String str2 = "";
                String str4 = "";
                registry?.addMapping("/**")
                        ?.allowedMethods("GET", "post", "put", "DELETE", "HEAD")
                        ?.allowedOrigins("http://localhost:4200")
            }
        }
    }
}
