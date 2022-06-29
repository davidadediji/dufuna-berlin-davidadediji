package com.dufuna.berlin.davidadediji.lekki.model;

import com.dufuna.berlin.davidadediji.lekki.Address;
import com.dufuna.berlin.davidadediji.lekki.Owner;
import com.dufuna.berlin.davidadediji.lekki.enums.PropertyType;
import java.util.Date;


public class LekkiProperty {
    private int propertyId;
    private Address propertyAddress;
    private PropertyType type;
    private int bedroomNumber;
    private int sittingRoomNumber;
    private int kitchenNumber;
    private int bathroomNumber;
    private int toiletNumber;
    private Owner owner;
    private String description;
    private Date validFrom;
    private Date validTo;


    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public Address getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(Address propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }

    public int getBedroomNumber() {
        return bedroomNumber;
    }

    public void setBedroomNumber(int bedroomNumber) {
        this.bedroomNumber = bedroomNumber;
    }

    public int getSittingRoomNumber() {
        return sittingRoomNumber;
    }

    public void setSittingRoomNumber(int sittingRoomNumber) {
        this.sittingRoomNumber = sittingRoomNumber;
    }

    public int getKitchenNumber() {
        return kitchenNumber;
    }

    public void setKitchenNumber(int kitchenNumber) {
        this.kitchenNumber = kitchenNumber;
    }

    public int getBathroomNumber() {
        return bathroomNumber;
    }

    public void setBathroomNumber(int bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    public int getToiletNumber() {
        return toiletNumber;
    }

    public void setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
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


}
