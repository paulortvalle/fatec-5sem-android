package io.paulortvalle.aula03calc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    O objetivo deste exercício é demonstrar o processo
    de passagem de parametros para outra Activity.
    */

    private TextView txtValor1;
    private TextView txtValor2;

    private Button btnSomar;
    private Button btnSubtrair;
    private Button btnMultiplicar;
    private Button btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValor1 = (TextView) findViewById(R.id.txtValor1);
        txtValor2 = (TextView) findViewById(R.id.txtValor2);

        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);

        btnSomar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Calculate calc = new Calculate();
                startAct(calc.soma(txtValor1.getText().toString(), txtValor2.getText().toString()));

            }

        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Calculate calc = new Calculate();
                startAct(calc.subtrai(txtValor1.getText().toString(), txtValor2.getText().toString()));

            }

        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Calculate calc = new Calculate();
                startAct(calc.multiplica(txtValor1.getText().toString(), txtValor2.getText().toString()));

            }

        });

        btnDividir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Calculate calc = new Calculate();
                startAct(calc.divide(txtValor1.getText().toString(), txtValor2.getText().toString()));

            }

        });

    }

    protected void startAct(String resultado){

        Intent it = new Intent(getBaseContext(),Resultado.class);

        Bundle param = new Bundle();
        param.putString("resultado",resultado);

        it.putExtras(param);

        startActivity(it);

    }
}
