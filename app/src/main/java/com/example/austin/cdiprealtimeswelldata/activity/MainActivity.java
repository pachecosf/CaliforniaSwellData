package com.example.austin.cdiprealtimeswelldata.activity;

import android.annotation.TargetApi;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.austin.cdiprealtimeswelldata.R;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button northernCalifornia;
    private Button montereyBay;
    private Button centralCoast;
    private Button southernCalifornia;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        northernCalifornia = (Button) findViewById(R.id.northern_california);
        northernCalifornia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNorthernCalifornia();
            }
        });

        montereyBay = (Button) findViewById(R.id.monterey_bay);
        montereyBay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMontereyBay();
            }
        });

        centralCoast = (Button) findViewById(R.id.central_coast);
        centralCoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCentralCoast();
            }
        });

        southernCalifornia = (Button) findViewById(R.id.southern_california);
        southernCalifornia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSouthernCalifornia();
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        setStatusBarColor();

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setStatusBarColor() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
    }



    public void openNorthernCalifornia(){
        Intent intent = new Intent(this, SwellMapActivity.class);
        intent.putExtra("Location", "Northern California");
        startActivity(intent);
    }

    public void openMontereyBay(){
        Intent intent = new Intent(this, SwellMapActivity.class);
        intent.putExtra("Location", "Monterey Bay");
        startActivity(intent);
    }

    public void openCentralCoast(){
        Intent intent = new Intent(this, SwellMapActivity.class);
        intent.putExtra("Location", "Central Coast");
        startActivity(intent);
    }

    public void openSouthernCalifornia(){
        Intent intent = new Intent(this, SwellMapActivity.class);
        intent.putExtra("Location", "Southern California");
        startActivity(intent);
    }

}


