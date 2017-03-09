package io.paulortvalle.aula03passarparametrosactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextView lblMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        lblMensagem = (TextView) findViewById(R.id.lblMensagem);

        String strUsuario;
        String strSenha;

        // inicia intent e o bundle
        Intent it = getIntent();
        Bundle parametros = it.getExtras();

        if(parametros != null) {
            // acessa as informações do bundle com a key
            strUsuario = parametros.getString("usuario");
            strSenha = parametros.getString("senha");

            if("android".equalsIgnoreCase(strUsuario) &&
                    "123".equals(strSenha)){
                lblMensagem.setText("Bem-vindo, " + strUsuario);
            }else{
                Toast.makeText(getBaseContext(), "Usuario ou Senha inválidos!", Toast.LENGTH_SHORT);
                finish();
            }
        }
    }
}
