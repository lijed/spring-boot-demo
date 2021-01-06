package com.gupaoedu.example.springbootdemo;

import com.gupaoedu.example.demo02.GpRedisTemplate;
import com.gupaoedu.example.demo04.EnableConfiguration;
import com.gupaoedu.example.demo05.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@EnableConfiguration
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ca=SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println(ca.getBean(GpRedisTemplate.class));
		System.out.println(ca.getBean(Person.class));
	}
}
