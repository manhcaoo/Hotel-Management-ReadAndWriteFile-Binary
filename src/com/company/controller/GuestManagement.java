package com.company.controller;

import com.company.model.Guest;
import com.company.model.HotelRoom;
import com.company.service.guest.GuestServiceImplService;
import com.company.service.hotelroom.HotelRoomService;

import java.io.IOException;
import java.util.List;

public class GuestManagement {
    GuestServiceImplService guestServiceImplService = new GuestServiceImplService();
    public List<Guest> showListGuest() throws IOException {
        return guestServiceImplService.findAll();
    }
    public void createGuest(Guest guest) throws IOException {
        guestServiceImplService.save(guest);
        showListGuest();
    }

    public List<Guest> getListGuestByHotelRoom(int id) {
        return guestServiceImplService.findByClassRoomId(id);
    }



    }



