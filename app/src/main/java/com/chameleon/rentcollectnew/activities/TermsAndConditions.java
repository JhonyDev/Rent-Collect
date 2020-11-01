package com.chameleon.rentcollectnew.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chameleon.rentcollectnew.R;
import com.chameleon.rentcollectnew.activities.EnterPhoneNumber;

public class TermsAndConditions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);
    }

    public void nextActivity(View view) {
        startActivity(new Intent(this, EnterPhoneNumber.class));
    }
}