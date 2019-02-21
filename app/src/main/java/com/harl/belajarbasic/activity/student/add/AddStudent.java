package com.harl.belajarbasic.activity.student.add;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.harl.belajarbasic.R;
import com.harl.belajarbasic.database.DataHelper;
import com.harl.belajarbasic.database.table.StudentEntity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddStudent extends AppCompatActivity {

    @BindView(R.id.etNis)
    TextInputEditText etNis;
    @BindView(R.id.etName)
    TextInputEditText etName;
    @BindView(R.id.btnSave)
    Button btnSave;
    private DataHelper dataHelper;
    private StudentEntity entity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_add);
        ButterKnife.bind(this);

        //syntax dibawah ini berfungsi untuk membuat dn mendeklarasikan database
        dataHelper = Room.databaseBuilder(this, DataHelper.class, "school")
                .allowMainThreadQueries()
                .build();

    }

    @OnClick(R.id.btnSave)
    public void onViewClicked() {
        if (etNis.getText().toString().length() == 0) {
            etNis.setError("harus diisi");
        } else if (etName.getText().toString().length() == 0) {
            etName.setError("harus diisi");
        } else {
            entity = new StudentEntity();
            entity.setNis(Integer.parseInt(etNis.getText().toString()));
            entity.setNama(etName.getText().toString());
            dataHelper.studentDao().insert(entity);

            Toast.makeText(this, "haii!!", Toast.LENGTH_SHORT).show();

        }
    }
}

