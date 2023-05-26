package com.github.cgardner.jobmanager.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.github.cgardner.jobmanager.data.entities")
public class DatabaseConfig {

}
