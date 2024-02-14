package org.example.gui;

import org.example.models.Property;

import java.util.List;

public class OutputPrinter {
    public static void printProperties(List<Property> propertyList) {
        System.out.println("Id Title Location Price Size Rooms AvailableFor");
        for (Property p : propertyList) {
            System.out.println(p.getPropertyId() +
                    " " +
                    p.getPropertyName() +
                    " " +
                    p.getLocation() +
                    " " +
                    p.getPrice() +
                    " " +
                    p.getArea() +
                    " " +
                    p.getPropertyType() +
                    " " +
                    p.getListType());
        }
    }
}
