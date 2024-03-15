package com.example.demo.repository;

import com.example.demo.entity.MedicineOrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineOrderRepository extends JpaRepository<MedicineOrderModel,Integer> {

//    List<MedicineOrderModel> findMedicineOrderModelByOrder_id(int id);

}
