package com.harl.belajarbasic;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.harl.belajarbasic.activity.student.StudentActivity;
import com.harl.belajarbasic.helper.DataConfig;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        etEmail =findViewById(R.id.etEmail);
//        etPassword =findViewById(R.id.etPassword);
//        btnLogin =findViewById(R.id.btnLogin);
//
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"haii!!" ,Toast.LENGTH_SHORT).show();
//            }
//        });
    }
    @OnClick(R.id.btnLogin)
    public void onViewClicked(){
     DataConfig.setLogin(this);
        intent= new Intent(this, StudentActivity.class);
        startActivity(intent);
    }
}
