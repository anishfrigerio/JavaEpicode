package it.attf.gestioneprenotazioni.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.attf.gestioneprenotazioni.entity.Utente;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository utenteRepo;
	
	public void inserisciUtente(Utente u) {
		utenteRepo.save(u);	
	}
	
}
