package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:/application.properties")

@Configuration
@ComponentScan
public class AppConfig {
}
