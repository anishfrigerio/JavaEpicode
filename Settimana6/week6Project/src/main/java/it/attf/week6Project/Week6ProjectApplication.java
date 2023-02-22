package it.attf.week6Project;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.attf.week6Project.config.Beans;
import it.attf.week6Project.entities.Device;
import it.attf.week6Project.entities.DeviceState;
import it.attf.week6Project.entities.DeviceType;
import it.attf.week6Project.entities.Role;
import it.attf.week6Project.entities.RoleType;
import it.attf.week6Project.entities.User;
import it.attf.week6Project.service.ApplicationService;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Week6ProjectApplication implements CommandLineRunner{

	
	@Autowired
	private ApplicationService as;
	
	public static void main(String[] args)  {
		SpringApplication.run(Week6ProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		
		User u1 = (User)ctx.getBean("utente", "Anish", "Frigerio", "anishfrigerio","anish@gmail.com","myPassword");
		
		Role r1 = (Role)ctx.getBean("role", RoleType.USER);
		Role r2 = (Role)ctx.getBean("role", RoleType.ADMIN);
		
		u1.setRoles(new HashSet<>(){{
			add(r1);
		}});
		
		Device d1 = (Device)ctx.getBean("dispos", DeviceType.LAPTOP, DeviceState.DISPONIBILE);
		Device d2 = (Device)ctx.getBean("dispos", DeviceType.SMARTPHONE, DeviceState.DIMESSO);
		Device d3 = (Device)ctx.getBean("dispos", DeviceType.TABLET, DeviceState.MANUTENZIONE);
		Device d4 = (Device)ctx.getBean("dispos", DeviceType.LAPTOP, DeviceState.DISPONIBILE);
		Device d5 = (Device)ctx.getBean("dispos", DeviceType.TABLET, DeviceState.DISPONIBILE);
		
		((AnnotationConfigApplicationContext)ctx).close();
		

		populateRoles(r1);
		populateRoles(r2);
		
		populateUsers(u1);
		
	 	populateDevices(d1);
	 	populateDevices(d2);
	 	populateDevices(d3);
	 	populateDevices(d4);
	 	populateDevices(d5);

		
		assignDevice(d4, u1);
	}
	
	public void populateRoles(Role r) {
		as.saveRole(r);
	}
	
	public void populateUsers(User u) {
		as.saveUser(u);
	}
	
	public void populateDevices(Device d) {	
		as.saveDev(d);
	}
	
	private void getRolesFromUserById(int id) {
        Optional<User> authUserObj = as.getUserById(id);
        User authUser = authUserObj.get();
        String role = "USER";
        Set<Role> roles = authUser.getRoles();

        for( Role r : roles ) {
            if( r.getRole().toString().contains("ADMIN") ) {
                role = "ADMIN";
                break;
            }
        }

        System.out.println(role);
    }
	
	public void assignDevice(Device d, User u) {
			
		String s = null;
		
		switch(d.getDevState()) {
		
		case DISPONIBILE:
			as.update(u.getId(), DeviceState.ASSEGNATO, d.getId());
			s = "Dispositivo assegnato correttamente all'utente" + u.getName() + u.getSurname();
			break;
		
		case ASSEGNATO:
			s = "Dispositivo occupato";
			break;
			
		case DIMESSO:
			s = "Dispositivo non disponibile";
			break;
			
		case MANUTENZIONE:
			s = "Dispositivo in manutenzione";
			break;
		}
		System.out.println(s);	
	}
}
