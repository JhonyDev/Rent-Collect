package com.chameleon.rentcollectnew.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chameleon.rentcollectnew.R;

public class PastPayments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_payments);
    }

    public void nextActivity(View view) {
        startActivity(new Intent(this, OfferActivity.class));
    }
}