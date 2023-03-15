package com.hermawan.pizzauhuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView myorder;
    String deliper, taken, dinen, quicke, point, vou, yumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView maenue = (ImageView) findViewById(R.id.unem);

        maenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yumen = "Ini halaman menu";
                Intent sendData = new Intent(MainActivity.this, Halaman.class);
                sendData.putExtra("Data1", yumen);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        ImageView myvoucher = (ImageView) findViewById(R.id.vouch);

        myvoucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vou = "Ini halaman my voucher";
                Intent sendData = new Intent(MainActivity.this, Halaman.class);
                sendData.putExtra("Data1", vou);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        ImageView mypoint = (ImageView) findViewById(R.id.poin);

        mypoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point = "Ini halaman my point";
                Intent sendData = new Intent(MainActivity.this, Halaman.class);
                sendData.putExtra("Data1", point);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        ImageView quickreor = (ImageView) findViewById(R.id.quick);

        quickreor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quicke = "Ini halaman quick reorder";
                Intent sendData = new Intent(MainActivity.this, Halaman.class);
                sendData.putExtra("Data1", quicke);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        ImageView dinein = (ImageView) findViewById(R.id.dine);

        dinein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dinen = "Ini halaman dine in";
                Intent sendData = new Intent(MainActivity.this, Halaman.class);
                sendData.putExtra("Data1", dinen);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        ImageView takeaway = (ImageView) findViewById(R.id.take);

        takeaway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                taken = "Ini halaman take away";
                Intent sendData = new Intent(MainActivity.this, Halaman.class);
                sendData.putExtra("Data1", taken);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        ImageView delivery = (ImageView) findViewById(R.id.deli);

        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deliper = "Ini halaman delivery";
                Intent sendData = new Intent(MainActivity.this, Halaman.class);
                sendData.putExtra("Data1", deliper);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        myorder = (ImageView) findViewById(R.id.pencetorder);
        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(view.getContext(), MyOrder.class);
                startActivity(o);
                finish();
            }
        });
    }
}