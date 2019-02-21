package com.harl.belajarbasic.database.query;

import com.harl.belajarbasic.database.table.StudentEntity;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface StudentDao {
@Insert
    void insert(StudentEntity entity);

    @Update
     void update(StudentEntity entity );


}
