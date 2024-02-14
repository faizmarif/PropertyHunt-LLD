package org.example.services;

import org.example.enums.ListType;
import org.example.enums.PropertyType;
import org.example.enums.SortBy;

public interface AppService {

    void listProperty(String userId, String propertyName, String propertyId, String location, double price, ListType listType, double area, PropertyType propertyType);

    void searchProperty(String location, Double minPrice, Double maxPrice, ListType listType, Double area, PropertyType propertyType, SortBy sortBy);
    void shortlistProperty(String userId, String propertyId);
    void viewShortlisted(String userId);
}
