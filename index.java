package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variavel de numeros interios criados
    int carregamento = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "User tapped the Supabutton");
                VezesProcessada();

            }
        });

    }
    // codigo para abir anuncios a cada 5 carregamentos de pagina
    private void VezesProcessada() {
        // incremente 1 a cada carregamento
            carregamento += 1;
            // funcao para  abrir pagina se carregar mais de 5 vezes
            if (carregamento >= 5) {
                //aqui abre a pagina depois da contagem
                Toast.makeText(this, "Clicou mais de 3 vezes!", Toast.LENGTH_SHORT).show();
                // aqui zera o cronometro
                carregamento = 0;
            }
        }



}
