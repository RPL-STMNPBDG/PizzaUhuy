package com.hermawan.pizzauhuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    private TextView nama;
    Button selanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        selanjutnya = (Button) findViewById(R.id.selanjutnya);
        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(view.getContext(), MainActivity.class);
                startActivity(o);
                finish();
            }
        });

        nama = findViewById(R.id.nama);
        nama.setText(getIntent().getStringExtra("message"));
    }
}