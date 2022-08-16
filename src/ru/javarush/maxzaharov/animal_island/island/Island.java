package ru.javarush.maxzaharov.animal_island.island;

import lombok.Data;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.BasicUnit;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Eagle;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Wolf;
import ru.javarush.maxzaharov.animal_island.animals.herbivore.Goat;
import ru.javarush.maxzaharov.animal_island.animals.herbivore.Mouse;
import ru.javarush.maxzaharov.animal_island.animals.herbivore.Sheep;

import java.util.ArrayList;
import java.util.Arrays;


public class Island {
    public static int widthOfIsland = 5;
    public static int heightOfIsland = 5;


    public static ArrayList<BasicUnit>[][] createIsland() {
        return new ArrayList[widthOfIsland][heightOfIsland];
    }

    public static ArrayList<BasicUnit>[][] fill(ArrayList<BasicUnit>[][] island) {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                island[i][j] = new ArrayList<>();
                //island[i][j].add(new Wolf());
            }
        }
        island[0][1].add(new Wolf());
        return island;
    }
}
