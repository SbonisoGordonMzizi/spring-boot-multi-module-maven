package co.za.gordonmzizi.springbootmultimodulemaven.controller;

import co.za.gordonmzizi.springbootmultimodulemaven.model.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {
    @RequestMapping("/")
    public Address getAddress(){
        Address address = new Address();
        address.setCountryName("South Africa");
        address.setLocality("Durban");
        address.setRegion("Kwazulu-Natal");
        address.setPostalCode("23 Wall");
        address.setPostOfficeBox("23 STREET");
        address.setStreetAddress("12 dala");

        return address;
    }

}
