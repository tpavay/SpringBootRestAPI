package com.tylerpavay.rest_demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tylerpavay.rest_demo.model.CloudVendor;
import com.tylerpavay.rest_demo.service.CloudVendorService;

@RestController // This class is responsible for exposing all functionality for REST APIs
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    @Autowired
    CloudVendorService cloudVendorService;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
        return cloudVendorService.getCloudVendorById(vendorId);
    }
    
    // Tell Spring boot that this is a POST method accessible via REST
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Successfully Created Cloud Vendor";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable String vendorId) {
        cloudVendorService.deleteCloudVendorById(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}
