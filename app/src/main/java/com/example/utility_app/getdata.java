package com.example.utility_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class getdata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getdata);
        TextView textView = findViewById(R.id.textarea);
        TextView textView1 = findViewById(R.id.textarea1);
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Bookings");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    String texts = dataSnapshot.child("booking").getValue().toString();
                    textView.setText(texts);
                    String query = "select * from Bookings where booking='Booked by : Kishore GirivasanPhone number : 8072995165Booking Details :Pest Booking for Office'";

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}