package com.example.appname;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Step4 extends AppCompatActivity {

    ImageView btn_newbie, btn_keep, btn_advanced, btn_next2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step_4);
        btn_newbie = findViewById(R.id.btn_newbie);
        btn_keep = findViewById(R.id.btn_keep);
        btn_advanced = findViewById(R.id.btn_advanced);
        btn_next2 = findViewById(R.id.btn_next2);
    }
    public void onClickStep4(View view){
        switch (view.getId()){
            case R.id.btn_newbie:
                btn_newbie.setImageResource(R.drawable.btn_active);
                btn_keep.setImageResource(R.drawable.button);
                btn_advanced.setImageResource(R.drawable.button);
                btn_next2.setImageResource(R.drawable.btn_active);
                break;
            case R.id.btn_keep:
                btn_newbie.setImageResource(R.drawable.button);
                btn_keep.setImageResource(R.drawable.btn_active);
                btn_advanced.setImageResource(R.drawable.button);
                btn_next2.setImageResource(R.drawable.btn_active);
                break;
            case R.id.btn_advanced:
                btn_newbie.setImageResource(R.drawable.button);
                btn_keep.setImageResource(R.drawable.button);
                btn_advanced.setImageResource(R.drawable.btn_active);
                btn_next2.setImageResource(R.drawable.btn_active);
                break;
            case R.id.btn_next2:
                Intent intent = new Intent(Step4.this, Step5.class);
                startActivity(intent);
                btn_newbie.setImageResource(R.drawable.button);
                btn_keep.setImageResource(R.drawable.button);
                btn_advanced.setImageResource(R.drawable.button);
                break;
            default:
                return;
        }
    }
}
