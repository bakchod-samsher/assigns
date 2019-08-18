package come.clientside.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


import come.clientside.models.Address;
import come.clientside.models.Student;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "come.clientside.controllers")
public class ViewConfigurer implements WebMvcConfigurer {

	
	@Bean
	public InternalResourceViewResolver resolver() {

	InternalResourceViewResolver resolverMain = new InternalResourceViewResolver();
	
	resolverMain.setPrefix("/WEB-INF/views/");
	resolverMain.setSuffix(".jsp");
	
	resolverMain.setViewClass(JstlView.class);
	
	return resolverMain;
	
	}
	

	@Bean
	public Student student() {
		
		return new Student();
	}
	
	@Bean
	public Address address() {
		return new Address();
	}
	
	@Bean
	public ModelAndView modelAndView() {
		
		return new ModelAndView();
	}

	@Bean
	public RestTemplate template() {
		
		return new RestTemplate();
	}
	
}
