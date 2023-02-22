package it.attf.week6Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import it.attf.week6Project.entities.Device;
import it.attf.week6Project.service.ApplicationService;



@Controller
public class AppController {
	
	@Autowired
	ApplicationService as;
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Home page";
	}
	
	@GetMapping("/admin")
	@ResponseBody
	@PreAuthorize("hasRole('ADMIN')")
	private String admin() {
		return "Pagina dedicata al ADMIN";
	}
	@GetMapping("/dispositivi")
	@ResponseBody
	private List<Device> allDispos() {
		return as.getAllDev();
	}
	@GetMapping("/dispositivi/{stato}")
	@ResponseBody
	
	public List<Device> stato(@PathVariable String state) {
		return as.getDevByState(state.toUpperCase());
	}
}
