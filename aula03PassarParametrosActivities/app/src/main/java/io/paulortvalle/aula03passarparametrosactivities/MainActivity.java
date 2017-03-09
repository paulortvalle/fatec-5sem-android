package io.paulortvalle.aula03passarparametrosactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    O objetivo desta aula é mostrar como funciona a troca de parametros
    entre as activities de um projeto. Diferente de uma classe ou de
    uma função, para enviar parametros para outra activity você precisa
    usar um objeto Bundle que possuí dois valores: key e value.
    */

    private EditText txUsuario;
    private EditText txSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txUsuario = (EditText) findViewById(R.id.txUsuario);
        txSenha = (EditText) findViewById(R.id.txSenha);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(),LoginActivity.class);

                // cria o objeto Bundle e adiciona a ele os valores
                Bundle param = new Bundle();
                param.putString("usuario",txUsuario.getText().toString());
                param.putString("senha",txSenha.getText().toString());

                // insere no Intent os valores do Bundle
                it.putExtras(param);

                startActivity(it);
            }

        });

    }
}
