package com.tylerpavay.rest_demo.service;

import com.tylerpavay.rest_demo.model.CloudVendor;

public interface CloudVendorService {
    // Implement CRUD operations and get all operation
    public void createCloudVendor(CloudVendor cloudVendor);

    public void deleteCloudVendorById(String vendorId);

    public CloudVendor getCloudVendorById(String vendorId);

    public void updateCloudVendor(CloudVendor cloudVendor);
}
