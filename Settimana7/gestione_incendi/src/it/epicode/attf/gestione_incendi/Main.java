package it.epicode.attf.gestione_incendi;

import it.epicode.attf.gestione_incendi.models.CanaleDiComunicazione;
import it.epicode.attf.gestione_incendi.models.CentroControllo;
import it.epicode.attf.gestione_incendi.models.MioCanaleDiComunicazione;
import it.epicode.attf.gestione_incendi.models.Sonda;

public class Main {

	public static void main(String[] args) {
		
		
		CanaleDiComunicazione canale = (CanaleDiComunicazione) new MioCanaleDiComunicazione();

      
        CentroControllo centroControllo = CentroControllo.getInstance(canale);


        Sonda sonda1 = new Sonda(1, 41.736175, 12.470555, 0.0, canale);//Roma
        Sonda sonda2 = new Sonda(2, 45.4654219, 9.1859243, 0.0, canale);//Milano
        centroControllo.addSonda(sonda1);
        centroControllo.addSonda(sonda2);

       
        sonda1.setSmokeLevel(6.5);


        sonda2.setSmokeLevel(4.0);
        
        sonda2.setSmokeLevel(8);
        
        sonda1.setSmokeLevel(8);
	}

}
