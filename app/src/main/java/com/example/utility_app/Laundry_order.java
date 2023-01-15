package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Laundry_order extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry_order);
        Intent i = getIntent();
        String Phone_number = i.getStringExtra("Phone_number");
        String shirts = i.getStringExtra("shirts");
        String pants = i.getStringExtra("pants");
        String sarees = i.getStringExtra("sarees");
        String underwears = i.getStringExtra("underwears");
        String suggestions = i.getStringExtra("suggestions");
        TextView shirts_count = (TextView) findViewById(R.id.shirts);
        TextView pants_count = (TextView) findViewById(R.id.pants);
        TextView sarees_count = (TextView) findViewById(R.id.sarees);
        TextView underwears_count = (TextView) findViewById(R.id.underwear);
        TextView suggestions_field = (TextView) findViewById(R.id.suggestion);
        ImageView confirm = (ImageView) findViewById(R.id.confirm_1);
        shirts_count.setText(shirts);
        pants_count.setText(pants);
        sarees_count.setText(sarees);
        underwears_count.setText(underwears);
        suggestions_field.setText(suggestions);
        confirm.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UnlocalizedSms")
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){
                    SmsManager sms=SmsManager.getDefault();
                    String msg = "Your Orders : "+"\nShirts : "+ shirts.toString()+"\nPants : "+pants.toString()+"\nSarees : "+sarees.toString()+"\nUnderwears : "+underwears.toString()+"\nYour Suggestions : "+suggestions.toString();
                    sms.sendTextMessage("Phone_number",null,msg,null,null);
                   // Toast.makeText(getApplicationContext(),"Order Placed Successfully",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(),Bookings.class);
                    i.putExtra("Booking_details",msg);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Your order is pending try after sometime.",Toast.LENGTH_LONG).show();
                }
            }
        });
        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(),Laundry.class);
                startActivity(back);
            }
        });
    }
}