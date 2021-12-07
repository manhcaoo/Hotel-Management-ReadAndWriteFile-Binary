package com.company.model;

import java.io.Serializable;

public class Guest implements Serializable {
    private int id;
    private String name;
    private int age;
    private HotelRoom hotelRoom;

    public Guest(int id, String name, int age, HotelRoom hotelRoom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hotelRoom = hotelRoom;
    }

    public Guest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", com.company.service.hotelRoom=" + hotelRoom +
                '}';
    }
}
