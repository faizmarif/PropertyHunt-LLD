package org.example.dao;

import org.example.models.Property;
import org.example.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertyHuntDao {
    private static Map<String, User> userIdMap;
    private static Map<String, Property> propertyIdMap;
    private static PropertyHuntDao propertyHuntDao;

    private PropertyHuntDao() {
        userIdMap = new HashMap<>();
        propertyIdMap = new HashMap<>();
    }

    public static PropertyHuntDao getInstance() {
        if(propertyHuntDao == null) {
            return new PropertyHuntDao();
        }
        return propertyHuntDao;
    }

    public User getUser(String userId) {
        return userIdMap.get(userId);
    }

    public Property getProperty(String propertyId) {
        return propertyIdMap.get(propertyId);
    }

    public List<Property> getAllProperties() {
        return new ArrayList<>(propertyIdMap.values());
    }

    public User registerUser(String userName, String userId) {
        User user = new User(userName, userId);
        userIdMap.put(userId, user);
        System.out.println("User registered successfully.");
        return user;
    }

    public void addProperty(Property property) {
        propertyIdMap.put(property.getPropertyId(), property);
    }
}
