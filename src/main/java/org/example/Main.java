package org.example;

import org.example.dao.PropertyHuntDao;
import org.example.enums.ListType;
import org.example.enums.PropertyType;
import org.example.enums.SortBy;
import org.example.services.PropertyAppService;

public class Main {
    public static void main(String[] args) {
        PropertyHuntDao dao = PropertyHuntDao.getInstance();
        PropertyAppService app = new PropertyAppService();
        dao.registerUser("Jack", "jack");

        app.listProperty("jack", "A 3BHK for sale", "1", "bellandur", 9000000, ListType.SALE, 1800, PropertyType.BHK_3);
        app.listProperty("jack", "A 2BHK for rent", "2", "sarjapur", 40000, ListType.RENT, 1500, PropertyType.BHK_2);

        app.searchProperty("sarjapur", 30000D, 50000D, ListType.RENT, 1500D, PropertyType.BHK_2, SortBy.PRICE);

        app.shortlistProperty("jack", "2");

        app.viewShortlisted("jack");

        app.searchProperty(null, null, null, null, null, null, SortBy.SIZE);


    }
}