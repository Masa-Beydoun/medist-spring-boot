package com.example.demo.repository;

import com.example.demo.entity.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel,Integer> {

//    List<OrderModel> findOrderModelsByPharmacist_id(int id);

}
