package com.example.appname;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SignIn extends AppCompatActivity {
    TextView btn_go_sign_up;
    EditText input_login, input_pass;
    ImageView btn_sign_in;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sing_in);

        input_login = findViewById(R.id.input_login_sing_in);
        input_pass = findViewById(R.id.input_pass_sign_in);

        btn_go_sign_up = findViewById(R.id.btn_go_sign_up);
        btn_go_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SignIn.this, SignUp.class);
                startActivity(intent1);
            }
        });

        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input_login.getText().toString() == SignUp.input_login.getText().toString() ){
                    if (input_pass.getText().toString().equals(SignUp.input_pass.getText().toString())){
                        Intent intent1 = new Intent(SignIn.this, MainActivity.class);
                        startActivity(intent1);
                    }else{
                        Toast.makeText(SignIn.this,"Неправильный пароль",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(SignIn.this,"Неправильный логин",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
