package com.s.emergency_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }

    public void startTechnicianActivity(View v)
    {
        Intent intent = new Intent(v.getContext(), TechnicianActivity.class);
        startActivity(intent);
    }
}