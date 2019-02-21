package com.harl.belajarbasic.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.harl.belajarbasic.MainActivity;
import com.harl.belajarbasic.R;
import com.harl.belajarbasic.activity.student.StudentActivity;
import com.harl.belajarbasic.helper.DataConfig;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            if (DataConfig.islogin(SplashScreenActivity.this)){
                startActivity(new Intent(SplashScreenActivity.this, StudentActivity.class));

            }
            else {
                startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
            }
            finish();
        }
    }, 2000 );
    }

}
