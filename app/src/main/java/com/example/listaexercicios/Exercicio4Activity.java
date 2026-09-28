package com.example.listaexercicios;
import android.os.Bundle; import android.widget.*; import androidx.appcompat.app.AppCompatActivity;
public class Exercicio4Activity extends AppCompatActivity {
 EditText etxtEmail,etxtSenha; TextView txtResultado;
 protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_exercicio4);
 etxtEmail=findViewById(R.id.etxtEmail);etxtSenha=findViewById(R.id.etxtSenha);txtResultado=findViewById(R.id.txtResultado);
 findViewById(R.id.btn_Entrar).setOnClickListener(v->{String email=etxtEmail.getText().toString(),senha=etxtSenha.getText().toString();
 System.out.println("E-mail digitado: "+email);System.out.println("Senha com "+senha.length()+" caracteres");
 if(senha.length()<6){System.out.println("Senha muito curta! Mínimo 6 caracteres.");txtResultado.setText("Senha muito curta! Mínimo 6 caracteres.");}
 else{System.out.println("Login realizado: "+email);txtResultado.setText("Bem-vindo(a), "+email+"!");}});}}
