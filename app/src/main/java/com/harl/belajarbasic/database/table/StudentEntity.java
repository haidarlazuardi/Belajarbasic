package com.harl.belajarbasic.database.table;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class StudentEntity {
    //auto generate = auto increa ment
    @PrimaryKey(autoGenerate = true) int id;

    //name disini untuk menunjukan nama nis
    @ColumnInfo(name = "nis") int nis;


    @ColumnInfo(name = "nama") String nama;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNis() {
        return nis;
    }

    public void setNis(int nis) {
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
