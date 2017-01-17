package com.example.audrey.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ClickChercher(View v) throws IOException {
        Intent intent2=new Intent(this, Chercher.class);
        intent2.putExtra("My_Additional_data", 42);
        startActivity(intent2);

    }

    public void ClickAjouter(View v) throws IOException {
        Intent intent3=new Intent(this, Ajouter.class);
        intent3.putExtra("My_Additional_data", 42);
        startActivity(intent3);

        /*
        AlertDialog.Builder notif= new AlertDialog.Builder(MainActivity.this);
        String chaine=getFilesDir()+"/repertoire4";
        StringBuilder ff=new StringBuilder();

        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(chaine));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterator it = prop.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            String[] res;
            res = (prop.getProperty(key).split(";"));
            ff.append(key+" "+res[0]+" "+res[1]+"\n");
        }

        notif.setMessage(ff.toString());
        notif.setTitle("Repertoire");
        notif.show();

    */

    }
    public void ClickVisualiser(View v) throws IOException {
        Intent intent2=new Intent(this, Visualiser.class);
        intent2.putExtra("My_Additional_data", 42);
        startActivity(intent2);

    }
}
