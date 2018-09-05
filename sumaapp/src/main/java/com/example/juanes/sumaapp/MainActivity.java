package com.example.juanes.sumaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enumero1, enumero2;
    private TextView tresultado;
    private Button bsumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enumero1 = findViewById(R.id.enumero1);
        enumero2 = findViewById(R.id.enumero2);
        bsumar = findViewById(R.id.bsuma);
        tresultado= findViewById(R.id.tresultado);

        bsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2, suma;
                num1=Integer.parseInt(enumero1.getText().toString());
                num2=Integer.parseInt(enumero2.getText().toString());

                suma=num1+num2;
                tresultado.setText(String.valueOf(suma));

            }
        });
    }
}
