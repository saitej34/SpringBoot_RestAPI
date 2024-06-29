package com.carbooking.driver.Dao;

import com.carbooking.driver.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverDao extends JpaRepository<Driver,Integer> {
}
