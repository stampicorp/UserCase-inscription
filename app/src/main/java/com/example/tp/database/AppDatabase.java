package com.example.tp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.tp.dao.UserDao;
import com.example.tp.entities.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}