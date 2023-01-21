package com.example.testbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView textView;

        super.onCreate(savedInstanceState);
        // activity_mainを呼び出しViewをまとめる箇所
        setContentView(R.layout.activity_main);

        // ボタンを設定
        // TODO: findViewIdとは レイアウトファイルから指定したidのものを見つけてくる記述
        Button button = findViewById(R.id.button);

        // idがtextViewのものを探す
        textView = findViewById(R.id.text_view);

        // ボタン押下時の動作
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean buttonTap = false;

                if (buttonTap) {
                    textView.setText("Hello");
                    buttonTap = false;
                } else {
                    textView.setText("World");
                    buttonTap = true;
                }
            }
        });
    }
}