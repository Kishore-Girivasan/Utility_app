package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class Bookings extends AppCompatActivity {
    DatabaseReference bookingdb;
    private String bookingdet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookings);
        ImageView back = (ImageView) findViewById(R.id.back);
        ImageView book = (ImageView) findViewById(R.id.book);
        Intent a = getIntent();
        String msg = a.getStringExtra("Booking_details");
        TextView bookings_txt = (TextView)findViewById(R.id.booking_txt);
        TextView booking = (TextView) findViewById(R.id.booking_txt);
        booking.setText(msg);
        bookingdb = FirebaseDatabase.getInstance().getReference().child("Bookings");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Mainpage.class);
                startActivity(i);
            }
        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
                    SmsManager sms = SmsManager.getDefault();
                    TextInputLayout name = (TextInputLayout) findViewById(R.id.Name);
                    TextInputLayout pnum = (TextInputLayout) findViewById(R.id.phone_number);
                    String Phone_number = String.valueOf(Objects.requireNonNull(pnum.getEditText()).getText());
                    String User_name = String.valueOf(Objects.requireNonNull(name.getEditText()).getText());
                    if(Phone_number.isEmpty() || User_name.isEmpty()){
                        Toast.makeText(getApplicationContext(), "Please fill required details", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        String book = "Booked by : "+User_name + "\nPhone number : " + Phone_number+"\n";
                        String booking = book+msg;
                        bookingdet = book+msg;
                        sms.sendTextMessage(Phone_number, null, booking, null, null);
                        //Toast.makeText(getApplicationContext(), "Booked Successfully", Toast.LENGTH_SHORT).show();
                        insert_data(booking);
                        Intent billing = new Intent(getApplicationContext(),Billing_details.class);
                        startActivity(billing);
                    }
                }
            }
        });

    }
    private void insert_data(String booking) {
        Booking_details_db b = new Booking_details_db(booking);
        bookingdb.push().setValue(b);
        Toast.makeText(this, "DATABASE ADDED", Toast.LENGTH_LONG).show();
    }

}