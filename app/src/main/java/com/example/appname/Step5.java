package com.example.appname;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Step5 extends AppCompatActivity {
    ImageView btn_save;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step_5);
        btn_save = findViewById(R.id.btn_save);
    }
    public void onClickStep5(View view){
        btn_save.setImageResource(R.drawable.btn_active);
        Intent intentSignUp = new Intent(Step5.this, SignIn.class);
        startActivity(intentSignUp);
    }
}
