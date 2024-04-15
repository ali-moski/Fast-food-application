package com.example.myapplication55;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
        bottomNavigationView .setSelectedItemId(R.id.bottom_setting);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.bottom_home:
                    startActivity(new Intent(getApplicationContext(),MainActivity4.class));
                    overridePendingTransition(R.anim.slider_in_right,R.anim.slider_out_left);
                    finish();
                    return true;
                case R.id.bottom_search:
                    startActivity(new Intent(getApplicationContext(),SearchActivity.class));
                    overridePendingTransition(R.anim.slider_in_right,R.anim.slider_out_left);
                    finish();
                    return true;
                case R.id.bottom_setting:
                    return true;
                case R.id.bottom_profile:
                    startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
                    overridePendingTransition(R.anim.slider_in_right,R.anim.slider_out_left);
                    finish();
                    return true;
            }
            return false;
        });
    }
}