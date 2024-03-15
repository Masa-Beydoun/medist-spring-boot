package com.example.demo.repository;

import com.example.demo.entity.SettingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepository extends JpaRepository<SettingModel,Integer> {
}
