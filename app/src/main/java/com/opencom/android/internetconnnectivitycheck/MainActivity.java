package com.opencom.android.internetconnnectivitycheck;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myMethod(View v){
        ConnectivityManager cManager=(ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info=cManager.getActiveNetworkInfo();
        if ((info == null || !info.isConnected() || !info.isAvailable())) {

            Toast.makeText(getApplicationContext(), "Internet does not available.", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(getApplicationContext(), "Internet is available.", Toast.LENGTH_LONG).show();
        }
    }
}
