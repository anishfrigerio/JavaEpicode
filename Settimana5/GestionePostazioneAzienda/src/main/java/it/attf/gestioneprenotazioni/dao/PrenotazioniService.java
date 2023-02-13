package it.attf.gestioneprenotazioni.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.attf.gestioneprenotazioni.entity.Prenotazioni;

@Service
public class PrenotazioniService {

	@Autowired
	private PrenotazioniRepository prenoRepo;
	
	public void inserisciPreno(Prenotazioni p) {
		prenoRepo.save(p);
	}
	
}
