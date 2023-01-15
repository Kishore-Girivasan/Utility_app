package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.telephony.SmsManager;
import android.app.PendingIntent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Acting_driver extends AppCompatActivity {
    String[] type = {"Pick Up only(Cities)","Pick Up and Drop(Cities)","Pick Up Only(Towns)","Pick Up and Drop(Towns)","More than a day"};
    AutoCompleteTextView autoCompleteText;
    ArrayAdapter<String> adapter;
    String chosen_type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        String Phone_number = i.getStringExtra("Phone_number");
        setContentView(R.layout.activity_acting_driver);
        autoCompleteText = findViewById(R.id.autoCompleteTextView);
        adapter = new ArrayAdapter<String>(this,R.layout.list_items,type);
        autoCompleteText.setAdapter(adapter);
        autoCompleteText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                chosen_type = adapterView.getItemAtPosition(i).toString();
            }
        });
        ImageView book = (ImageView) findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText From = (EditText)findViewById(R.id.from) ;
                EditText To = (EditText)findViewById(R.id.to) ;
                String From_loc = From.getText().toString();
                String To_loc = To.getText().toString();
                if(From_loc.isEmpty() || To_loc.isEmpty() || chosen_type.isEmpty()){
                    Toast.makeText(Acting_driver.this, "Please fill required details", Toast.LENGTH_SHORT).show();
                }
                else{
                    String msg = "Booking Details : "+"\nFrom : "+ From_loc.toString()+"\nTo : "+To_loc.toString()+"\nBooking Type : "+ chosen_type.toString();
                    Intent i = new Intent(getApplicationContext(),Bookings.class);
                    i.putExtra("Booking_details",msg);
                    startActivity(i);
                }

              /*  }
                else{
                    Toast.makeText(getApplicationContext(),"access denied",Toast.LENGTH_LONG).show();
                }*/
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
    }
}