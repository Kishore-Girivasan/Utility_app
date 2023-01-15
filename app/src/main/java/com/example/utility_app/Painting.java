package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Painting extends AppCompatActivity {
    String room,time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting);
        ImageView confirm = (ImageView) findViewById(R.id.confirm);
        ImageView back = (ImageView) findViewById(R.id.back);
        CheckBox r1 = (CheckBox)findViewById(R.id.r1);
        CheckBox r2 = (CheckBox)findViewById(R.id.r2);
        CheckBox r3 = (CheckBox)findViewById(R.id.r3);
        CheckBox r4 = (CheckBox)findViewById(R.id.r4);
        CheckBox r5 = (CheckBox)findViewById(R.id.r5);
        CheckBox t1 = (CheckBox)findViewById(R.id.t1);
        CheckBox t2 = (CheckBox)findViewById(R.id.t2);
        CheckBox t3 = (CheckBox)findViewById(R.id.t3);
        CheckBox t4 = (CheckBox)findViewById(R.id.t4);
        CheckBox t5 = (CheckBox)findViewById(R.id.t5);
        t1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    t2.setChecked(false);
                    t3.setChecked(false);
                    t4.setChecked(false);
                    t5.setChecked(false);
                }
                time="8AM-10AM";
            }
        });
        t2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    t1.setChecked(false);
                    t3.setChecked(false);
                    t4.setChecked(false);
                    t5.setChecked(false);
                }
                time="10AM-12PM";
            }
        });
        t3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    t2.setChecked(false);
                    t1.setChecked(false);
                    t4.setChecked(false);
                    t5.setChecked(false);
                }
                time="12PM-2PM";
            }
        });
        t4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    t2.setChecked(false);
                    t3.setChecked(false);
                    t1.setChecked(false);
                    t5.setChecked(false);
                }
                time="2PM-5PM";
            }
        });
        t5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    t2.setChecked(false);
                    t3.setChecked(false);
                    t4.setChecked(false);
                    t1.setChecked(false);
                }
                time="5PM-8PM";
            }
        });



        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    r2.setChecked(false);
                    r3.setChecked(false);
                    r4.setChecked(false);
                    r5.setChecked(false);
                }
                room="1";
            }
        });
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    r1.setChecked(false);
                    r3.setChecked(false);
                    r4.setChecked(false);
                    r5.setChecked(false);
                }
                room="2";
            }
        });
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    r2.setChecked(false);
                    r1.setChecked(false);
                    r4.setChecked(false);
                    r5.setChecked(false);
                }
                room="3";
            }
        });
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    r2.setChecked(false);
                    r3.setChecked(false);
                    r1.setChecked(false);
                    r5.setChecked(false);
                }
                room="4";
            }
        });
        r5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    r2.setChecked(false);
                    r3.setChecked(false);
                    r4.setChecked(false);
                    r1.setChecked(false);
                }
                room="5";
            }
        });




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(),Mainpage.class);
                startActivity(back);
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((t1.isChecked() || t2.isChecked() || t3.isChecked() || t4.isChecked() || t5.isChecked()) && (r1.isChecked() || r2.isChecked() || r3.isChecked() || r4.isChecked() ||r5.isChecked())){
                    String msg = "Booking Details :"+"\nCleaning Service for :"+"\nNumber of rooms : "+room+"\n Selected Time : "+time;
                    Intent i = new Intent(getApplicationContext(),Bookings.class);
                    i.putExtra("Booking_details",msg);
                    startActivity(i);
                    Toast.makeText(Painting.this, "Booked Succesfully for Painting", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please fill required details.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}