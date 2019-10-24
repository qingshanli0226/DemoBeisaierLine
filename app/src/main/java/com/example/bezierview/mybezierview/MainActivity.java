package com.example.bezierview.mybezierview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onclick(View view){
        if (view.getId() == R.id.three) {
            startActivity(new Intent(this, OtherActivity.class));
        } else {
            startActivity(new Intent(this, BActivity.class));
        }
    }
}
