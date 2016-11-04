package com.example.mimsoft.appspokenenglish;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class about extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // get the current page or activity name
     //   String a=this.getClass().getSimpleName();
        btn=(Button)findViewById(R.id.btn2);
        btn.setText("List");

    }
    public void about(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


    public void work(View v) {
        Intent i = new Intent(this,web_key_solution.class);
        startActivity(i);

    }

}
