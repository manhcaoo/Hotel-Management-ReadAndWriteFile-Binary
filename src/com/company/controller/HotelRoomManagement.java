package com.company.controller;

import com.company.model.HotelRoom;
import com.company.service.hotelroom.HotelRoomService;

import java.io.IOException;
import java.util.List;

public class HotelRoomManagement {
    HotelRoomService hotelRoomService = new HotelRoomService();
    public List<HotelRoom> showListHotelRoom() throws IOException {
        return hotelRoomService.findAll();
    }
    public void createHotelRoom(HotelRoom hotelRoom) throws IOException {
        hotelRoomService.save(hotelRoom);
        showListHotelRoom();
    }

    public HotelRoom detailHotelRoom(int id){
        return hotelRoomService.findById(id);
    }

}
