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
            case "Kennedy":
                brands.add("Parques");
                brands.add("Zonas verdes");
                break;
            case "CuidadBolivar":
                brands.add("Parques");
                brands.add("Zonas Recreativas");
                break;
            case "Chapinero":
                brands.add("Museos");
                brands.add("Zona Universitaria");
                break;
            case "Suba":
                brands.add("Humedales");
                brands.add("Zona Urbana");
                break;
        }
        return brands;
    }
}
