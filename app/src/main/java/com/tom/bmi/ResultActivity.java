package com.tom.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.tom.bmi.ui.main.ResultFragment;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ResultFragment.newInstance())
                    .commitNow();
        }

        TextView result = findViewById(R.id.bmiresult);
        float bmi = getIntent().getFloatExtra("BMI", 0);
        result.setText(getString(R.string.your_bmi_is) + bmi);
    }
}