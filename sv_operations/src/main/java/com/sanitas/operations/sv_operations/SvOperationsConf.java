package com.sanitas.operations.sv_operations;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SvOperationsConf {
	
	@Bean(name="defaultLocale")
	public Locale setDefaultLocale() {
		return Locale.ENGLISH;
	}
	


}
