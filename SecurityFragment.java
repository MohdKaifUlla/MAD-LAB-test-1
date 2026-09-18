package com.example.homesecure.fragments;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.homesecure.MainActivity;
import com.example.homesecure.R;
import com.example.homesecure.SecurityStatusActivity;

public class SecurityFragment extends Fragment {

    private static final String TAG = "HomeSecure";

    private static final String CHANNEL_ID = "HOMESECURE_SECURITY";
    private static final int NOTIFICATION_ID = 1001;
    private static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 200;

    private String selectedMode = "Home";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "SecurityFragment - onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "SecurityFragment - onCreate()");
        createNotificationChannel();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                              @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "SecurityFragment - onCreateView()");
        return inflater.inflate(R.layout.fragment_security, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RadioGroup radioGroupSecurityMode = view.findViewById(R.id.radioGroupSecurityMode);
        Button btnActivateSecurity = view.findViewById(R.id.btnActivateSecurity);

        radioGroupSecurityMode.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioHome) {
                selectedMode = "Home";
            } else if (checkedId == R.id.radioAway) {
                selectedMode = "Away";
            } else if (checkedId == R.id.radioNight) {
                selectedMode = "Night";
            }
        });

        btnActivateSecurity.setOnClickListener(v -> activateSecurity());
    }

    /**
     * Sends the selected security mode to SecurityStatusActivity,
     * updates MainActivity's status text, and shows a notification.
     */
    private void activateSecurity() {
        // Update the status shown on MainActivity, if available
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).updateSecurityStatus(selectedMode);
        }

        // Start SecurityStatusActivity with the selected mode
        Intent intent = new Intent(requireContext(), SecurityStatusActivity.class);
        intent.putExtra("SECURITY_MODE", selectedMode);
        startActivity(intent);

        showSecurityNotification(selectedMode);
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    getString(R.string.notification_channel_name),
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            NotificationManager manager = requireContext().getSystemService(NotificationManager.class);
            if (manager != null) {
                manager.createNotificationChannel(channel);
            }
        }
    }

    private void showSecurityNotification(String mode) {
        // Android 13+ requires runtime permission to post notifications
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(requireContext(),
                    Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(requireActivity(),
                        new String[]{Manifest.permission.POST_NOTIFICATIONS},
                        NOTIFICATION_PERMISSION_REQUEST_CODE);
                return;
            }
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(requireContext(), CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_security)
                .setContentTitle(getString(R.string.notification_title))
                .setContentText("Security activated: " + mode)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true);

        NotificationManager manager =
                (NotificationManager) requireContext().getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(NOTIFICATION_ID, builder.build());
        Log.d(TAG, "SecurityFragment - Notification shown for mode: " + mode);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "SecurityFragment - onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "SecurityFragment - onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "SecurityFragment - onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "SecurityFragment - onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "SecurityFragment - onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "SecurityFragment - onDestroy()");
    }
}
