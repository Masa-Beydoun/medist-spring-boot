package com.example.demo.repository;

import com.example.demo.entity.MedicineDetailsModel;
import com.example.demo.entity.MedicineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MedicineDetailsRepository extends JpaRepository<MedicineDetailsModel,Integer> {

//    List<MedicineDetailsModel> findMedicineDetailsModelByMedicineId(int id);

}
