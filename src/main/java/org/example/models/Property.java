package org.example.models;

//List a property: Users can list the properties they want to sell.
//View listed properties: Users can view properties listed by them.
//Shortlist a property: Users can short list properties they are interested in.
//View shortlisted properties: Users can list properties they have shortlisted (including sold but with the status should be “SOLD”)
//Search properties: Users can search for listed properties (only available properties should appear in results). They can use a combination of:
//Sort by: It could be price or size (only ascending order is required).
//Mark Sold: Users can mark a property as SOLD which was listed by them.


//Location
//Price range
//ListingType
//Size range.
//The number of rooms: 1BHK, 2BHK, 3BHK.

import org.example.enums.ListType;
import org.example.enums.PropertyType;

public class Property {
    private String propertyName;
    private String propertyId;
    private User owner;
    private String location;
    private double price;
    private double area;
    private PropertyType propertyType;
    private ListType listType;

    public Property() {
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public User getOwner() {
        return owner;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public double getArea() {
        return area;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public ListType getListType() {
        return listType;
    }

    public Property setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    public Property setPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    public Property setOwner(User owner) {
        this.owner = owner;
        return this;
    }

    public Property setLocation(String location) {
        this.location = location;
        return this;
    }

    public Property setPrice(double price) {
        this.price = price;
        return this;
    }

    public Property setArea(double area) {
        this.area = area;
        return this;
    }

    public Property setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
        return this;
    }

    public Property setListType(ListType listType) {
        this.listType = listType;
        return this;
    }
}
