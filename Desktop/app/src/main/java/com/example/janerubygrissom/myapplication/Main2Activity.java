package com.example.janerubygrissom.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button enterBtn;

    //"splash screen, intro, enter the app"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button enterBtn = (Button) findViewById(R.id.enterBtn);


  //when the button is clicked, enters next screen
    enterBtn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {

            Intent i = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(i);

    }
});
    }

}