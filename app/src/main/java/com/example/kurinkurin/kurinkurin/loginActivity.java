package com.example.kurinkurin.kurinkurin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class loginActivity extends AppCompatActivity {

    TextView verTiendas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        verTiendas = (TextView)findViewById(R.id.ir_tiendas);
        verTiendas.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent tiendas = new Intent(loginActivity.this,MainActivity.class);
                startActivity(tiendas);

            }
        });


    }
}
