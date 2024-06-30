package com.carbooking.driver.Dao;

import com.carbooking.driver.models.AttachementEntity;
import com.carbooking.driver.models.Driver;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverDao extends JpaRepository<Driver,Integer> {


    @Query(value="SELECT * FROM driver WHERE attached_to_car=:attachedToCar ORDER BY driver_id",nativeQuery=true)
    List<Driver> findDriverbyNotAttached(Integer attachedToCar);

    @Query(value="SELECT * FROM driver WHERE attached_to_car!=:attachedToCar ORDER BY driver_id",nativeQuery=true)
    List<Driver> findDriverbyAttachedList(Integer attachedToCar);

    @Transactional
    @Modifying
    @Query(value="UPDATE driver SET attached_to_car= ?1 WHERE driver_id= ?2",nativeQuery = true)
    void makeAttachment(Integer carId,Integer driverId);

    @Query(value="SELECT * from driver where driver_id=:driverId",nativeQuery = true)
    List<Driver> findDriverById(Integer driverId);


}
