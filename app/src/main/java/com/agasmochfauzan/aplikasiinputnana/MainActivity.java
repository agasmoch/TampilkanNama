package com.agasmochfauzan.aplikasiinputnana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String tampilkannama;
    EditText namabebas;
    TextView namanyaterserah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namanyaterserah=findViewById(R.id.textView);
        namabebas=findViewById(R.id.editText);
    }

    public void TampilkanNama(View view) {
        namanyaterserah.setText("Nama Anda: "+namabebas.getText());

    }
}
