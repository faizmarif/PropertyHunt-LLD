package org.example.utils;

import org.example.enums.SortBy;
import org.example.models.Property;

import java.util.List;

public class Utils {
    public static void sortProperties(List<Property> propertyList, SortBy sortBy) {
        if(sortBy==null)
            return;
        if(sortBy.equals(SortBy.PRICE)) {
            propertyList.sort((a,b) -> (int)(a.getPrice() - b.getPrice()));
        } else if(sortBy.equals(SortBy.SIZE)) {
            propertyList.sort((a,b) -> (int)(a.getArea() - b.getArea()));
        }
    }
}
