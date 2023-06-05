package br.com.ms.msjavauseractivity.domain.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MapperConfig  {
	
	@Bean
	public ModelMapper modelMapper() {
		 return new ModelMapper();
	}

}
