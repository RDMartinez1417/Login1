package com.example.login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.txt_layout);
        email = findViewById(R.id.editEmail);
        pass = findViewById(R.id.editPsw);

    }

    public void login(View view) {
        String emailS, passV;
        emailS = email.getText().toString();
        passV = pass.getText().toString();
        if (emailS.equals("rafael@gmail.com") && passV.equals("123456")) {
            Intent contenido = new Intent(this, contenido.class);
            startActivity(contenido);
            Toast.makeText(this,"Credenciales Correctas",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Datos incorrectos",Toast.LENGTH_SHORT).show();
        }
    }

    public void toastFace(View view){
        Toast.makeText(this,"Has seleccionado el boton LOG IN WITH FACEBOOK",Toast.LENGTH_SHORT).show();
    }
    public void toastSpoti(View view){
        Toast.makeText(this,"Has seleccionado el boton LOG IN WITH SPOTIFY",Toast.LENGTH_SHORT).show();
    }
}
