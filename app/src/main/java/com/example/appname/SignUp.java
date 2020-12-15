package com.example.appname;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    ImageView btn_sign_up;
    public static EditText input_login, input_mail, input_pass, input_re_pass;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        input_login = findViewById(R.id.input_login_sign_up);
        input_mail = findViewById(R.id.input_mail_sign_up);
        input_pass = findViewById(R.id.input_pass_sign_up);
        input_re_pass = findViewById(R.id.input_repass_sign_up);

        btn_sign_up = findViewById(R.id.btn_sign_up);
        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(input_pass.getText().toString().equals(input_re_pass.getText().toString())){
                    Intent intent1 = new Intent(SignUp.this, SignIn.class);
                    startActivity(intent1);
                }else{
                    Toast.makeText(SignUp.this, "Пароли не совпадают", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
