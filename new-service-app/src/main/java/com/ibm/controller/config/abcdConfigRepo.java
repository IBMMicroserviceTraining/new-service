package com.ibm.controller.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix="my")
@PropertySource("classpath:abcd.properties")
@Getter
@Setter
public class abcdConfigRepo {
	
private int age;
private String company;

}
