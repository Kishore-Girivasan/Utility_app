package com.example.utility_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        @SuppressLint("UseSwitchCompatOrMaterialCode")
        Switch mode = findViewById(R.id.dark_mode_switch);
        mode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        LinearLayout billing = (LinearLayout)findViewById(R.id.billing_details);
        billing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent billing = new Intent(getApplicationContext(),Billing_details.class);
                startActivity(billing);
            }
        });
        LinearLayout privacy = (LinearLayout)findViewById(R.id.privacy);
        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent privacy = new Intent(getApplicationContext(),Privacy.class);
                startActivity(privacy);
            }
        });
        LinearLayout plus = (LinearLayout)findViewById(R.id.plus_layout);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent plus = new Intent(getApplicationContext(),Plus.class);
                startActivity(plus);
            }
        });
        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(),Mainpage.class);
                startActivity(back);
            }
        });
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        Intent i = new Intent(getApplicationContext(),Mainpage.class);
                        startActivity(i);
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_plus:
                        Intent i1 = new Intent(getApplicationContext(),Plus.class);
                        overridePendingTransition(0,0);
                        startActivity(i1);
                        return true;
                    case R.id.navigation_profile:
                        Intent i2 = new Intent(getApplicationContext(),Profile.class);
                        overridePendingTransition(0,0);
                        startActivity(i2);
                        return true;
                }
                return false;
            }
        });
    }
}