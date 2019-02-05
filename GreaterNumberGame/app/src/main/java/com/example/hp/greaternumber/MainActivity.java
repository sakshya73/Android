package com.example.hp.greaternumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int num1,num2,points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        points=0;
        picknumbers();
    }
    private void picknumbers()
    {
        TextView pointview = (TextView)findViewById(R.id.points_view);
        pointview.setText("Points: "+ points);

        Random r=new Random();
        num1=r.nextInt(100);
        num2=r.nextInt(100);

        Button left=(Button)findViewById(R.id.leftButton);
        Button right=(Button)findViewById(R.id.rightButton);

        left.setText(String.valueOf(num1));
        right.setText(String.valueOf(num2));
    }

    public void leftBottonClick(View view) {
        if(num1>num2)
            points++;
        else
            points--;
        picknumbers();
    }

    public void rightBottonClick(View view) {
        if(num2>num1)
            points++;
        else
            points--;
        picknumbers();
    }
}
