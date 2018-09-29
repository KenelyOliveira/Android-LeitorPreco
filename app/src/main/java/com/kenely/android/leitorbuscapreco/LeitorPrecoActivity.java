package com.kenely.android.leitorbuscapreco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LeitorPrecoActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_leitor_preco);

    TextView txt = findViewById(R.id.txtLeitor);
//    txt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//      @Override
//      public void onFocusChange(View v, boolean b) {
//        pesquisarProduto();
//      }
//    });
  }

  public void pesquisarProduto(){


  }
}
