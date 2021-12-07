package com.company.View;

import com.company.controller.GuestManagement;
import com.company.controller.HotelRoomManagement;
import com.company.file.Path;
import com.company.model.HotelRoom;

import java.io.IOException;
import java.util.List;

public class HotelRoomMenu {
    HotelRoomManagement hotelRoomManagement = new HotelRoomManagement();
    GuestManagement guestManagement = new GuestManagement();
    List<HotelRoom> hotelRoomList = hotelRoomManagement.showListHotelRoom();


    public HotelRoomMenu() throws IOException {
    }

    public void viewShowListClassRoom() throws IOException {
        System.out.println(hotelRoomList);
        System.out.println("Enter QUIT to back MENU: ");
        String back = Path.scanner().nextLine();
        if(back.equalsIgnoreCase("quit")){
            new Main();
        }

    }

    public  void creatHotelRoom() throws IOException {
        while(true){
            int id;
            if(hotelRoomList.size()==0){
                id = 1;
            }else{
                id = hotelRoomList.get(hotelRoomList.size()-1).getId()+1;
            }

            System.out.println("Insert hotel room name: ");
            String name = Path.scanner().nextLine();
            HotelRoom hotelRoom = new HotelRoom(id,name);
            hotelRoomManagement.createHotelRoom(hotelRoom);
            System.out.println("Any Key to Continue - Enter Quit to return.");
            String back = Path.scanner().next();
            if (back.equalsIgnoreCase("quit")){
                new Main();
            }
        }

        }
    public void detailHotelRoom() throws IOException {
while(true) {
    System.out.println("Enter id Hotel Room: ");
    int id_class_room = Path.scanner().nextInt();
    System.out.println("Class: " + hotelRoomManagement.detailHotelRoom(id_class_room));
    System.out.println("List Guest of The Room; " + guestManagement.getListGuestByHotelRoom(id_class_room));
    System.out.println("Enter any Key to continue create - Enter QUIT to back MENU: ");
    String back = Path.scanner().next();
    if(back.equalsIgnoreCase("quit")){
        new Main();
    }
}
    }



}


