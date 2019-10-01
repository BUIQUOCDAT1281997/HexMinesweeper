package com.example.hex_minesweeper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.Objects;

public class Difficult_activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficult_level_layout);

        // toolbar
        Toolbar toolbar_level = findViewById(R.id.level_toolbar);
        setSupportActionBar(toolbar_level);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Setup difficult");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
