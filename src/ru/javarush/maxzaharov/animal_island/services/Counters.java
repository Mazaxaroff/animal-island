package ru.javarush.maxzaharov.animal_island.services;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.island.World;

public class Counters {
    public static void currentCountsOfAllAnimal(){
        for (Fauna typeOfAnimal : Fauna.values()) {
            System.out.println(World.getPopulationsSize(typeOfAnimal) + " "
                    + World.populations.get(typeOfAnimal).get(0).getTypeOfAnimal().toString() + " "
                    + World.populations.get(typeOfAnimal).get(0).getEmoji());
        }
    }
    public static void currentCountsOfAllCorpses(){
        for (Fauna typeOfAnimal : Fauna.values()) {
            System.out.println(World.corpses.get(typeOfAnimal) + " "
                    + World.populations.get(typeOfAnimal).get(0).getTypeOfAnimal().toString() + " "
                    + World.populations.get(typeOfAnimal).get(0).getEmoji());
        }
    }

    public static long currentCountOfCorpsesAllAnimal(){
        long countOfCorpses=0;
        for (Fauna typeOfAnimal : Fauna.values()) {
            for (Animal animal : World.populations.get(typeOfAnimal)) {
                if (!animal.isAlive()){
                    countOfCorpses++;
                }
            }
        }
        return countOfCorpses;
    }

}
