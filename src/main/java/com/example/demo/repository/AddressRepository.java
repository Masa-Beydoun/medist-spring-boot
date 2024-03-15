package com.example.demo.repository;

import com.example.demo.entity.AddressModel;
import com.example.demo.entity.PharmacistModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AddressRepository extends JpaRepository<AddressModel,Integer> {
//    AddressModel findAddressModelByPharmacistModel(PharmacistModel pharmacistModel);

}
