package io.paulortvalle.aula02calc;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

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

        txNumero1 = (TextView) findViewById(R.id.txNumero1);
        txNumero2 = (TextView) findViewById(R.id.txNumero2);
        btSoma = (Button) findViewById(R.id.btSoma);
        btSubtrai = (Button) findViewById(R.id.btSubtrai);
        btMultiplica = (Button) findViewById(R.id.btMultiplica);
        btDivide = (Button) findViewById(R.id.btDivide);
        txResultado = (TextView) findViewById(R.id.txResultado);

        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long resultado;
                long valor1 = Long.parseLong(txNumero1.getText().toString());
                long valor2 = Long.parseLong(txNumero2.getText().toString());
                resultado = valor1 + valor2;
                txResultado.setText(String.valueOf(resultado));
            }
        });

        btSubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long resultado;
                long valor1 = Long.parseLong(txNumero1.getText().toString());
                long valor2 = Long.parseLong(txNumero2.getText().toString());
                resultado = valor1 - valor2;
                txResultado.setText(String.valueOf(resultado));
            }
        });

        btMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long resultado;
                long valor1 = Long.parseLong(txNumero1.getText().toString());
                long valor2 = Long.parseLong(txNumero2.getText().toString());
                resultado = valor1 * valor2;
                txResultado.setText(String.valueOf(resultado));
            }
        });

        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long resultado;
                long valor1 = Long.parseLong(txNumero1.getText().toString());
                long valor2 = Long.parseLong(txNumero2.getText().toString());
                resultado = valor1 / valor2;
                txResultado.setText(String.valueOf(resultado));
            }
        });
    }
}
