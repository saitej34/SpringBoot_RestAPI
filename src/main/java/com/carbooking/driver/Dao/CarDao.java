package com.carbooking.driver.Dao;

import com.carbooking.driver.models.AttachementEntity;
import com.carbooking.driver.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface CarDao extends JpaRepository<Car,Integer> {

    @Query(value="SELECT * FROM car WHERE unique_vno=:carId",nativeQuery=true)
    List<Car> findCarById(Integer carId);

    @Query(value="SELECT unique_vno,driver_id,d_name,engine_type,license_plate FROM car c INNER JOIN driver d ON c.unique_vno=d.attached_to_car",nativeQuery = true)
    List<AttachementEntity> findCarDriverAttachementDetails();

    @Query(value="select unique_vno,driver_id,d_name,engine_type,license_plate from car c left join driver d on c.unique_vno=d.attached_to_car where d.attached_to_car is null",nativeQuery = true)
    List<AttachementEntity> findCarDriverAttachementDetailsinFalse();

}
