package com.example.dairehesapla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ycap ;
    TextView sonuc;
    RadioButton alan;
    RadioButton cevre;
    Daire d=new Daire();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ycap=(EditText) findViewById(R.id.editText);
        sonuc=(TextView) findViewById(R.id.textView);
        cevre=(RadioButton) findViewById(R.id.radioButton);
        alan=(RadioButton) findViewById(R.id.radioButton2);

        cevre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.yaricap=Double.valueOf(ycap.getText().toString());
                sonuc.setText("Çevre= "+d.Cevre());
            }
        });

        alan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.yaricap=Double.valueOf(ycap.getText().toString());
                sonuc.setText("Alan= "+d.Alan());

            }
        });
    }
}
