package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Repairs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repairs);
        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(),Mainpage.class);
                startActivity(back);
            }
        });

        ImageView ac = (ImageView) findViewById(R.id.ac);
        ImageView fridge = (ImageView) findViewById(R.id.fridge);
        ImageView wm = (ImageView) findViewById(R.id.wm);
        ImageView tv = (ImageView) findViewById(R.id.tv);
        ImageView chimney = (ImageView) findViewById(R.id.chimney);
        ImageView laptop = (ImageView) findViewById(R.id.laptop);
        ImageView heater = (ImageView) findViewById(R.id.heater);
        ImageView purifier = (ImageView) findViewById(R.id.purifier);
        ImageView mw = (ImageView) findViewById(R.id.microwave);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Booking Details : \n"+"Repairs for : Air Conditioner";
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
            }
        });

        fridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Booking Details : \n"+"Repairs for : Refrigerator";
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
            }
        });

        wm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Booking Details : \n"+"Repairs for : Washing Machine";
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Booking Details : \n"+"Repairs for : Television";
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
            }
        });

        chimney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Booking Details : \n"+"Repairs for : Chimney";
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
            }
        });

        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Booking Details : \n"+"Repairs for : Laptop";
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
            }
        });

        heater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Booking Details : \n"+"Repairs for : Water Heater";
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
            }
        });

        purifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Booking Details : \n"+"Repairs for : Water Purifier";
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
            }
        });

        mw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Booking Details : \n"+"Repairs for : Microwave Oven";
                Intent i = new Intent(getApplicationContext(),Bookings.class);
                i.putExtra("Booking_details",msg);
                startActivity(i);
            }
        });



    }
}