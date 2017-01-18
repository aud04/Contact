package com.example.audrey.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by austepha on 17/01/2017.
 */

public class ViewContact extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewcontact);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String firstname = intent.getStringExtra("firstname");
        String tel = intent.getStringExtra("tel");


    }

}
