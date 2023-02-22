package it.attf.week6Project.config;

import java.util.Optional;
import java.util.Set;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import it.attf.week6Project.entities.User;
import it.attf.week6Project.service.ApplicationService;
import it.attf.week6Project.entities.Role;



@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
	
	@Autowired
	ApplicationService as;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	http
		.authorizeRequests()					
			.antMatchers("/")
			.permitAll()
		.anyRequest()
			.authenticated()
		.and()
		.formLogin()
		.and()
		.logout();
	}
	
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		
		Optional<User> authUtenteObj = as.getUserById(1);
		User authUtente = authUtenteObj.get();
		String role = "UTENTE";
		Set<Role> roles = authUtente.getRoles();
		
		for( Role r : roles ) {
			if( r.getRole().toString().contains("ADMIN") ) {
				role = "ADMIN";
				break;
			}
		}
		auth.inMemoryAuthentication()
		.withUser( authUtente.getName() ).password( passwordEncoder().encode( authUtente.getPassword() ) )
		.roles(role);
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
