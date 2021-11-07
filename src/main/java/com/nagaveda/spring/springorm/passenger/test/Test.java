package com.nagaveda.spring.springorm.passenger.test;

import java.util.List;

import com.nagaveda.spring.springorm.passenger.dao.PassengerDao;
import com.nagaveda.spring.springorm.passenger.entity.Passenger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/nagaveda/spring/springorm/passenger/test/config.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
        // Passenger passenger = new Passenger();
        // passenger.setId(3);
        // passenger.setFirstName("steve");
        // passenger.setLastName("Hacks");
        List<Passenger> passengers = passengerDao.readAll();
        for (Passenger passenger : passengers) {
            System.out.println(passenger);
        }

    }
}
