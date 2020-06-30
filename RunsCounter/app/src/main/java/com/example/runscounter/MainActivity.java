package com.example.runscounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Integer rcb=0,csk=0;
    TextView tvrcb,tvcsk;
    Button brcbfour,brcbsix,brcbone,bcskfour,bcsksix,bcskone,breset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvcsk=findViewById(R.id.cskruns);
        tvrcb=findViewById(R.id.rcbruns);
        bcskfour=findViewById(R.id.cskfour);
        bcsksix=findViewById(R.id.csksix);
        bcskone=findViewById(R.id.cskone);
        brcbfour=findViewById(R.id.rcbfour);
        brcbsix=findViewById(R.id.rcbsix);
        brcbone=findViewById(R.id.rcbone);
        breset=findViewById(R.id.reset);




    }
    public void setBrcbsix(View view)
    {
        rcb=rcb+6;
        tvrcb.setText(rcb.toString());
    }
    public void setBrcbfour(View view)
    {
        rcb=rcb+4;
        tvrcb.setText(rcb.toString());
    }
    public void setBcskfour(View view)
    {
        csk=csk+4;
        tvcsk.setText(csk.toString());
    }

    public void setBcsksix(View view)
    {
        csk=csk+6;
        tvcsk.setText(csk.toString());
    } public void setBcskone(View view)
    {
        csk=csk+1;
        tvcsk.setText(csk.toString());
    }
    public void setBrcbone(View view)
    {
        rcb=rcb+1;
        tvrcb.setText(rcb.toString());
    }
    public void setreset(View view)
    {
        rcb=0;
        csk=0;
        tvrcb.setText(rcb.toString());
        tvcsk.setText(csk.toString());
    }

}
