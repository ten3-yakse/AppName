package com.example.appname;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Step1 extends AppCompatActivity {
    ImageView bg_weight,bg_keeping,bg_build;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step_1);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bg_weight:
                bg_weight = findViewById(R.id.bg_weight);
                bg_weight.setImageResource(R.drawable.btn_active);
                Intent intent1 = new Intent(Step1.this, Step2.class);
                startActivity(intent1);
                break;
            case R.id.bg_keeping:
                bg_keeping = findViewById(R.id.bg_keeping);
                bg_keeping.setImageResource(R.drawable.btn_active);
                Intent intent2 = new Intent(Step1.this, Step2.class);
                startActivity(intent2);
                break;
            case R.id.bg_build:
                bg_build = findViewById(R.id.bg_build);
                bg_build.setImageResource(R.drawable.btn_active);
                Intent intent3 = new Intent(Step1.this, Step2.class);
                startActivity(intent3);
                break;
            default:
                return;
        }
    }
}
