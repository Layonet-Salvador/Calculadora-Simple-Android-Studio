package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 =(EditText)findViewById(R.id.valor1);
        et2 =(EditText)findViewById(R.id.valor2);
        res =(TextView)findViewById(R.id.resultado);
    }

    public void suma(View view)
    {
    if(et1.getText().toString().equals("") || et2.getText().toString().equals("")  )
        {
            et1.setError("Falta numero");
            Toast.makeText(this,"Ingresa el valor que falta",Toast.LENGTH_LONG).show();
        }
        else {

            String val1 = et1.getText().toString();
            String val2 = et2.getText().toString();
            int valfinal1 = Integer.parseInt(val1);
            int valfinal2 = Integer.parseInt(val2);
            int suma = valfinal1 + valfinal2;

            String resultado = String.valueOf(suma);
            res.setText(resultado);
        }
    }
    public void resta(View view)
    {
        String val1= et1.getText().toString();
        String val2= et2.getText().toString();
        int valfinal1 = Integer.parseInt(val1);
        int valfinal2 = Integer.parseInt(val2);
        int resta = valfinal1 - valfinal2;

        String resultado = String.valueOf(resta);
        res.setText(resultado);
    }
    public void limpiar(View view)
    {
    et1.setText("");
    et2.setText("");
    res.setText("");
    }
}
