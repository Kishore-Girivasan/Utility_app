package com.example.utility_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.sql.Driver;
import java.util.Locale;

public class Mainpage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        ImageView cleaning = (ImageView) findViewById(R.id.cleaning);
        ImageView pest = (ImageView) findViewById(R.id.pest);
        ImageView laundry = (ImageView) findViewById(R.id.laundry);
        ImageView painting = (ImageView) findViewById(R.id.painting);
        ImageView driver = (ImageView) findViewById(R.id.driver);
        ImageView repairs = (ImageView) findViewById(R.id.repairs);
        TextView location = (TextView)findViewById(R.id.location_set);
        ImageView profile = (ImageView)findViewById(R.id.profile_photo);
        SearchView searchView = (SearchView)findViewById(R.id.search_view);
        ImageView search = (ImageView)findViewById(R.id.search);
        Intent i = getIntent();
        String location_selected = i.getStringExtra("place");
        location.setText(location_selected);

        cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),CleaningService.class);
                startActivity(i);

            }
        });
        pest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Pest.class);
                startActivity(i);
            }
        });
        painting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Painting.class);
                startActivity(i);
            }
        });
        repairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Repairs.class);
                startActivity(i);
            }
        });
        driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Acting_driver.class);
                startActivity(i);
            }
        });
        laundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Laundry.class);
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
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profile = new Intent(getApplicationContext(),Profile.class);
                startActivity(profile);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent location = new Intent(getApplicationContext(),Location.class);
                startActivity(location);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = searchView.getQuery().toString().toLowerCase(Locale.ROOT);
                switch (query){
                    case "driver":
                    case "cab":
                    case "taxi":
                        Intent q1 = new Intent(getApplicationContext(),Acting_driver.class);
                        startActivity(q1);
                        break;
                    case "cleaning":
                    case "clean":
                        Intent q2 = new Intent(getApplicationContext(),CleaningService.class);
                        startActivity(q2);
                        break;
                    case "laundry":
                    case "laun":
                    case "wash":
                    case "washing":
                    case "washingclothes":
                    case "washing clothes":
                        Intent q3 = new Intent(getApplicationContext(),Laundry.class);
                        startActivity(q3);
                        break;
                    case "repair":
                    case "repairs":
                    case "ac":
                    case "fridge":
                    case "washingmachine":
                    case "washing machine":
                    case "tv":
                    case "television":
                    case "chimney":
                    case "laptop":
                    case "pc":
                    case "computer":
                    case "heater":
                    case "geyser":
                    case "purifier":
                    case "water purifier":
                    case "microwave":
                    case "oven":
                        Intent q4 = new Intent(getApplicationContext(),Repairs.class);
                        startActivity(q4);
                        break;
                    case "paint":
                    case "painting":
                        Intent q5 = new Intent(getApplicationContext(),Painting.class);
                        startActivity(q5);
                        break;
                    case "pest":
                    case "insect":
                        Intent q6 = new Intent(getApplicationContext(),Pest.class);
                        startActivity(q6);
                        break;

                }

            }
        });



    }
}