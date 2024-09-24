package com.app.ecom.repositories;


import com.app.ecom.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findByCountryAndStateAndCityAndPincodeAndStreetAndBuildingName(String country, String state, String city, String pincode
    , String street, String buildingName);
}
