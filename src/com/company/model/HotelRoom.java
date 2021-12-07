package com.company.model;

import java.io.Serializable;
import java.util.List;

public class HotelRoom implements Serializable {
    private int id;
    private String name;
    private List<Guest> guestList;

    public HotelRoom() {
    }

    public HotelRoom(int id, String name, List<Guest> guestList) {
        this.id = id;
        this.name = name;
        this.guestList = guestList;
    }

    public HotelRoom(int id, String name) {
        this.id = id;
        this.name = name;
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

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guestList=" + guestList +
                '}';
    }
}
