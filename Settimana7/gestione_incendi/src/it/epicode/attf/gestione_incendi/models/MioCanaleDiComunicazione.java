package it.epicode.attf.gestione_incendi.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MioCanaleDiComunicazione implements CanaleDiComunicazione{

    @Override
    public void inviaMessaggio(String messaggio) {
        System.out.println("Invio messaggio: " + messaggio);
    }

}
