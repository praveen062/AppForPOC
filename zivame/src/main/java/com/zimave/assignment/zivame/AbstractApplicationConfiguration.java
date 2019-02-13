package com.zimave.assignment.zivame;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({WebXmlConfiguration.class})
@ComponentScan
@EnableAutoConfiguration
public class AbstractApplicationConfiguration {

}
