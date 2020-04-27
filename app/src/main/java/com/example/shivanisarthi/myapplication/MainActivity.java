package com.example.shivanisarthi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                double vmile = Double.valueOf(editText.getText().toString());
                double vkm = vmile / 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                editText2.setText(formatval.format(vkm));


            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                EditText editText= (EditText) findViewById(R.id.editText);
                EditText editText2= (EditText) findViewById(R.id.editText2);
                double vkm= Double.valueOf(editText2.getText().toString());
                double vmile= vkm*0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                editText.setText(formatval.format(vmile));


            }
        });
    }
}
