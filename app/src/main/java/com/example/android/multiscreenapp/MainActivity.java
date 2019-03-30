package com.example.android.multiscreenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btCadastroCliente;
    ImageButton btCadastroProduto;
    ImageButton btListagem;
    ImageButton btConfiguracoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCadastroCliente = findViewById(R.id.btCadastroCliente);
        btCadastroProduto = findViewById(R.id.btCadastroProduto);
        btListagem = findViewById(R.id.btListagem);
        btConfiguracoes = findViewById(R.id.btConfiguracoes);

        btCadastroCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCadastroClienteActivity();
            }
        });
    }

    public void openCadastroClienteActivity() {
        Intent intent = new Intent(this, CadastroClienteActivity.class);
        startActivity(intent);
    }
}
