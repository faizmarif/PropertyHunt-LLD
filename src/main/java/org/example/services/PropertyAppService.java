package org.example.services;

import org.example.dao.PropertyHuntDao;
import org.example.enums.ListType;
import org.example.enums.PropertyType;
import org.example.enums.SortBy;
import org.example.gui.OutputPrinter;
import org.example.models.Property;
import org.example.models.User;
import org.example.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class PropertyAppService implements AppService{
    private static final PropertyHuntDao dao = PropertyHuntDao.getInstance();
    @Override
    public void listProperty(String userId, String propertyName, String propertyId, String location, double price, ListType listType, double area, PropertyType propertyType) {
        User user = dao.getUser(userId);
        Property property = new Property()
                .setPropertyName(propertyName)
                .setPropertyId(propertyId)
                .setLocation(location)
                .setPrice(price)
                .setListType(listType)
                .setArea(area)
                .setPropertyType(propertyType)
                .setOwner(user);
        user.addProperty(property);
        dao.addProperty(property);
        System.out.println("Property listed successfully.");
    }

    @Override
    public void searchProperty(String location, Double minPrice, Double maxPrice, ListType listType, Double area, PropertyType propertyType, SortBy sortBy) {
        List<Property> searchResult = new ArrayList<>();
        for(Property prt : dao.getAllProperties()) {
            if((location==null || prt.getLocation().equals(location))
                    && (minPrice==null || prt.getPrice()>=minPrice)
                    && (maxPrice==null || prt.getPrice()<=maxPrice)
                    && (listType==null || prt.getListType().equals(listType))
                    && (area==null || prt.getArea() == area)
                    && (propertyType==null || prt.getPropertyType().equals(propertyType))) {
                searchResult.add(prt);
            }
        }
        Utils.sortProperties(searchResult, sortBy);
        OutputPrinter.printProperties(searchResult);
    }

    @Override
    public void shortlistProperty(String userId, String propertyId) {
        dao.getUser(userId).shortlistProperty(dao.getProperty(propertyId));
        System.out.println("Shortlisted property");
    }

    @Override
    public void viewShortlisted(String userId) {
        OutputPrinter.printProperties(dao.getUser(userId).getShortlisted());
    }
}
