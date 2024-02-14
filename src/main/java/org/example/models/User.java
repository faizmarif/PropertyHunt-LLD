package org.example.models;

//Register a User

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String userName;
    private String userId;
    private final List<Property> propertyList;
    private final List<Property> shortlisted;

    public User(String userName, String userId) {
        this.userName = userName;
        this.userId = userId;
        propertyList = new ArrayList<>();
        shortlisted = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public List<Property> getShortlisted() {
        return shortlisted;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public User addProperty(Property property) {
        this.propertyList.add(property);
        return this;
    }

    public User shortlistProperty(Property property) {
        this.shortlisted.add(property);
        return this;
    }
}
