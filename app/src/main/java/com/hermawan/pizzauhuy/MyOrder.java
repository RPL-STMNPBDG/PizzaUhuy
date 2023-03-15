package com.hermawan.pizzauhuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyOrder extends AppCompatActivity {
    ImageView myhome;
    String namaproduk, hargaproduk, namaproduk2, hargaproduk2, namaproduk3, hargaproduk3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        myhome = findViewById(R.id.pencethome);
        myhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(view.getContext(), MainActivity.class);
                startActivity(o);
                finish();
            }
        });

        // Batas

        ImageView udang = (ImageView) findViewById(R.id.prod1);

        udang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaproduk = "Pizza Udang";
                hargaproduk = "50000";

                Intent sendData = new Intent(MyOrder.this, Payment.class);
                sendData.putExtra("Data1", namaproduk);
                sendData.putExtra("Data2", hargaproduk);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        ImageView tempe = (ImageView) findViewById(R.id.prod2);

        tempe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaproduk2 = "Pizza Tempe";
                hargaproduk2 = "45000";

                Intent sendData = new Intent(MyOrder.this, Payment.class);
                sendData.putExtra("Data1", namaproduk2);
                sendData.putExtra("Data2", hargaproduk2);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        ImageView donat = (ImageView) findViewById(R.id.prod3);

        donat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaproduk3 = "Pizza Donat";
                hargaproduk3 = "54000";

                Intent sendData = new Intent(MyOrder.this, Payment.class);
                sendData.putExtra("Data1", namaproduk3);
                sendData.putExtra("Data2", hargaproduk3);
                startActivity(sendData);
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }
}