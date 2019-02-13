package com.inventory.system;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan 
@Import({WebXmlConfiguration.class})
@EnableAutoConfiguration
public class AbstractApplicationConfiguration {

}
