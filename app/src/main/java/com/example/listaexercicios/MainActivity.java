package com.example.listaexercicios;
import android.content.Intent; import android.os.Bundle; import android.widget.Button; import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
 protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_main);
 int[] ids={R.id.btnEx1,R.id.btnEx2,R.id.btnEx3,R.id.btnEx4,R.id.btnEx5,R.id.btnEx6,R.id.btnEx7};
 Class<?>[] telas={Exercicio1Activity.class,Exercicio2Activity.class,Exercicio3Activity.class,Exercicio4Activity.class,Exercicio5Activity.class,Exercicio6Activity.class,Exercicio7Activity.class};
 for(int i=0;i<ids.length;i++){final int n=i;((Button)findViewById(ids[i])).setOnClickListener(v->startActivity(new Intent(this,telas[n])));}}
}
