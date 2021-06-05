package com.example.praktika;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
    }
        public boolean email_valid, pass_valid;
            public void onClick (View v){

                EditText user_name = findViewById(R.id.user_name);
                EditText email = findViewById(R.id.email);
                EditText password = findViewById(R.id.password);
                EditText repeat_password = findViewById(R.id.repeat_password);

                user_name.getText().toString();
                email.getText().toString();
                String pass = password.getText().toString();
                String rep_pass = repeat_password.getText().toString();
                boolean rez = pass.equals(rep_pass);

                if (user_name.length() == 0 ||email.length() == 0 || pass.length() == 0 || rep_pass.length() == 0 ){
                    Toast.makeText(getApplicationContext(), "Вы ввели не все данные",Toast.LENGTH_SHORT).show(); }
                else if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
                    Toast.makeText(getApplicationContext(), "фиговое мыло",Toast.LENGTH_SHORT).show();
                    email_valid = false; }
                else email_valid = true;

                if (rez) {
                    pass_valid = true;
                    Toast.makeText(getApplicationContext(),"Пароли совпадают", Toast.LENGTH_SHORT).show();}
                else {pass_valid = false; Toast.makeText(getApplicationContext(),"Пароли не совпадают", Toast.LENGTH_SHORT).show();}

                if (pass_valid  && email_valid){
                    Toast.makeText(getApplicationContext(),"Рега прошла успешно", Toast.LENGTH_SHORT).show(); }
            }
            public void goToAuthoriz1 (View v)
            {
                Intent intent = new Intent(Registration.this, Authariz1.class);
                startActivity(intent);
            }
            public  void onMain (View view){
                Intent intent = new Intent(Registration.this, MainActivity.class);
                startActivity(intent);
            }
}
