package com.chameleon.rentcollectnew.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.chameleon.rentcollectnew.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoTermsAndConditions(View view) {
        startActivity(new Intent(this, TermsAndConditions.class));
    }
}