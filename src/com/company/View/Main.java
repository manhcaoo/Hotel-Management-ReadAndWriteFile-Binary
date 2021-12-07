package com.company.View;

import com.company.file.Path;

import java.io.IOException;

public class Main {
    public Main() throws IOException {
        System.out.println("1. Hotel ROOM MANAGE: ");
        System.out.println("2. Guest MANAGE: ");
        int chooseMenu = Path.scanner().nextInt();
        switch (chooseMenu){
            case 1:
               hotelRoomManage();
                break;
            case 2:
                guestManage();
                break;
        }
    }
    public static void hotelRoomManage() throws IOException {
        HotelRoomMenu hotelRoomMenu = new HotelRoomMenu();
        System.out.println("1. Show List Hotel Room: ");
        System.out.println("2. Create Hotel Room: ");
        System.out.println("3. Detail Hotel Room: ");
        int chosenHotelRoom = Path.scanner().nextInt();
        switch (chosenHotelRoom){
            case 1:
                hotelRoomMenu.viewShowListClassRoom();
                break;
            case 2:
               hotelRoomMenu.creatHotelRoom();
                break;
            case 3:
                hotelRoomMenu.detailHotelRoom();
                break;
        }
    }

    public void guestManage() throws IOException {
        GuestMenu guestMenu = new GuestMenu();
        System.out.println("1. Show List Guest: ");
        System.out.println("2. Create Guest: ");
        int choice = Path.scanner().nextInt();
        switch (choice){
            case 1:
                guestMenu.viewShowListGuest();
                break;
            case 2:
                guestMenu.viewCreatStudent();
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
