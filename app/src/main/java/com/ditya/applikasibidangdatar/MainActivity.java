package com.ditya.applikasibidangdatar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Lingkaran = (Button) findViewById(R.id.lingkaran);

        Lingkaran.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent lingkaran = new Intent(MainActivity.this, lingkaran.class);
                startActivity(lingkaran);
            }
        });
        Button persegipanjang = (Button) findViewById(R.id.persegipanjang);

        persegipanjang.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent persegipanjang = new Intent(MainActivity.this, persegipanjang.class);
                startActivity(persegipanjang);
            }
        });
        Button segitiga = (Button) findViewById(R.id.segitiga);

        segitiga.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent segitiga = new Intent(MainActivity.this, segitiga.class);
                startActivity(segitiga);
            }
        });
        Button persegi = (Button) findViewById(R.id.persegi);

        persegi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent persegi = new Intent(MainActivity.this, persegi.class);
                startActivity(persegi);
            }
        });
        Button trapesium = (Button) findViewById(R.id.trapesium);

        trapesium.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent trapesium = new Intent(MainActivity.this, trapesium.class);
                startActivity(trapesium);
            }
        });
        Button layang2 = (Button) findViewById(R.id.layang2);

        layang2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent layang2 = new Intent(MainActivity.this, layang2.class);
                startActivity(layang2);
            }
        });
        Button belahketupat = (Button) findViewById(R.id.belahketupat);

        belahketupat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent belahketupat = new Intent(MainActivity.this, belahketupat.class);
                startActivity(belahketupat);
            }
        });
        Button jajargenjang = (Button) findViewById(R.id.jajargenjang);

        jajargenjang.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent jajargenjang = new Intent(MainActivity.this, jajargenjang.class);
                startActivity(jajargenjang);
            }
        });
        Button bangundatar = (Button) findViewById(R.id.bangundatar);

        bangundatar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent bangundatar = new Intent(MainActivity.this, bangundatar.class);
                startActivity(bangundatar);
            }
        });
    }
    public void keluar(View view){
        System.exit(0);
    }
}