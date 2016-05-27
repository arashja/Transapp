package com.example.arash.translation01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by arash on 5/26/2016.
 */
public class startpage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.startpage);
    }

    public void click_web(View view) {
        startActivity(new Intent(getApplicationContext(), homepage.class));

    }

    public void click_app(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void click_exit(View view) {
        System.exit(0);
    }
}
