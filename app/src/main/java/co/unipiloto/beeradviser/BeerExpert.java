package co.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        switch (color){
            case "Light":
                brands.add("Corona");
                brands.add("Bud Light");
                break;
            case "Amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                break;
            case "Brown":
                brands.add("Brown Bear Beer");
                brands.add("Bock");
                break;
            case "Dark":
                brands.add("Guinness");
                brands.add("Stout");
                break;
        }
        return brands;
    }
}
