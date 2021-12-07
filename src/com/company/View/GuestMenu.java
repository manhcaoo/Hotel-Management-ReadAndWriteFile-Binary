package com.company.View;

import com.company.controller.GuestManagement;
import com.company.controller.HotelRoomManagement;
import com.company.file.Path;
import com.company.model.Guest;
import com.company.model.HotelRoom;

import java.io.IOException;
import java.util.List;

public class GuestMenu {
    GuestManagement guestManagement = new GuestManagement();
    List<Guest> guestList = guestManagement.showListGuest();
    HotelRoomManagement hotelRoomManagement = new HotelRoomManagement();

    public GuestMenu() throws IOException {
    }
    public void viewCreatStudent() throws IOException {
        while(true){
            int id;
            if(guestList.size()==0){
                id = 1;
            }else {
                id = guestList.get(guestList.size()-1).getId()+1;
            }
            System.out.println("Enter The Name of Client: ");
            String name = Path.scanner().nextLine();
            System.out.println("Insert age ");
            int age = Path.scanner().nextInt();
            System.out.println("Select Id of Class Room: ");
            int id_class_room = Path.scanner().nextInt();
            HotelRoom hotelRoom = hotelRoomManagement.detailHotelRoom(id_class_room);
            Guest newGuest = new Guest(id,name,age,hotelRoom);
            guestManagement.createGuest(newGuest);
            System.out.println("Enter any Key to continue create - Enter QUIT to back MENU: ");
            String back = Path.scanner().next();
            if(back.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
    public void viewShowListGuest(){
        System.out.println("----Student List---");
        System.out.println(guestList);
    }
}
