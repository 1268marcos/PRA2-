package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Place")
public class Place {

@PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "placeId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "placeName")
    private String mName;

    private String mLocationCity;

    public Museum(@Nullable String name, String locationCity, int score, String creationDate) {
        mName = name;
        mLocationCity = locationCity;
        mScore = score;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getlocationCity() {
        return mLocationCity;
    }

    public void setLocationCity(String locationCity) {
        mLocationCity = locationCity;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mScore;
    private String mCreationDate;

}
