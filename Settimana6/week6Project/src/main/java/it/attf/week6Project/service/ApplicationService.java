package it.attf.week6Project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.attf.week6Project.entities.Device;
import it.attf.week6Project.entities.DeviceState;
import it.attf.week6Project.entities.Role;
import it.attf.week6Project.entities.User;
import it.attf.week6Project.repository.DeviceRepository;
import it.attf.week6Project.repository.RoleRepository;
import it.attf.week6Project.repository.UserRepository;


@Service
public class ApplicationService {
	@Autowired
	private UserRepository usrRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private DeviceRepository devRepo;
	
	public Optional<User> getUserById(int id){
		return usrRepo.findById(id);
	}
	
	public User saveUser(User obj) {
		return usrRepo.save(obj);	
		}

	public Role saveRole(Role obj) {
		return  roleRepo.save(obj);
		}
	
	public Device saveDev(Device obj) {
		return devRepo.save(obj);
	}
	public void update(int userid, DeviceState s, int id) {
		devRepo.assignDevice(userid, s, id);
	}
	
	public List<Device> getAllDev() {
		return devRepo.findAll();
	}
	
	public List<Device> getDevByState(String s) {
		return devRepo.getDevByState(s);
	}
}
