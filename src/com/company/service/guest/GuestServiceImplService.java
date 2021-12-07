package com.company.service.guest;

import com.company.config.ConfigReadAndWriteFile;
import com.company.file.Path;
import com.company.model.Guest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GuestServiceImplService implements IGuestService {
    public String PATH_GUEST = "guest.txt";
    ConfigReadAndWriteFile<Guest> configReadAndWriteFile = new ConfigReadAndWriteFile();
    List<Guest> guestList = configReadAndWriteFile.readFromFile(PATH_GUEST);

    @Override
    public List<Guest> findAll() throws IOException {
        configReadAndWriteFile.writeToFile(PATH_GUEST,guestList);
        return guestList;
    }

    @Override
    public void save(Guest guest) {
        guestList.add(guest);

    }

    @Override
    public Guest findById(int id) {
        return null;
    }

    @Override
    public List<Guest> findByClassRoomId(int id) {
        List<Guest> guestListByRoomId = new ArrayList<>();
        for (int i = 0; i < guestList.size(); i++) {
            if(guestList.get(i).getHotelRoom().getId()==id){
                guestListByRoomId.add(guestList.get(i));
            }
        }
        return guestListByRoomId;
    }
}

