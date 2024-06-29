package com.carbooking.driver.Dao;

import com.carbooking.driver.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car,Integer> {

}
