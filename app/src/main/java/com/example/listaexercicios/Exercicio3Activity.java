package com.example.listaexercicios;
import android.os.Bundle; import android.widget.*; import androidx.appcompat.app.AppCompatActivity;
public class Exercicio3Activity extends AppCompatActivity {
 EditText etxtNome,etxtSala,etxtHorario; TextView txtResultado;
 protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_exercicio3);
 etxtNome=findViewById(R.id.etxtNome);etxtSala=findViewById(R.id.etxtSala);etxtHorario=findViewById(R.id.etxtHorario);txtResultado=findViewById(R.id.txtResultado);
 findViewById(R.id.btn_Reservar).setOnClickListener(v->{String nome=etxtNome.getText().toString(),sala=etxtSala.getText().toString(),hora=etxtHorario.getText().toString();
 System.out.println("Responsável: "+nome);System.out.println("Sala: "+sala);System.out.println("Horário: "+hora);txtResultado.setText(sala+" reservado para "+nome+" às "+hora);});}}
