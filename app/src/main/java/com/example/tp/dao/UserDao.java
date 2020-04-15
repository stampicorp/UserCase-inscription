package com.example.tp.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.tp.entities.User;

import java.util.List;

    @Dao
    public interface UserDao {
        @Query("SELECT * FROM user")
        List<User> getAll();

        @Query("SELECT * FROM user WHERE uid IN (:userIds)")
        List<User> loadAllByIds(int[] userIds);

        @Query("SELECT * FROM user WHERE email LIKE :email AND " +
                "pass LIKE :pass LIMIT 1")
        User findByEmailPass(String email, String pass);

        @Query("SELECT * FROM user WHERE email LIKE :email")
        User findByEmail(String email);

        @Insert
        void insertAll(User... users);

        @Delete
        void delete(User user);
    }

