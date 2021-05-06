package com.fgeminis.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

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

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
    }

    public void add()
    {
        int tot;
        String nombreProd = ed1.getText().toString();
        int precio = Integer.parseInt(ed2.getText().toString());
        int cantidad = Integer.parseInt(ed3.getText().toString());
        tot = precio * cantidad;

        data.add(nombreProd);
        data1.add(String.valueOf(precio));
        data2.add(String.valueOf(cantidad));
        data3.add(String.valueOf(tot));

        TableRow row = new TableRow(this);
        TextView t1 = new TextView(this);
        TextView t2 = new TextView(this);
        TextView t3 = new TextView(this);
        TextView t4 = new TextView(this);

        String total;

        int sum = 0;

        for(int i = 0; i< data.size(); i++)
        {
            String nombrep = data.get(i);
            String prd = data1.get(i);
            String ctd = data2.get(i);
            total = data3.get(i);

            t1.setText(nombrep);
            t2.setText(prd);
            t3.setText(ctd);
            t4.setText(total);

            sum = sum + Integer.parseInt(data3.get(i).toString());


        }

        row.addView(t1);
        row.addView(t2);
        row.addView(t3);
        row.addView(t4);
        table.addView(row);


ed4.setText(String.valueOf(sum));
ed1.setText("");
ed2.setText("");
ed3.setText("");
ed1.requestFocus();
    }



}