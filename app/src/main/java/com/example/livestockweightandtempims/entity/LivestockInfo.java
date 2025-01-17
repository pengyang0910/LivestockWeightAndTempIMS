package com.example.livestockweightandtempims.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class LivestockInfo {
    @PrimaryKey(autoGenerate = true)
    private long id;

    private float weight;
    private float temp;
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "LivestockInfo{" +
                "id=" + id +
                ", weight=" + weight +
                ", temp=" + temp +
                ", note='" + note + '\'' +
                '}';
    }
}
