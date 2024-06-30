package com.carbooking.driver.Dao;

import com.carbooking.driver.models.Manfacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManfacturerDao extends JpaRepository<Manfacturer,Integer> {
}
