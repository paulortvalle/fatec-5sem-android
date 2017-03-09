package io.paulortvalle.aula03calc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView lblResultado;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        lblResultado = (TextView) findViewById(R.id.lblResultado);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        String resultado;

        Intent it = getIntent();
        Bundle param = it.getExtras();

        if(param != null) {

            resultado = param.getString("resultado");


            lblResultado.setText(resultado);

        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(),MainActivity.class);
                startActivity(it);
            }

        });
    }
}
