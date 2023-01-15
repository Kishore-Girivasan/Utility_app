package com.example.utility_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
/*import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
*/
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Login extends AppCompatActivity {
    private static String Phone_number;
    public static String getValue() {
        return Phone_number;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login = (Button) findViewById(R.id.login);
        Button signup = (Button) findViewById(R.id.signup_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextInputLayout ph_num = (TextInputLayout)findViewById(R.id.phone_number);
                TextInputLayout pwd = (TextInputLayout)findViewById(R.id.password);

                Phone_number = String.valueOf(Objects.requireNonNull(ph_num.getEditText()).getText());
                String Password = String.valueOf(Objects.requireNonNull(pwd.getEditText()).getText());
                if(Phone_number.isEmpty() || Password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please fill the required",Toast.LENGTH_LONG).show();
                }
                else{
                    Intent i = new Intent(getApplicationContext(), Location.class);
                    startActivity(i);
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Signup.class);
                startActivity(i);
            }
        });
    }

}