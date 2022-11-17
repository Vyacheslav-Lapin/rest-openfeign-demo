package ru.vlapin.demo.restopenfeigndemo.config;

import ru.vlapin.demo.restopenfeigndemo.model.JavaConfigBasedSetterPropertiesPlaceholderExample;
import ru.vlapin.demo.restopenfeigndemo.model.JavaConfigBasedSetterPropertiesPlaceholderExampleImpl;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ConfigurationPropertiesScan("ru.vlapin.demo.restopenfeigndemo")
public class PropertyPlaceholder {

  @Bean
  @ConfigurationProperties("my-properties2")
  JavaConfigBasedSetterPropertiesPlaceholderExample mySetterProperties2() {
    return new JavaConfigBasedSetterPropertiesPlaceholderExampleImpl();
  }
}
