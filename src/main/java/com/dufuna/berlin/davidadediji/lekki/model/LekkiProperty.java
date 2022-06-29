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


    private boolean verify;





}
