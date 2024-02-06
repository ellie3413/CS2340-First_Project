package com.example.cs2340_first_project;
// SettingsActivity.java
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    private SeekBar notificationSizeSeekBar;
    private TextView notificationSizeTextView;

    private Button Settings;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        notificationSizeSeekBar = findViewById(R.id.notificationSizeSeekBar);
        notificationSizeTextView = findViewById(R.id.notificationSizeTextView);

        notificationSizeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                notificationSizeTextView.setText("Notification Size: " + progress);
                // 여기에서 알림 크기를 조절하는 작업을 수행할 수 있습니다.
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }
}

