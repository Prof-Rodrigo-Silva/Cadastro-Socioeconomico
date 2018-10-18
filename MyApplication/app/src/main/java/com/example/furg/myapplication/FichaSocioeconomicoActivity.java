package com.example.furg.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.io.Serializable;

import controle.SimplesAdapterCRUD;

public class FichaSocioeconomicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_socioeconomico);

        Button cadastro = (Button) findViewById(R.id.btnCadastro);
        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadastro = new Intent(FichaSocioeconomicoActivity.this, Cadastrar.class);
                startActivity(cadastro);
            }
        });
        Button editar = (Button) findViewById(R.id.btnEditar);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editar = new Intent(FichaSocioeconomicoActivity.this, Editar.class);
                startActivity(editar);
            }
        });
        Button listar = (Button) findViewById(R.id.btnListar);
        listar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listar = new Intent(FichaSocioeconomicoActivity.this,Listar.class);
                startActivity(listar);
            }
        });
        Button excluir = (Button) findViewById(R.id.btnExcluir);
        excluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent excluir = new Intent(FichaSocioeconomicoActivity.this,Excluir.class);
                startActivity(excluir);
            }
        });

        Button voltarMain1 = (Button) findViewById(R.id.btnVoltarCRUDMain);
        voltarMain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarMain1 =new Intent(FichaSocioeconomicoActivity.this,MainActivity.class);
                startActivity(voltarMain1);
            }
        });




    }

}
