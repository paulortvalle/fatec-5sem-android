package io.paulortvalle.aula02chamandoactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

public class MainActivity extends Activity {

    private Button btMenuTela1;
    private Button btMenuTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMenuTela1 = (Button) findViewById(R.id.btMenuTela1);
        btMenuTela2 = (Button) findViewById(R.id.btMenuTela2);

        btMenuTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(),tela1.class);
                startActivity(it);
            }
        });

        btMenuTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(),Tela2.class);
                startActivity(it);
            }
        });
    }
}
