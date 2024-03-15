package com.example.demo.repository;

import com.example.demo.entity.MedicineDetailsModel;
import com.example.demo.entity.MedicineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<MedicineModel,Integer> {



}
