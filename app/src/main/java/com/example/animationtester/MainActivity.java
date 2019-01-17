package com.example.animationtester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();

        animation();

    }



    private void wireWidgets() {
        button = findViewById(R.id.button1);
        textView = findViewById(R.id.textView);
    }

    private void animation() {
        Animation ZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        Animation FadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);

        button.startAnimation(ZoomIn);
        textView.startAnimation(FadeIn);
    }
}
