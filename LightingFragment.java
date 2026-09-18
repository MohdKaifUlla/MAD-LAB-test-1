package com.example.homesecure.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homesecure.R;

public class LightingFragment extends Fragment {

    private static final String TAG = "HomeSecure";

    private TextView tvSelectedRoom;
    private TextView tvBrightnessValue;
    private TextView tvLightStatus;

    private String selectedRoom = "Living Room";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "LightingFragment - onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "LightingFragment - onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                              @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "LightingFragment - onCreateView()");
        return inflater.inflate(R.layout.fragment_lighting, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RadioGroup radioGroupRoom = view.findViewById(R.id.radioGroupRoom);
        SeekBar seekBarBrightness = view.findViewById(R.id.seekBarBrightness);
        ToggleButton toggleLight = view.findViewById(R.id.toggleLight);

        tvSelectedRoom = view.findViewById(R.id.tvSelectedRoom);
        tvBrightnessValue = view.findViewById(R.id.tvBrightnessValue);
        tvLightStatus = view.findViewById(R.id.tvLightStatus);

        // Room selection
        radioGroupRoom.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioLivingRoom) {
                selectedRoom = "Living Room";
            } else if (checkedId == R.id.radioBedroom) {
                selectedRoom = "Bedroom";
            } else if (checkedId == R.id.radioKitchen) {
                selectedRoom = "Kitchen";
            }
            tvSelectedRoom.setText("Selected: " + selectedRoom);
        });

        // Brightness SeekBar
        seekBarBrightness.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvBrightnessValue.setText("Brightness: " + progress + "%");
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

        // Light ON/OFF toggle
        toggleLight.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                tvLightStatus.setText(R.string.light_on);
                tvLightStatus.setTextColor(getResources().getColor(R.color.colorSuccess));
            } else {
                tvLightStatus.setText(R.string.light_off);
                tvLightStatus.setTextColor(getResources().getColor(R.color.colorError));
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "LightingFragment - onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "LightingFragment - onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "LightingFragment - onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "LightingFragment - onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "LightingFragment - onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "LightingFragment - onDestroy()");
    }
}
