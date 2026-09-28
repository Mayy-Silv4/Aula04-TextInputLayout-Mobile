package com.example.listaexercicios;
import android.os.Bundle; import android.widget.*; import androidx.appcompat.app.AppCompatActivity;
public class Exercicio6Activity extends AppCompatActivity {
 EditText etxtProduto,etxtPreco,etxtQuantidade; TextView txtResultado;
 protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_exercicio6);
 etxtProduto=findViewById(R.id.etxtProduto);etxtPreco=findViewById(R.id.etxtPreco);etxtQuantidade=findViewById(R.id.etxtQuantidade);txtResultado=findViewById(R.id.txtResultado);
 findViewById(R.id.btn_Cadastrar).setOnClickListener(v->{String produto=etxtProduto.getText().toString(),precoTexto=etxtPreco.getText().toString(),qtdTexto=etxtQuantidade.getText().toString();
 System.out.println("Produto: "+produto);System.out.println("Preço: R$ "+precoTexto);System.out.println("Quantidade: "+qtdTexto);
 try{double preco=Double.parseDouble(precoTexto.replace(",","."));int qtd=Integer.parseInt(qtdTexto);
 if(preco<=0){System.out.println("Preço inválido!");txtResultado.setText("Preço inválido!");}
 else{double estoque=preco*qtd;System.out.println("Produto cadastrado!");txtResultado.setText(produto+" cadastrado! Valor em estoque: R$ "+estoque);}}
 catch(NumberFormatException e){System.out.println("Preço inválido!");txtResultado.setText("Preço inválido!");}});}}
