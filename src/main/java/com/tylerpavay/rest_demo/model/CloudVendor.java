package com.tylerpavay.rest_demo.model;

import jakarta.persistence.Entity; // Jakarta namespace rather than javax because we are on a Spring boot 3.x.x version rather than 2.x.x
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
// Specifically override default table name using @Table annotation
@Table(name="cloud_vendor_info") // Hibernate will automatically create cloud_vendor_info table with the name cloud_vendor_info due to the ddl-auto=update configuration
public class CloudVendor {

    @Id // Denote this property as the id of our entity. This is required; every @Entity must have the primary key denoted with @Id
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    // Empty Constructor
    public CloudVendor() {

    }

    // Constructor With Arguments
    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
