package com.hermawan.pizzauhuy;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Payment extends AppCompatActivity {
    Button kembalian;
    TextView sisa;
    double Angka1, Angka2;
    EditText uang;
    ImageView myhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        myhome = findViewById(R.id.pencethome);
        myhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(view.getContext(), MainActivity.class);
                startActivity(o);
                finish();
            }
        });

        TextView getdata5 = findViewById(R.id.produkmuncul);
        TextView getdata6 = findViewById(R.id.hargamuncul);
        sisa = (TextView) findViewById(R.id.sisa);
        uang = (EditText) findViewById(R.id.uang);

        getdata5.setText(getIntent().getStringExtra("Data1"));
        getdata6.setText(getIntent().getStringExtra("Data2"));

        kembalian = (Button) findViewById(R.id.kembalian);
        kembalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata6.getText().toString());
                Angka2 = Double.parseDouble(uang.getText().toString());
                if (Angka2 < Angka1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Payment.this);
                    builder.setMessage("Nominal kamu kurang!")
                            .setNegativeButton("Baik", null).create().show();
                } else {
                    Toast.makeText(getApplicationContext(), "Terimakasih Sudah Membeli", Toast.LENGTH_SHORT).show();
                    sisa.setText(Double.toString(Angka2 - Angka1));
                }
            }
        });

        // Batas

        TextView getdata3 = findViewById(R.id.produkmuncul);
        TextView getdata4 = findViewById(R.id.hargamuncul);
        sisa = (TextView) findViewById(R.id.sisa);
        uang = (EditText) findViewById(R.id.uang);

        getdata3.setText(getIntent().getStringExtra("Data1"));
        getdata4.setText(getIntent().getStringExtra("Data2"));

        kembalian = (Button) findViewById(R.id.kembalian);
        kembalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata4.getText().toString());
                Angka2 = Double.parseDouble(uang.getText().toString());
                if (Angka2 < Angka1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Payment.this);
                    builder.setMessage("Nominal kamu kurang!")
                            .setNegativeButton("Baik", null).create().show();
                } else {
                    Toast.makeText(getApplicationContext(), "Terimakasih Sudah Membeli", Toast.LENGTH_SHORT).show();
                    sisa.setText(Double.toString(Angka2 - Angka1));
                }
            }
        });

        // Batas

        TextView getdata1 = findViewById(R.id.produkmuncul);
        TextView getdata2 = findViewById(R.id.hargamuncul);
        sisa = (TextView) findViewById(R.id.sisa);
        uang = (EditText) findViewById(R.id.uang);

        getdata1.setText(getIntent().getStringExtra("Data1"));
        getdata2.setText(getIntent().getStringExtra("Data2"));

        kembalian = (Button) findViewById(R.id.kembalian);
        kembalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata2.getText().toString());
                Angka2 = Double.parseDouble(uang.getText().toString());
                if (Angka2 < Angka1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Payment.this);
                    builder.setMessage("Nominal kamu kurang!")
                            .setNegativeButton("Baik", null).create().show();
                } else {
                    Toast.makeText(getApplicationContext(), "Terimakasih Sudah Membeli", Toast.LENGTH_SHORT).show();
                    sisa.setText(Double.toString(Angka2 - Angka1));
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(), MyOrder.class);
        startActivity(i);
        finish();
    }
}