package ru.javarush.maxzaharov.animal_island.services;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.island.World;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Counters {
    public static void currentCountsOfAllAnimal(HashMap<Fauna, ArrayList<Animal>> population) {
        for (Fauna typeOfAnimal : Fauna.values()) {
            if (World.populations.get(typeOfAnimal).size() != 0) {
                System.out.println(World.getPopulationsSize(typeOfAnimal, population) + " "
                        + typeOfAnimal.toString() + " "
                        + World.populations.get(typeOfAnimal).get(0).getEmoji());
            } else {
                System.out.println(World.getPopulationsSize(typeOfAnimal, population) + " "
                        + typeOfAnimal.toString());
            }
        }
    }

    public static void currentCountsOfAllCorpses() {
        for (Fauna typeOfAnimal : Fauna.values()) {
            if (World.populations.get(typeOfAnimal).size() != 0) {
                System.out.println(World.corpses.get(typeOfAnimal) + " "
                        + typeOfAnimal.toString() + " "
                        + World.populations.get(typeOfAnimal).get(0).getEmoji());
            } else {
                System.out.println(World.corpses.get(typeOfAnimal) + " "
                        + typeOfAnimal.toString());
            }
        }
    }

    public static int currentCountOfAllPlants(Sector[][] island) {
        var sumOfPlantsNumbers = Arrays.stream(island)
                .flatMap(Arrays::stream)
                .map(sector -> sector.currentCountOfPlants).reduce(Integer::sum);
        return sumOfPlantsNumbers.get();
    }


}
