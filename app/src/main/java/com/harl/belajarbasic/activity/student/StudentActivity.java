package com.harl.belajarbasic.activity.student;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.harl.belajarbasic.MainActivity;
import com.harl.belajarbasic.R;
import com.harl.belajarbasic.adapter.StudentAdapter;
import com.harl.belajarbasic.helper.DataConfig;
import com.harl.belajarbasic.model.Student;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StudentActivity extends AppCompatActivity {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    @BindView(R.id.btnAdd)
    Button btnAdd;
    @BindView(R.id.btnLogout)
    Button btnLogout;
    private Student student;
    private ArrayList<Student> list;
    private StudentAdapter studentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        ButterKnife.bind(this);

        list = new ArrayList<>();
        list.add(new Student("pak tjoy", "katolik", "L"));
        list.add(new Student("buk tjoy", "katolik", "p"));
        list.add(new Student("kujoy", "agnostic", "L"));

        studentAdapter = new StudentAdapter(list);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(studentAdapter);
        recyclerview.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }

    @OnClick({R.id.btnAdd, R.id.btnLogout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnAdd:
                break;
            case R.id.btnLogout:
                DataConfig.setLogout(this);
                startActivity (new Intent(this, MainActivity.class));
                finish();
                break;
        }
    }
}
