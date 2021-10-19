package mx.edu.tesoem.isc.g7s21hugo4295p3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre = findViewById(R.id.txtnombre);

    }

    public void OnClic(View v){
        Intent intent = new Intent(this, SaludoActivity.class);
        intent.putExtra("nombrecompleto",txtnombre.getText().toString());
        startActivity(intent);
        finish();
    }
}