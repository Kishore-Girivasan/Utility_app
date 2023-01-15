package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Pest extends AppCompatActivity {
    String booking ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pest);
        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(),Mainpage.class);
                startActivity(back);
            }
        });
        ImageView book = (ImageView) findViewById(R.id.book);
        CheckBox home = (CheckBox) findViewById(R.id.Home);
        CheckBox office = (CheckBox) findViewById(R.id.Office);
        CheckBox gardens = (CheckBox) findViewById(R.id.Gardens);
        CheckBox farm = (CheckBox) findViewById(R.id.Farm_Lands);
        CheckBox others = (CheckBox) findViewById(R.id.Others);

        home.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    office.setChecked(false);
                    gardens.setChecked(false);
                    farm.setChecked(false);
                    others.setChecked(false);
                }
                booking = "Home";
            }
        });
        office.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    home.setChecked(false);
                    gardens.setChecked(false);
                    farm.setChecked(false);
                    others.setChecked(false);
                }
                booking = "Office";
            }
        });
        others.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    office.setChecked(false);
                    gardens.setChecked(false);
                    farm.setChecked(false);
                    home.setChecked(false);
                }
                booking = "Others";
            }
        });
        farm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    office.setChecked(false);
                    gardens.setChecked(false);
                    home.setChecked(false);
                    others.setChecked(false);
                }
                booking = "Farm Lands";
            }
        });
        gardens.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    office.setChecked(false);
                    home.setChecked(false);
                    farm.setChecked(false);
                    others.setChecked(false);
                }
                booking = "Gardens";
            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(home.isChecked() || office.isChecked() || gardens.isChecked() || farm.isChecked() || others.isChecked()){
                    String msg = "Booking Details :"+"\nPest Booking for "+booking;
                    Intent i = new Intent(getApplicationContext(),Bookings.class);
                    i.putExtra("Booking_details",msg);
                    startActivity(i);
                    Toast.makeText(Pest.this, "Booked Succesfully for "+booking, Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please fill required details.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}