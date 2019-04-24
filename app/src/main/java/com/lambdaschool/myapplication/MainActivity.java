package com.lambdaschool.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(v.getContext())
                        .setTitle("My Dialog Window")
                        .setMessage("Hello Animated World!").create();
//                dialog.getWindow().getAttributes().windowAnimations = R.style.AnimationSpin;
                dialog.getWindow().getAttributes().windowAnimations = R.style.AnimationTopBottom;
                dialog.show();
            }
        });
    }
}
