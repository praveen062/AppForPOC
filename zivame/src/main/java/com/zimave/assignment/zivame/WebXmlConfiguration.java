package com.zimave.assignment.zivame;


import javax.servlet.Servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.spi.spring.container.servlet.SpringServlet;
import com.zimave.assignment.zivame.support.util.ResponseCorsFilter;

@Configuration
public class WebXmlConfiguration extends WebMvcConfigurationSupport {
	
	@Bean
    public ServletRegistrationBean jersey() {
    	
        Servlet jerseyServlet = new SpringServlet();	
        ServletRegistrationBean jerseyServletRegistration = new ServletRegistrationBean();
        jerseyServletRegistration.setServlet(jerseyServlet);
        jerseyServletRegistration.addUrlMappings("/*");
        jerseyServletRegistration.setName("jersey-servlet");
        jerseyServletRegistration.setLoadOnStartup(1);
        jerseyServletRegistration.addInitParameter(PackagesResourceConfig.PROPERTY_PACKAGES, "com.zimave.assignment.zivame");
        jerseyServletRegistration.addInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
        jerseyServletRegistration.addInitParameter("com.sun.jersey.spi.container.ContainerResponseFilters",
                ResponseCorsFilter.class.getName());

        return jerseyServletRegistration;
    }

}
