package com.company.service.guest;

import com.company.model.Guest;
import com.company.service.IService;

import java.util.List;

public interface IGuestService extends IService<Guest> {
    List<Guest> findByClassRoomId(int id);
}
