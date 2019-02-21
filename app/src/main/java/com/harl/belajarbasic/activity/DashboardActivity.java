package com.harl.belajarbasic.activity;

import android.os.Bundle;
import android.widget.Toast;

import com.harl.belajarbasic.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Toast.makeText(this, "ini onCreate", Toast.LENGTH_LONG).show();
    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(this, "ini onStart", Toast.LENGTH_LONG).show();
//
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(this, "ini onStop", Toast.LENGTH_LONG).show();
//
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(this, "ini onResume", Toast.LENGTH_LONG).show();
//
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(this, "ini onPause", Toast.LENGTH_LONG).show();
//
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(this, "ini onRestart", Toast.LENGTH_LONG).show();
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(this, "ini onDestroy", Toast.LENGTH_LONG).show();
//
//    }
}





