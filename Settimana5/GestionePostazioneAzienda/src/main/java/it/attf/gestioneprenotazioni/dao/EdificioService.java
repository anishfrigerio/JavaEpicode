package it.attf.gestioneprenotazioni.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.attf.gestioneprenotazioni.entity.Edificio;

@Service
public class EdificioService {

	@Autowired
	private EdificioRepository edificioRepo;

	public void inserisci(Edificio e) {
		edificioRepo.save(e);

	}

}