package co.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        switch (color){
            case "Cuidad Salitre":
                brands.add("Parques");
                brands.add("Ciclorutas");
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
            case "usaquen":
                brands.add("Humedales");
                brands.add("Zona Urbana");
                break;

        }
        return brands;
    }
}
