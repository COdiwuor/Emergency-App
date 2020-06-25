package com.s.emergency_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startPassengerActivity(View v)
    {
        Intent intent = new Intent(v.getContext(), PassengerActivity.class);
        startActivity(intent);
    }

    public void startClientActivity(View v)
    {
        Intent intent = new Intent(v.getContext(), ClientActivity.class);
        startActivity(intent);
    }

    public void startLoginActivity(View v)
    {
        Intent intent = new Intent(v.getContext(), LoginActivity.class);
        startActivity(intent);
    }
}