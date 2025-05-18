package com.tylerpavay.rest_demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tylerpavay.rest_demo.model.CloudVendor;
import com.tylerpavay.rest_demo.repository.CloudVendorRepository;
import com.tylerpavay.rest_demo.service.CloudVendorService;


@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    @Autowired
    CloudVendorRepository cloudVendorRepository;

    @Override
    public void createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
    }

    @Override
    public void deleteCloudVendorById(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
    }

    @Override
    public CloudVendor getCloudVendorById(String vendorId) {
        Optional<CloudVendor> cloudVendor = cloudVendorRepository.findById(vendorId);

        if (cloudVendor.isPresent()) {
            return cloudVendor.get();
        }
        return new CloudVendor();
    }

    @Override
    public void updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
    }

}
