package com.example.appname;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Female extends AppCompatActivity {
    ImageView btn_hands, btn_spine, btn_torso, btn_legs;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.female);

        btn_hands = findViewById(R.id.btn_hands);
        btn_spine = findViewById(R.id.btn_spine);
        btn_torso = findViewById(R.id.btn_torso);
        btn_legs = findViewById(R.id.btn_legs);
    }

    public void onMyButtonClick(View view) {
        switch (view.getId()) {
            case R.id.btn_hands:
                btn_hands.setImageResource(R.drawable.btn_active_famale);
                Intent intent1 = new Intent(Female.this, Step4.class);
                startActivity(intent1);
                btn_spine.setImageResource(R.drawable.btn_female);
                btn_torso.setImageResource(R.drawable.btn_female);
                btn_legs.setImageResource(R.drawable.btn_female);
                break;
            case R.id.btn_spine:
                btn_spine.setImageResource(R.drawable.btn_active_famale);
                Intent intent2 = new Intent(Female.this, Step4.class);
                startActivity(intent2);
                btn_hands.setImageResource(R.drawable.btn_female);
                btn_torso.setImageResource(R.drawable.btn_female);
                btn_legs.setImageResource(R.drawable.btn_female);
                break;
            case R.id.btn_torso:
                btn_torso.setImageResource(R.drawable.btn_active_famale);
                Intent intent3 = new Intent(Female.this, Step4.class);
                startActivity(intent3);
                btn_spine.setImageResource(R.drawable.btn_female);
                btn_hands.setImageResource(R.drawable.btn_female);
                btn_legs.setImageResource(R.drawable.btn_female);
                break;
            case R.id.btn_legs:
                btn_legs.setImageResource(R.drawable.btn_active_famale);
                Intent intent4 = new Intent(Female.this, Step4.class);
                startActivity(intent4);
                btn_spine.setImageResource(R.drawable.btn_female);
                btn_torso.setImageResource(R.drawable.btn_female);
                btn_hands.setImageResource(R.drawable.btn_female);
                break;
            default:
                break;
        }
    }
}
