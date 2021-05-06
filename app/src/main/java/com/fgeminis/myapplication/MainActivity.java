package com.fgeminis.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> data = new ArrayList<String>();
    private ArrayList<String> data1 = new ArrayList<String>();
    private ArrayList<String> data2 = new ArrayList<String>();
    private ArrayList<String> data3 = new ArrayList<String>();

    private TableLayout table;

    EditText ed1, ed2,ed3, ed4, ed5, ed6;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);

        ed4 = findViewById(R.id.txtsub);
        ed5 = findViewById(R.id.txtpag);
        ed6 = findViewById(R.id.txtsal);

        boton = findViewById(R.id.boton);

        boton.OnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void add()
    {
        int tot;
        String = ed1.getText().toString();
        int precio = Integer.parseInt(ed2.getText().toString());
        int cantidad = Integer.parseInt(ed3.getText().toString());
        tot = precio * cantidad;
    }



}