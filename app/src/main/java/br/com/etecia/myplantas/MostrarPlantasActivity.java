package br.com.etecia.myplantas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MostrarPlantasActivity extends AppCompatActivity {

    TextView txtRecebeNomePlanta;
    ImageView imgRecebePlanta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_plantas_layout);

        txtRecebeNomePlanta = findViewById(R.id.txtRecebeNomePlanta);
        imgRecebePlanta = findViewById(R.id.imgRecebePlanta);

        Intent intent = getIntent();

        String nome = intent.getStringExtra("nome_planta");
        int imagem = intent.getIntExtra("imagem_planta",0);

        txtRecebeNomePlanta.setText(nome);
        imgRecebePlanta.setImageResource(imagem);
    }
}