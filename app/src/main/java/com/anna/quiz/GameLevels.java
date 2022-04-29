package com.anna.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    private Object Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);
        Button btn_two = findViewById(R.id.btn_two);
        Button btn_three = findViewById(R.id.btn_three);
        Button btn_four = findViewById(R.id.btn_four);

    }
    public void LevelOne(View v) {
        Intent intent = new Intent(this, LevelOne.class);
        startActivity(intent);
        finish();

    }
    public void LevelTwo(View v) {
        Intent intent = new Intent(this, LevelTwo.class);
        startActivity(intent);
        finish();

    }
    public void LevelThree(View v) {
        Intent intent = new Intent(this, LevelThree.class);
        startActivity(intent);
        finish();


    }

}