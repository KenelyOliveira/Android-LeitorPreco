package com.kenely.android.leitorbuscapreco;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button button = findViewById(R.id.btnLeitor);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        abrirLeitor();
      }
    });


    button = findViewById(R.id.btnConfiguracao);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        abrirConfiguracao();
      }
    });


    button = findViewById(R.id.btnGerenciamento);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        abrirGerenciamento();
      }
    });

  }

  private void abrirLeitor() {
    Intent intent = new Intent(this, LeitorPrecoActivity.class);
    startActivity(intent);
  }
  private void abrirConfiguracao() {
    Intent intent = new Intent(this, ConfiguracaoActivity.class);
    startActivity(intent);
  }
  private void abrirGerenciamento() {
    Intent intent = new Intent(this, GerenciamentoActivity.class);
    startActivity(intent);
  }
}
