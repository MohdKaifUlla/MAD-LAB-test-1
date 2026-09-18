package com.example.homesecure.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homesecure.R;

public class AirConditioningFragment extends Fragment {

    private static final String TAG = "HomeSecure";

    // The SeekBar progress represents an offset above MIN_TEMPERATURE
    private static final int MIN_TEMPERATURE = 16;

    private TextView tvTemperature;
    private TextView tvAcStatus;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "AirConditioningFragment - onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "AirConditioningFragment - onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                              @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "AirConditioningFragment - onCreateView()");
        return inflater.inflate(R.layout.fragment_air_conditioning, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SeekBar seekBarTemperature = view.findViewById(R.id.seekBarTemperature);
        ToggleButton toggleAc = view.findViewById(R.id.toggleAc);

        tvTemperature = view.findViewById(R.id.tvTemperature);
        tvAcStatus = view.findViewById(R.id.tvAcStatus);

        // Temperature SeekBar (16C to 30C)
        seekBarTemperature.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int temperature = MIN_TEMPERATURE + progress;
                tvTemperature.setText("Temperature: " + temperature + "\u00B0C");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Not used
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Not used
            }
        });

        // AC ON/OFF toggle
        toggleAc.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                tvAcStatus.setText("AC Status: ON");
                tvAcStatus.setTextColor(getResources().getColor(R.color.colorSuccess));
            } else {
                tvAcStatus.setText("AC Status: OFF");
                tvAcStatus.setTextColor(getResources().getColor(R.color.colorError));
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "AirConditioningFragment - onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "AirConditioningFragment - onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "AirConditioningFragment - onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "AirConditioningFragment - onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "AirConditioningFragment - onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "AirConditioningFragment - onDestroy()");
    }
}
