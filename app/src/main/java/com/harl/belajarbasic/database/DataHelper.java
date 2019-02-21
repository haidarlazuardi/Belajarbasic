package com.harl.belajarbasic.database;

import com.harl.belajarbasic.database.query.StudentDao;
import com.harl.belajarbasic.database.table.StudentEntity;

import androidx.room.Database;
import androidx.room.RoomDatabase;
//ada isinya
//dia harus extends roomdatabase
@Database(entities= {StudentEntity.class},version = 1)
public abstract class DataHelper extends RoomDatabase {
    public abstract StudentDao studentDao();

}
