package com.nagaveda.spring.springorm.passenger.dao.impl;

import java.util.List;

import com.nagaveda.spring.springorm.passenger.dao.PassengerDao;
import com.nagaveda.spring.springorm.passenger.entity.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public void create(Passenger passenger) {
        hibernateTemplate.save(passenger);

    }

    @Override
    @Transactional
    public void update(Passenger passenger) {
        hibernateTemplate.update(passenger);
    }

    @Override
    @Transactional
    public void delete(Passenger passenger) {
        hibernateTemplate.delete(passenger);

    }

    @Override
    @Transactional
    public Passenger read(int id) {
        Passenger passenger = hibernateTemplate.get(Passenger.class, id);
        return passenger;
    }

    @Override
    @Transactional
    public List<Passenger> readAll() {
        List<Passenger> passengers = hibernateTemplate.loadAll(Passenger.class);
        return passengers;
    }

}
