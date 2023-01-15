package com.example.utility_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Plus extends AppCompatActivity {
    private String upgrade;
    private String validity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);
        ImageView back = (ImageView) findViewById(R.id.back);
        ImageView basic = (ImageView) findViewById(R.id.basic);
        ImageView premium = (ImageView) findViewById(R.id.premium);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(),Mainpage.class);
                startActivity(back);
            }
        });

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Plus.this, "You have upgraded to plus member with BASIC Membership", Toast.LENGTH_LONG).show();
                upgrade = "BASIC PLAN";
                validity = "6 Months";
                String msg = "Thankyou for upgrading to "+upgrade +"with "+validity;
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
            }
        });
        premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Plus.this, "You have upgraded to plus member with PREMIUM Membership", Toast.LENGTH_LONG).show();
                upgrade = "PREMIUM PLAN";
                validity = "12 Months";
                String msg = "Thankyou for upgrading to "+upgrade +"with "+validity;
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
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