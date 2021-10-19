package mx.edu.tesoem.isc.g7s21hugo4295p3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    TextView lblsaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        lblsaludo = findViewById(R.id.lblsaludo);

        Bundle parametros = getIntent().getExtras();

        lblsaludo.setText("Bienvenido " + parametros.getString("nombrecompleto"));

    }
}