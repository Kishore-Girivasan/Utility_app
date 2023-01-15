package com.example.utility_app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class Signup extends AppCompatActivity {
    public static String Name,Phone,Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button signup = (Button)findViewById(R.id.signup1);

        TextInputLayout name = (TextInputLayout) findViewById(R.id.name);
        TextInputLayout p_num = (TextInputLayout) findViewById(R.id.phone_number);
        TextInputLayout pwd = (TextInputLayout) findViewById(R.id.password);

        Name = String.valueOf(Objects.requireNonNull(name.getEditText()).getText());
        Phone = String.valueOf(Objects.requireNonNull(p_num.getEditText()).getText());
        Password = String.valueOf(Objects.requireNonNull(pwd.getEditText()).getText());

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Mainpage.class);
                startActivity(i);
            }
        });
    }
}