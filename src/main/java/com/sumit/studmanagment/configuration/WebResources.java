package com.sumit.studmanagment.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(value = {
		@PropertySource(value = {"classpath:database.properties"})
})
public class WebResources {

}
