package com.example.demo.services;

import com.example.demo.entity.AddressModel;
import com.example.demo.entity.PharmacistModel;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.PharmacistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public AddressModel save(AddressModel addressModel){
        return addressRepository.save(addressModel);
    }
}
