package it.attf.gestioneprenotazioni.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.attf.gestioneprenotazioni.entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{

	@Query(
			nativeQuery = true,
			value = "SELECT * FROM utente WHERE nomeCompleto = :valore"
		)
		List<Utente> findByNomeCompleto(@Param("valore") String valore);	
	
	@Query(
			nativeQuery = true,
			value = "SELECT * FROM utente WHERE id = :valore"
		)
		List<Utente> cercaDaId(@Param("valore") Integer valore);
	
}
