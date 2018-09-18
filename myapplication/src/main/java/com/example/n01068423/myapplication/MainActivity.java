package com.example.n01068423.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callIntent(View view){
        Intent intent = null;
        switch(view.getId()){
            case R.id.Button02:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.ca"));
                startActivity(intent);

                break;

            case R.id.Button01:
                Uri number = Uri.parse("tel:5555555555");
                intent = new Intent(Intent.ACTION_CALL, number);
                startActivity(intent);
                break;

             default:
             break;
        }

    }
}
