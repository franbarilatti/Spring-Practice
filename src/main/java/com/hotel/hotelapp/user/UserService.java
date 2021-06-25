package com.hotel.hotelapp.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserService {
    public List<User> getUser(){
        return List.of( new User(
                1L,
                "Agustina",
                "agusbasso.17@gmail.com",
                LocalDate.of(1996, Month.AUGUST, 30),
                24));
    }

}
