package com.ditya.applikasibidangdatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class jajargenjang extends AppCompatActivity {

    private EditText aabtxt;
    private  EditText cdtxt;
    private EditText datxt;
    private EditText bctxt;
    private EditText ttxt;
    private EditText hasil;
    private Button luas;
    private Button keliling;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajargenjang);
        aabtxt = (EditText) findViewById(R.id.aabtxt);
        bctxt = (EditText) findViewById(R.id.bctxt);
        cdtxt = (EditText) findViewById(R.id.cdtxt);
        datxt = (EditText) findViewById(R.id.datxt);
        ttxt = (EditText) findViewById(R.id.ttxt) ;
        hasil = (EditText) findViewById(R.id.hasil);
        luas = (Button) findViewById(R.id.luas);
        keliling = (Button) findViewById(R.id.keliling);
    }

    public void luas8(View view) {
        try {

            int aab = Integer.parseInt(aabtxt.getText().toString());
            int t = Integer.parseInt(ttxt.getText().toString());
            double luas =  t * aab;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void keliling8(View view) {
        try {

            int aab = Integer.parseInt(aabtxt.getText().toString());
            int bc = Integer.parseInt(bctxt.getText().toString());
            int cd = Integer.parseInt(cdtxt.getText().toString());
            int da = Integer.parseInt(datxt.getText().toString());
            double keliling =  aab + bc + cd + da;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void kembali8(View view){
        finish();
    }

}
