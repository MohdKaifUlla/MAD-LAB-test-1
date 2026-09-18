package com.example.homesecure;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.homesecure.fragments.AirConditioningFragment;
import com.example.homesecure.fragments.LightingFragment;
import com.example.homesecure.fragments.SecurityFragment;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "HomeSecure";

    private Button btnLighting;
    private Button btnAc;
    private Button btnSecurity;
    private TextView tvSecurityStatus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity - onCreate()");

        tvSecurityStatus = findViewById(R.id.tvSecurityStatus);

        btnLighting = findViewById(R.id.btnLighting);
        btnAc = findViewById(R.id.btnAc);
        btnSecurity = findViewById(R.id.btnSecurity);

        // Show the Lighting fragment by default
        if (savedInstanceState == null) {
            openFragment(new LightingFragment());
        }

        btnLighting.setOnClickListener(v -> openFragment(new LightingFragment()));
        btnAc.setOnClickListener(v -> openFragment(new AirConditioningFragment()));
        btnSecurity.setOnClickListener(v -> openFragment(new SecurityFragment()));
    }

    /**
     * Replaces the fragment shown inside the fragment container.
     */
    private void openFragment(androidx.fragment.app.Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.commit();
    }

    /**
     * Called by SecurityFragment to update the security status text
     * shown on the MainActivity home screen.
     */
    public void updateSecurityStatus(String mode) {
        if (tvSecurityStatus != null) {
            tvSecurityStatus.setText("ARMED (" + mode + ")");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity - onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity - onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity - onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity - onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity - onDestroy()");
    }
}
