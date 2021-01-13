package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ボタンの実装
        Button ohudabutton = findViewById(R.id.ohuda_button);
        ohudabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contents = "";
                Random random = new Random();
                switch (random.nextInt(5)){
                    case 0:
                        contents = "家内安全";
                        break;
                    case 1:
                        contents = "厄除け";
                        break;
                    case 2:
                        contents = "健康祈願";
                        break;
                    case 3:
                        contents = "交通安全";
                        break;
                    case 4:
                        contents = "書くことないわ";
                        break;
                    case 5:
                        contents = "眠い";
                        break;
                }
                Toast.makeText(MainActivity.this, contents, Toast.LENGTH_SHORT).show();
            }
        });
    }
}