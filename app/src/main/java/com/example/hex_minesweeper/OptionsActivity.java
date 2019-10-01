package com.example.hex_minesweeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        Button level = findViewById(R.id.option_button_mucchoi);
        Button highestPoint = findViewById(R.id.option_diemcaonhat);
        Button guide = findViewById(R.id.option_button_huongdan);
        Button button_go = findViewById(R.id.option_button_go);

        // button level
        level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionsActivity.this, Difficult_activity.class);
                startActivity(intent);
            }
        });
    }
}
