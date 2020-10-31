package com.chameleon.rentcollectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NotYou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_you);
    }

    public void nextActivity(View view) {
        startActivity(new Intent(this, TotalDue.class));
    }
}