package com.example.appname;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Step2 extends AppCompatActivity {
    TextView text_next;
    ImageView bg_male,bg_female,bg_next;
    public Integer score = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step_2);

        text_next = findViewById(R.id.text_next);
        bg_male = findViewById(R.id.bg_male);
        bg_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 1;
                bg_male.setImageResource(R.drawable.btn_active_gender);
                bg_female.setImageResource(R.drawable.btn_gender);
                bg_next.setImageResource(R.drawable.btn_active);
                text_next.setTextColor(Color.WHITE);
            }
        });
        bg_female = findViewById(R.id.bg_female);
        bg_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 2;
                bg_female.setImageResource(R.drawable.btn_active_gender);
                bg_male.setImageResource(R.drawable.btn_gender);
                bg_next.setImageResource(R.drawable.btn_active);
                text_next.setTextColor(Color.WHITE);
            }
        });
        bg_next = findViewById(R.id.bg_next);
        bg_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (score){
                    case (1):
                        Intent male = new Intent(Step2.this, Male.class);
                        startActivity(male);
                        bg_male.setImageResource(R.drawable.btn_gender);
                        bg_next.setImageResource(R.drawable.button);
                        text_next.setTextColor(Color.parseColor("#6E9CD2"));
                        break;
                    case (2):
                        Intent female = new Intent(Step2.this, Female.class);
                        startActivity(female);
                        bg_female.setImageResource(R.drawable.btn_gender);
                        bg_next.setImageResource(R.drawable.button);
                        text_next.setTextColor(Color.parseColor("#6E9CD2"));
                        break;
                    default:
                        return;
                }
            }
        });

    }
}
