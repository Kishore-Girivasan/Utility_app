package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Laundry extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry);
        EditText shirts = (EditText) findViewById(R.id.shirts);
        EditText pants = (EditText) findViewById(R.id.pants);
        EditText sarees = (EditText) findViewById(R.id.sarees);
        EditText underwear = (EditText) findViewById(R.id.underwear);
        EditText suggestion = (EditText) findViewById(R.id.suggestion);
        ImageView confirm = (ImageView) findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shirts_count = shirts.getText().toString();
                String pants_count = pants.getText().toString();
                String sarees_count = sarees.getText().toString();
                String underwear_count = underwear.getText().toString();
                String suggestions = suggestion.getText().toString();
                if(shirts_count.isEmpty() || pants_count.isEmpty() || sarees_count.isEmpty() || underwear_count.isEmpty()){
                    Toast.makeText(Laundry.this, "Please fill required details", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i = new Intent(getApplicationContext(),Laundry_order.class);
                    i.putExtra("shirts",shirts_count);
                    i.putExtra("pants",pants_count);
                    i.putExtra("sarees",sarees_count);
                    i.putExtra("underwears",underwear_count);
                    i.putExtra("suggestions",suggestions);
                    startActivity(i);
                }
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