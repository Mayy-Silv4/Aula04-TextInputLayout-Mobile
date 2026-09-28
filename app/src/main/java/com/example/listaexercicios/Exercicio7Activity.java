package com.example.listaexercicios;
import android.os.Bundle; import android.widget.*; import androidx.appcompat.app.AppCompatActivity;
public class Exercicio7Activity extends AppCompatActivity {
 EditText etxtEmail,etxtConfirmarEmail; TextView txtResultado;
 protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_exercicio7);
 etxtEmail=findViewById(R.id.etxtEmail);etxtConfirmarEmail=findViewById(R.id.etxtConfirmarEmail);txtResultado=findViewById(R.id.txtResultado);
 findViewById(R.id.btn_Recuperar).setOnClickListener(v->{String email=etxtEmail.getText().toString(),confirmacao=etxtConfirmarEmail.getText().toString();
 System.out.println("E-mail: "+email);System.out.println("Confirmação: "+confirmacao);
 if(email.equals(confirmacao)){System.out.println("Link enviado para "+email);txtResultado.setText("Link enviado para "+email);}
 else{System.out.println("Os e-mails não conferem!");txtResultado.setText("Os e-mails não conferem!");}});}}
