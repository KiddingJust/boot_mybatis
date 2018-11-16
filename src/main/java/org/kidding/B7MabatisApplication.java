package org.kidding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//MyBatis 끗-
@MapperScan(basePackages="org.kidding.mapper")
public class B7MabatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(B7MabatisApplication.class, args);
	}
}
