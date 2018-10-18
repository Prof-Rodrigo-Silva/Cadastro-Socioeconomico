package com.example.furg.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import openHelper.LoginDB;

public class MainActivity extends AppCompatActivity {


    private LoginDB loginDB;
    private static String TAG = "login_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginDB = LoginDB.getInstance(this);
        Button btnLogarUsuario = (Button) findViewById(R.id.btnCasdastrarUsuarioBD);
        btnLogarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText eTNome = (EditText) findViewById(R.id.eTNomeUsuario);
                EditText eTSenha = (EditText) findViewById(R.id.eTSenhaUsuario);
                String Nome = eTNome.getText().toString();
                String Senha = eTSenha.getText().toString();

                if(Nome.equals("")){
                    alerta("Nome não preenchido, tente novamente!");
                } else if(Senha.equals("")){
                    alerta("Senha não preenchida, tente novamente!");
                } else{
                    String res = loginDB.validarLogin(Nome,Senha);
                    if(res.equals("OK")){
                        alerta("Login executado!");
                        Intent fichaSocieconomica = new Intent(MainActivity.this, FichaSocioeconomicoActivity.class);
                        startActivity(fichaSocieconomica);
                        eTNome.setText("");
                        eTSenha.setText("");
                    } else {
                        alerta("Nome ou Senha incorreto!");}
                }
            }
        });
        Button btnCadastrarUsuario = (Button) findViewById(R.id.btnCadastroUsuario);
        btnCadastrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadastroUsuario = new Intent(MainActivity.this, CadastroUsuarioActivity.class);
                startActivity(cadastroUsuario);
            }
        });
        ImageButton btnEquipe = (ImageButton) findViewById(R.id.iBtnEquipe);
        btnEquipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Equipe = new Intent(MainActivity.this, EquipeActivity.class);
                startActivity(Equipe);
            }
        });

    }
    private void alerta(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
