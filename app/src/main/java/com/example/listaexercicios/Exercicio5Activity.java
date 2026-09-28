package com.example.listaexercicios;
import android.os.Bundle; import android.widget.*; import androidx.appcompat.app.AppCompatActivity;
public class Exercicio5Activity extends AppCompatActivity {
 EditText etxtNome,etxtEmail,etxtIdade; TextView txtResultado;
 protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_exercicio5);
 etxtNome=findViewById(R.id.etxtNome);etxtEmail=findViewById(R.id.etxtEmail);etxtIdade=findViewById(R.id.etxtIdade);txtResultado=findViewById(R.id.txtResultado);
 findViewById(R.id.btn_Inscrever).setOnClickListener(v->{String nome=etxtNome.getText().toString(),email=etxtEmail.getText().toString(),idadeTexto=etxtIdade.getText().toString();
 System.out.println("Nome: "+nome);System.out.println("E-mail: "+email);System.out.println("Idade: "+idadeTexto);
 try{int idade=Integer.parseInt(idadeTexto);if(idade<14||idade>99){System.out.println("Idade inválida para o evento.");txtResultado.setText("Idade inválida para o evento.");}
 else{System.out.println("Inscrição confirmada!");txtResultado.setText(nome+", sua inscrição foi confirmada!");}}
 catch(NumberFormatException e){System.out.println("Idade inválida para o evento.");txtResultado.setText("Idade inválida para o evento.");}});}}
