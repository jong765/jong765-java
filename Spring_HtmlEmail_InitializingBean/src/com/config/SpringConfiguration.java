package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.util.HtmlEmail;

@Configuration
public class SpringConfiguration {

	@Bean
	public HtmlEmail htmlEmail() {
		return new HtmlEmail();
	}

}
