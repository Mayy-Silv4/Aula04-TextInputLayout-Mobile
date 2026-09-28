package com.example.listaexercicios;
import android.os.Bundle; import android.widget.*; import androidx.appcompat.app.AppCompatActivity;
public class Exercicio1Activity extends AppCompatActivity {
 EditText etxtLanche,etxtBebida,etxtObservacao; TextView txtResultado;
 protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_exercicio1);
 etxtLanche=findViewById(R.id.etxtLanche); etxtBebida=findViewById(R.id.etxtBebida); etxtObservacao=findViewById(R.id.etxtObservacao); txtResultado=findViewById(R.id.txtResultado);
 findViewById(R.id.btn_Pedir).setOnClickListener(v->{String lanche=etxtLanche.getText().toString(),bebida=etxtBebida.getText().toString(),obs=etxtObservacao.getText().toString();
 System.out.println("Lanche: "+lanche);System.out.println("Bebida: "+bebida);System.out.println("Observação: "+obs);txtResultado.setText("Pedido: "+lanche+" + "+bebida+" ("+obs+")");});}}
