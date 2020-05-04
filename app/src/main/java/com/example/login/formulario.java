package com.example.login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class formulario extends AppCompatActivity {
    EditText nombre,apellido,email,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.txt_layout2);
        nombre=findViewById(R.id.editName);
        apellido=findViewById(R.id.editLastname);
        email=findViewById(R.id.editEmail);
        pass=findViewById(R.id.editPsw);
    }
    public void form(View view){
        String nombreS,apellidoS,emailS,passS;
        nombreS=nombre.getText().toString();
        apellidoS=apellido.getText().toString();
        emailS=email.getText().toString();
        passS=pass.getText().toString();
        if (!(nombreS.isEmpty()||apellidoS.isEmpty()||emailS.isEmpty()||passS.isEmpty())){
            Intent login= new Intent(this,MainActivity.class);
            startActivity(login);
        }else{
            Toast.makeText(this,"Asegurate de llenar todos los campos",Toast.LENGTH_SHORT).show();
        }
    }
}
