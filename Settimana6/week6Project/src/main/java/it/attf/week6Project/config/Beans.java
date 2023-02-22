package it.attf.week6Project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;



import it.attf.week6Project.entities.Device;
import it.attf.week6Project.entities.DeviceState;
import it.attf.week6Project.entities.DeviceType;
import it.attf.week6Project.entities.Role;
import it.attf.week6Project.entities.RoleType;
import it.attf.week6Project.entities.User;

public class Beans {
	@Bean
	@Scope("protopype")
	public User user( String name, String surname, String username, String email, String password) {
		
		return User.builder()
				.name(name)
				.surname(surname)
				.email(email)				
				.username(username)
				.password(password)
				.build();
	}
	
	@Bean 
	@Scope("prototype")
	public Device devices(DeviceType dev, DeviceState devState) {
		
		return Device.builder()
				.dev(dev)
				.devState(devState)
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Role role(RoleType r) {
		return Role.builder()
				.role(r)
				.build();
	}
}
