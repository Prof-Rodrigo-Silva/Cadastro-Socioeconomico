package com.example.furg.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import controle.Login;
import openHelper.LoginDB;

public class CadastroUsuarioActivity extends AppCompatActivity {

    private LoginDB loginDB;
    private Login login;
    private static String TAG = "login_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        Button btnVoltarTela1 = (Button) findViewById(R.id.btnVoltarTela1);
        btnVoltarTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar = new Intent(CadastroUsuarioActivity.this, MainActivity.class);
                startActivity(voltar);
            }
        });
        login = new Login();
        loginDB = LoginDB.getInstance(this);
        Button btnCadsatrarUsuarioBD = (Button) findViewById(R.id.btnCasdastrarUsuarioBD);
        btnCadsatrarUsuarioBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText eTNomeUsuario = (EditText) findViewById(R.id.eTNomeUsuario);
                EditText eTSenhaUsuario = (EditText) findViewById(R.id.eTSenhaUsuario);
                if(!eTNomeUsuario.getText().toString().isEmpty() && !eTSenhaUsuario.getText().toString().isEmpty()){
                    if (login._id ==null){
                        login = new Login();
                    }
                    login.nome = eTNomeUsuario.getText().toString();
                    login.senha = eTSenhaUsuario.getText().toString();
                    Log.d(TAG, "Usuário que será salvo: " +login.toString());
                    loginDB.save(login);
                }else {
                    alerta("Preencha todos os campos!");
                }
                alerta("Usuário Cadastrado!");
                eTNomeUsuario.setText("");
                eTSenhaUsuario.setText("");

            }
        });

    }
    private void alerta(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
