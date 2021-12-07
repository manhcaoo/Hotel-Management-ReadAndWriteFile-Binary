package com.company.service.hotelroom;

import com.company.config.ConfigReadAndWriteFile;
import com.company.file.Path;
import com.company.model.HotelRoom;

import java.io.IOException;
import java.util.List;

public class HotelRoomService implements InHotelRoomService {
    public String PATH_HOTEL_ROOM = "hotelRoom.txt";
    ConfigReadAndWriteFile<HotelRoom> configReadAndWriteFile = new ConfigReadAndWriteFile<>();
    List<HotelRoom> hotelRoomList = configReadAndWriteFile.readFromFile(PATH_HOTEL_ROOM);

    @Override
    public List<HotelRoom> findAll() throws IOException {
        configReadAndWriteFile.writeToFile(PATH_HOTEL_ROOM, hotelRoomList);
        return hotelRoomList;
    }

    @Override
    public void save(HotelRoom hotelRoom) {
    hotelRoomList.add(hotelRoom);
    }

    @Override
    public HotelRoom findById(int id) {
        for (int i = 0; i < hotelRoomList.size(); i++) {
            if(id == hotelRoomList.get(i).getId()){
                return hotelRoomList.get(i);
            }
        }
        return null;
    }
}
