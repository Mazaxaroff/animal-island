package ru.javarush.maxzaharov.animal_island.island;


import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.BasicUnit;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Wolf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Island {
    public static final int WIDTH_OF_ISLAND = 5;
    public static final int HEIGHT_OF_ISLAND = 5;
    public static final Sector[][] LAND = new Sector[WIDTH_OF_ISLAND][HEIGHT_OF_ISLAND];


    public static Sector[][] create(ArrayList<Wolf> wolves){
//        Sector[][] island = new HashMap<>();
//       island.put(LAND, new ArrayList<>());

        for (int i = 0; i < LAND.length; i++) {
            for (int j = 0; j < LAND[i].length; j++) {
                LAND[i][j] =new Sector(i,j, wolves);
            }
        }
        return LAND;

    }


}
