package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.Repository"})
@MapperScan(value = "com.example.Mapper")
@ComponentScan(basePackages = {
	"com.example.Controller",
	"com.example.Service",
	"com.example.Model.Dao",
	"com.example.Core.aop",
	"com.example.Core.Config"
})
@EntityScan(basePackages = {"com.example.Model.Pojo"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
