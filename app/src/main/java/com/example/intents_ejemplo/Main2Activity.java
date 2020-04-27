package com.example.intents_ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texto = (TextView) findViewById(R.id.textViewMain2);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String saludo = bundle.getString("mensaje");
            Toast.makeText(Main2Activity.this,saludo,Toast.LENGTH_LONG).show();
            texto.setText(saludo);
        }else{
            Toast.makeText(Main2Activity.this,"no hay mensaje desde el otro lado",Toast.LENGTH_LONG).show();
        }

    }
}
