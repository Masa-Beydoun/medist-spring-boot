package com.example.demo.controller;

import com.example.demo.entity.AddressModel;
import com.example.demo.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/addresses")
@RequiredArgsConstructor
public class AddressController {

    @Autowired
    private final AddressService addressService;

    public ResponseEntity newAddress(@RequestBody AddressModel address){
        return ResponseEntity.ok(addressService.save(address));

    }

}
