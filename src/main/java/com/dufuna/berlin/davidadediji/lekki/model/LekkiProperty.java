package com.dufuna.berlin.davidadediji.lekki.model;

import com.dufuna.berlin.davidadediji.lekki.enums.PropertyType;
import java.util.Date;


public class LekkiProperty {
    private int propertyId;
    private String propertyAddress;
    private PropertyType type;
    private int numberOfBedrooms;
    private int numberOfSittingrooms;
    private int numberOfKitchen;
    private int numberOfBathroom;
    private int numberOfToilet;
    private String owner;
    private String description;
    private Date validFrom;
    private Date validTo;


    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }

    public int getBedroomNumber() {
        return numberOfBedrooms;
    }

    public void setBedroomNumber(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getSittingRoomNumber() {
        return numberOfSittingrooms;
    }

    public void setSittingRoomNumber(int numberOfSittingrooms) {
        this.numberOfSittingrooms = numberOfSittingrooms;
    }

    public int getKitchenNumber() {
        return numberOfKitchen;
    }

    public void setKitchenNumber(int numberOfKitchen) {
        this.numberOfKitchen = numberOfKitchen;
    }

    public int getBathroomNumber() {
        return numberOfBathroom;
    }

    public void setBathroomNumber(int numberOfBathroom) {
        this.numberOfBathroom = numberOfBathroom;
    }

    public int getToiletNumber() {
        return numberOfToilet;
    }

    public void setToiletNumber(int numberOfToilet) {
            this.numberOfToilet = numberOfToilet;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString(){
        return propertyId + ", "+ propertyAddress + ", " + type;
    }

    @Override
    public boolean equals(Object obj) {
        LekkiProperty property = (LekkiProperty) obj;
        return this.getPropertyId() == property.getPropertyId();
    }

    @Override
    public int hashCode(){
        return propertyId;
    }

}
