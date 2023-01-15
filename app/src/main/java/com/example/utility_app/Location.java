package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Location extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    String[] places = {"Amaravati","Ahmadabad","Alappuzha","Aurangabad","Agra","Bengaluru","Bhandra","Bhubaneshwar",
            "Bhopal","Bikaner","Chennai","Coimabtore","Cuddalore","Dehra Dun","Dharmapuri","Dindigul","Erode",
            "Farizabad","Ghaziabad","Gwalior", "Haridwar","Hyderabad","Hosur","Indore","Jhansi","Jaipur",
            "Jaislamer","Kanpur","Kochi","Kanchipuram","Kolar","Karaikal","Lucknow", "Ludhiana","Leh","Madurai",
            "Mussorie","Meerut","Mysuru","Nainital","Nagercoil","Nagpur","Nashik", "Ooty","Puducherry","Patiala",
            "Pune","Pallakad","Rameshwaram","Ranchi","Salem","Tumkur","Thrissur","Thanjavur","Thane","Thrichy",
            "Tiruppur", "Thiruttani","Udaipur","Ujjain","Vellore","Varanasi","Warangal","Walaja","Yercaud"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        autoCompleteTextView = findViewById(R.id.actv);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,places);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selected_place = adapter.getItem(i);
                Intent in = new Intent(getApplicationContext(),Mainpage.class);
                in.putExtra("place",selected_place);
                startActivity(in);
            }
        });
    }
}