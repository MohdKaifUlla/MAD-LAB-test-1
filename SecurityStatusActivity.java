package com.example.homesecure;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecurityStatusActivity extends AppCompatActivity {

    private static final String TAG = "HomeSecure";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_status);
        Log.d(TAG, "SecurityStatusActivity - onCreate()");

        TextView tvCurrentMode = findViewById(R.id.tvCurrentMode);

        // Receive the selected security mode sent from SecurityFragment
        String selectedMode = getIntent().getStringExtra("SECURITY_MODE");
        if (selectedMode == null) {
            selectedMode = "Home";
        }

        tvCurrentMode.setText(selectedMode);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "SecurityStatusActivity - onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SecurityStatusActivity - onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SecurityStatusActivity - onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "SecurityStatusActivity - onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "SecurityStatusActivity - onDestroy()");
    }
}
