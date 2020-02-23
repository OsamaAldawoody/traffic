package com.example.osamaaldawoody.traffic;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable animation_traffic_Drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView lights = (ImageView) findViewById(R.id.imageView);
        animation_traffic_Drawable = (AnimationDrawable)lights.getDrawable();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        animation_traffic_Drawable.start();
    }
}
