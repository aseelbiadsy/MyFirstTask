package com.example.mytaskfi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNum;
    Button btnPlus,btnMin;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void  init()
    {
        btnPlus=findViewById(R.id.btnPlus);
        btnMin=findViewById(R.id.btmMin);
        tvNum=findViewById(R.id.tvNum);
    }
    public void PLUS(View view)
    {
        count++;
        tvNum.setText(count + "");
        btnPlus.setText("X");/*hmra (+-->x) */
        if(count==10)
        {  btnPlus.setEnabled(false);
           btnPlus.setBackgroundColor(Color.rgb(0,100,0));
        }
    }
    public void Min(View view) {
        if(count>0)
        {
            count--;
            tvNum.setText(count + "");

        }
    }
}