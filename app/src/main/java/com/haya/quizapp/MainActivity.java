package com.haya.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button btnTrue;
    private Button btnWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTrue = findViewById(R.id.btnTrue);

        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                evaluateUsersAnswer(true);
//                changeQuestionOnButtonClick();
                Log.i("クリック表示：","本当ボタン");

            }
        });

        btnWrong = findViewById(R.id.btnWrong);

        //  btnWrong.setOnClickListener(myClickListener);

        btnWrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                evaluateUsersAnswer(false);
//                changeQuestionOnButtonClick();
                Log.i("クリック表示：","嘘ボタン");

            }
        });


    }

}