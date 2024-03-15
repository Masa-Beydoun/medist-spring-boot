package com.example.demo.repository;

import com.example.demo.entity.PharmacistModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacistRepository extends JpaRepository<PharmacistModel,Integer> {
}
