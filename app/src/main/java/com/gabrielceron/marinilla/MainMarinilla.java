package com.gabrielceron.marinilla;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainMarinilla extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_marinilla);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_marinilla, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_acerca) {
            Intent i = new Intent(this, AcercaDe.class);
            startActivity(i);
        }


        if (id == R.id.action_bares) {
            Intent i = new Intent(this, Bares.class);
            startActivity(i);
        }


        if (id == R.id.action_demografia) {
            Intent i = new Intent(this, Demografia.class);
            startActivity(i);
        }


        if (id == R.id.action_hoteles) {
            Intent i = new Intent(this, Hoteles.class);
            startActivity(i);
        }


        if (id == R.id.action_turismo) {
            Intent i = new Intent(this, Turismo.class);
            startActivity(i);
        }


        return super.onOptionsItemSelected(item);
    }
}
