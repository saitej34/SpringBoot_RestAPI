package com.carbooking.driver.services;

import com.carbooking.driver.Dao.CarDao;
import com.carbooking.driver.Dao.ManfacturerDao;
import com.carbooking.driver.models.APIResponse;
import com.carbooking.driver.models.Car;
import com.carbooking.driver.models.CarWrapper;
import com.carbooking.driver.models.Manfacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    CarDao carDao;

    ManfacturerDao manfacturerDao;

    @Autowired
    public void setManfacturerDao(ManfacturerDao manfacturerDao) {
        this.manfacturerDao = manfacturerDao;
    }

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    public ResponseEntity<APIResponse> createCar(CarWrapper car) {
        Manfacturer manufacturer = new Manfacturer(car.getMid(), car.getmFranchiseName(), car.getAddress(), car.getContactNo());
        try {
            if (manufacturer.getMid() == null) {
                return new ResponseEntity<>(new APIResponse("Failed", "Manufacturer details are required"), HttpStatus.BAD_REQUEST);
            }
            manfacturerDao.save(manufacturer);

            Car finalCar = new Car(car.getUnique_vno(), manufacturer, car.getEngine_type(), car.getCar_rating(), car.getCar_convertible(), car.getSeat_count(), car.getLicense_plate());
            carDao.save(finalCar);

            return new ResponseEntity<>(new APIResponse("Success", "Car Details Saved into Database"), HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new APIResponse("Failed", "Car Details Not Saved - Internal Server Error"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<Car>> getAllCars() {
        try {
            List<Car> cars = carDao.findAll();
            return new ResponseEntity<>(cars,HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
