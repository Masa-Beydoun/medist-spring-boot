package com.example.demo.repository;

import com.example.demo.entity.WarehouseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<WarehouseModel,Integer> {
}
