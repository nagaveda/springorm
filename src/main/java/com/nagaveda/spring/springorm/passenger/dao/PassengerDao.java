package com.nagaveda.spring.springorm.passenger.dao;

import java.util.List;

import com.nagaveda.spring.springorm.passenger.entity.Passenger;

public interface PassengerDao {
    void create(Passenger passenger);

    void update(Passenger passenger);

    void delete(Passenger passenger);

    Passenger read(int id);

    List<Passenger> readAll();
}
