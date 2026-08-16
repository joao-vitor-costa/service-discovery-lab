package com.example.discovery.registry.config;
import java.time.Duration;import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(prefix="service.registry") public record RegistryProperties(Duration instanceTtl){public RegistryProperties{if(instanceTtl==null)instanceTtl=Duration.ofSeconds(10);}}
