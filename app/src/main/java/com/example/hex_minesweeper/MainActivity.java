package com.example.hex_minesweeper;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    private Button start;
    private ImageView imageViewBoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(MainActivity.class.getSimpleName(),"onCreate");

        start = findViewById(R.id.button_start);
        imageViewBoom = findViewById(R.id.imageViewBoom);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,OptionsActivity.class);
                    startActivity(intent);
                    finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MainActivity.class.getSimpleName(),"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MainActivity.class.getSimpleName(),"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MainActivity.class.getSimpleName(),"onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MainActivity.class.getSimpleName(),"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MainActivity.class.getSimpleName(),"onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MainActivity.class.getSimpleName(),"onStop");
    }
}
