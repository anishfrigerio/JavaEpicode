package it.attf.gestioneprenotazioni.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.attf.gestioneprenotazioni.entity.Postazione;

@Service
public class PostazioneService {

	@Autowired
	private PostazioneRepository posRepo;
	
	public void inserisciPos(Postazione p) {
		posRepo.save(p);
	}
	
}
