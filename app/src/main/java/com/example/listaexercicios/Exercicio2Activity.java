package com.example.listaexercicios;
import android.os.Bundle; import android.widget.*; import androidx.appcompat.app.AppCompatActivity;
public class Exercicio2Activity extends AppCompatActivity {
 EditText etxtNomePet,etxtEspecie,etxtIdadePet; TextView txtResultado;
 protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_exercicio2);
 etxtNomePet=findViewById(R.id.etxtNomePet);etxtEspecie=findViewById(R.id.etxtEspecie);etxtIdadePet=findViewById(R.id.etxtIdadePet);txtResultado=findViewById(R.id.txtResultado);
 findViewById(R.id.btn_CadastrarPet).setOnClickListener(v->{String nome=etxtNomePet.getText().toString(),esp=etxtEspecie.getText().toString(),idade=etxtIdadePet.getText().toString();
 System.out.println("Nome: "+nome);System.out.println("Espécie: "+esp);System.out.println("Idade: "+idade+" anos");txtResultado.setText(nome+" ("+esp+"), "+idade+" anos, cadastrado com sucesso!");});}}
