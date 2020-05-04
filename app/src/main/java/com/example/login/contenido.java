package com.example.login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class contenido extends AppCompatActivity {
    Button btnatras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);
        btnatras=findViewById(R.id.btnAtras);
        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertamensaje();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        int id = item.getItemId();
        if(id==R.id.Abrir){
            Toast.makeText(this,"Has seleccionado la opcion Abrir",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.Guardar){
            Toast.makeText(this,"Has seleccionado la opcion Guardar",Toast.LENGTH_SHORT).show();
        }else{
            alertamensaje();
            Toast.makeText(this,"Has seleccionado la opcion Salir",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }



    public void toastImage(View view){
        Toast.makeText(this,"Has seleccionado una Imagen",Toast.LENGTH_SHORT).show();
    }
    public void alertamensaje(){
        new AlertDialog.Builder(this)
                .setTitle("Esto es un titulo")
                .setMessage("¿ Seguro que desea devolverse ?")
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton(R.string.cancelar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.d("Mensaje","Se cancelo la operacion");
            }
        }).show();
    }
}
