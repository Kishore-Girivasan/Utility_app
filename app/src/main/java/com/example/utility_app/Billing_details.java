package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Billing_details extends AppCompatActivity {
    String selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing_details);
        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(),Mainpage.class);
                startActivity(back);
            }
        });

        CheckBox credit = (CheckBox) findViewById(R.id.credit);
        CheckBox debit = (CheckBox) findViewById(R.id.debit);
        CheckBox gpay = (CheckBox) findViewById(R.id.googlepay);
        CheckBox paytm = (CheckBox) findViewById(R.id.paytm);
        CheckBox cod = (CheckBox) findViewById(R.id.cod);

        credit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    debit.setChecked(false);
                    gpay.setChecked(false);
                    paytm.setChecked(false);
                    cod.setChecked(false);
                }
                selected="Credit Card";
            }
        });
        debit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    credit.setChecked(false);
                    gpay.setChecked(false);
                    paytm.setChecked(false);
                    cod.setChecked(false);
                }
                selected="Debit Card";
            }
        });
        gpay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    debit.setChecked(false);
                    credit.setChecked(false);
                    paytm.setChecked(false);
                    cod.setChecked(false);
                }
                selected="Google Pay";
            }
        });
        paytm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    debit.setChecked(false);
                    gpay.setChecked(false);
                    credit.setChecked(false);
                    cod.setChecked(false);
                }
                selected="Pay tm";
            }
        });
        cod.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    debit.setChecked(false);
                    gpay.setChecked(false);
                    paytm.setChecked(false);
                    credit.setChecked(false);
                }
                selected="Cash on delivery";
            }
        });
        ImageView proceed = (ImageView) findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected=="Credit Card"){
                    String url ="https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page" ;
                    Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(urlIntent);
                }
                else if(selected=="Debit Card"){
                    String url ="https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page" ;
                    Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(urlIntent);
                }
                else if(selected=="Google Pay"){
                    String url ="https://pay.google.com/about/" ;
                    Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(urlIntent);
                }
                else if(selected=="Pay tm"){
                    String url ="https://paytm.com/" ;
                    Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(urlIntent);
                }
                else if(selected=="Cash on delivery"){
                    Toast.makeText(Billing_details.this, "Request for Cash on delivery accepted", Toast.LENGTH_SHORT).show();
                    Intent cod = new Intent(getApplicationContext(),Mainpage.class);
                    startActivity(cod);
                }
            }
        });


    }
}