package com.example.trabalhocalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText valor1, valor2, resultado;
    Button operacaoSoma, operacaoSubtracao, operacaoMultiplicacao, operacaoDivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        resultado = findViewById(R.id.resultado);
        operacaoSoma = findViewById(R.id.operacaoSoma);
        operacaoSubtracao = findViewById(R.id.operacaoSubtracao);
        operacaoMultiplicacao = findViewById(R.id.operacaoMultiplicacao);
        operacaoDivisao = findViewById(R.id.operacaoDivisao);
    }

        public void operacaoSomar (View v)
        {
            int n1 = Integer.parseInt(valor1.getText().toString());
            int n2 = Integer.parseInt(valor2.getText().toString());
            int soma = n1 + n2;
            resultado.setText(String.valueOf(soma));
        }

        public void operacaoSubtrair (View v) {
            int n1 = Integer.parseInt(valor1.getText().toString());
            int n2 = Integer.parseInt(valor2.getText().toString());
            int subtracao = n1 - n2;

            resultado.setText(String.valueOf(subtracao));
        }
        public void operacaoMultiplicar (View v) {
            int n1 = Integer.parseInt(valor1.getText().toString());
            int n2 = Integer.parseInt(valor2.getText().toString());
            int multiplicacao = n1 * n2;

            resultado.setText(String.valueOf(multiplicacao));
        }

       public void operacaoDividir (View v)
    {
        int n1 = Integer.parseInt(valor1.getText().toString());
        int n2 = Integer.parseInt(valor2.getText().toString());
        int divisao = n1 / n2;

        resultado.setText(String.valueOf(divisao));
    }
}