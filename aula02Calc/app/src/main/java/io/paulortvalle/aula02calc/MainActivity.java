package io.paulortvalle.aula02calc;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    /*
    O objetivo deste exercício é demonstrar como os objetos são
    linkados entre a classe e o layout da Activity. Além disso,
    como funciona o método Listener para ativar os cliques do
    botão da aplicação
    */

    // cria os campos como propriedade da classe
    private TextView txNumero1;
    private TextView txNumero2;
    private Button btSoma;
    private Button btSubtrai;
    private Button btMultiplica;
    private Button btDivide;
    private TextView txResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // relaciona as propriedades com os objetos do layout
        txNumero1 = (TextView) findViewById(R.id.txNumero1);
        txNumero2 = (TextView) findViewById(R.id.txNumero2);
        btSoma = (Button) findViewById(R.id.btSoma);
        btSubtrai = (Button) findViewById(R.id.btSubtrai);
        btMultiplica = (Button) findViewById(R.id.btMultiplica);
        btDivide = (Button) findViewById(R.id.btDivide);
        txResultado = (TextView) findViewById(R.id.txResultado);

        // ativa o Listener para o Botão
        btSoma.setOnClickListener(new View.OnClickListener() {

            // Sobrescreve o método onClick para quando o usuário clicar o botão
            @Override
            public void onClick(View v) {

                // executa a ação do botão
                Calculate calc = new Calculate();
                txResultado.setText(calc.Soma(txNumero1.getText().toString(), txNumero2.getText().toString()));

            }
        });

        btSubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculate calc = new Calculate();
                txResultado.setText(calc.Subtrai(txNumero1.getText().toString(), txNumero2.getText().toString()));
            }
        });

        btMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculate calc = new Calculate();
                txResultado.setText(calc.Multiplica(txNumero1.getText().toString(), txNumero2.getText().toString()));
            }
        });

        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculate calc = new Calculate();
                txResultado.setText(calc.Divide(txNumero1.getText().toString(), txNumero2.getText().toString()));
            }
        });
    }
}
