package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class CleaningService extends AppCompatActivity {
    String room_size,room,time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_service);
        ImageView back = (ImageView) findViewById(R.id.back);
        ImageView confirm = (ImageView) findViewById(R.id.confirm);
        CheckBox sq1 = (CheckBox)findViewById(R.id.rs1);
        CheckBox sq2 = (CheckBox)findViewById(R.id.rs2);
        CheckBox sq3 = (CheckBox)findViewById(R.id.rs3);
        CheckBox sq4 = (CheckBox)findViewById(R.id.rs4);
        CheckBox sq5 = (CheckBox)findViewById(R.id.rs5);
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

        sq1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    sq2.setChecked(false);
                    sq3.setChecked(false);
                    sq4.setChecked(false);
                    sq5.setChecked(false);
                }
                room_size="200 sqft";
            }
        });
        sq2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    sq1.setChecked(false);
                    sq3.setChecked(false);
                    sq4.setChecked(false);
                    sq5.setChecked(false);
                }
                room_size="400 sqft";
            }
        });
        sq3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    sq2.setChecked(false);
                    sq1.setChecked(false);
                    sq4.setChecked(false);
                    sq5.setChecked(false);
                }
                room_size="600 sqft";
            }
        });
        sq4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    sq2.setChecked(false);
                    sq3.setChecked(false);
                    sq1.setChecked(false);
                    sq5.setChecked(false);
                }
                room_size="800 sqft";
            }
        });
        sq5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    sq2.setChecked(false);
                    sq3.setChecked(false);
                    sq4.setChecked(false);
                    sq1.setChecked(false);
                }
                room_size="1000+ sqft";
            }
        });




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
                if((r1.isChecked() || r2.isChecked() || r3.isChecked() || r4.isChecked() ||r5.isChecked()) && (t1.isChecked() || t2.isChecked() || t3.isChecked() || t4.isChecked() || t5.isChecked()) && (sq1.isChecked() || sq2.isChecked() || sq3.isChecked() || sq4.isChecked() || sq5.isChecked())){
                    String msg = "Booking Details :"+"\nCleaning Service for :"+"\nRoom Size : "+room_size+"\nNumber of rooms : "+room+"\n Selected Time : "+time;
                    Intent i = new Intent(getApplicationContext(),Bookings.class);
                    i.putExtra("Booking_details",msg);
                    startActivity(i);
                    Toast.makeText(CleaningService.this, "Booked Succesfully for Cleaning Service", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CleaningService.this, "Please fill required details.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}