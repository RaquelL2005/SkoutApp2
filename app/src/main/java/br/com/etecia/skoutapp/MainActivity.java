package br.com.etecia.skoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarando as variaveis globais que irao representar os objetos xml
    EditText edtUsuario, edtSenha;
    Button btnEntrar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //apresentar ao java os componentes xml
        edtSenha = findViewById(R.id.edtSenha);
        edtUsuario = findViewById(R.id.edtUsuario);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);
//criando btn de sair
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //criando as variaveis
                String usuario, senha;
                //atribuindo valores as variaveis
                usuario = edtUsuario.getText().toString();
                senha = edtSenha.getText().toString();

                Toast.makeText(getApplicationContext(),
                        "Clique aqui!!!",
                        Toast.LENGTH_SHORT).show();

                //validando o usuario e senha
                if (usuario.equals("etecia") && senha.equals("etecia")) {
                    startActivity(new Intent(getApplicationContext(), MenuPrincipalActivity.class));
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "usuário ou senha inválidos!!!!!!",
                            Toast.LENGTH_SHORT).show();
                    edtSenha.setText("");
                    edtUsuario.setText("");
                    edtUsuario.requestFocus();
                }

            }
        });


    }
}