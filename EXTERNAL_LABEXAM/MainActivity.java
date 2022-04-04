package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

            public void onClick(View view)
        {

                    Intent i=new Intent();
                    i.setData(Uri.parse("https://www.linkedin.com"));
                    startActivity(i);
        }


}