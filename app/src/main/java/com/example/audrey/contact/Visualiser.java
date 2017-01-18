package com.example.audrey.contact;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

/**
 * Created by Audrey on 16/01/2017.
 */

public class Visualiser extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personne);
        List<Personne> listP= Personne.listAll(Personne.class);
        //Création et initialisation de l'Adapter pour les personnes
        ContactAdapterBD adapter = new ContactAdapterBD(this, listP);

        //Récupération du composant ListView
        ListView list = (ListView)findViewById(R.id.list);

        //Initialisation de la liste avec les données
        list.setAdapter(adapter);
    }
}
