package ru.javarush.maxzaharov.animal_island.island;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.services.RandomNumber;

import java.util.ArrayList;
import java.util.HashMap;

public class World {

    public World() {
        this.populations = populations;
    }

    public static HashMap<Fauna, ArrayList<Animal>> populations = new HashMap<>() {{
        for (Fauna typeOfAnimal : Fauna.values()) {
            put(typeOfAnimal, new ArrayList<>());
        }
    }};
    public static HashMap<Fauna, ArrayList<Animal>> babiesPopulations = new HashMap<>() {{
        for (Fauna typeOfAnimal : Fauna.values()) {
            put(typeOfAnimal, new ArrayList<>());
        }
    }};
    public static HashMap<Fauna, Integer> corpses = new HashMap<>();

    public static int getPopulationsSize(Fauna typeOfAnimal, HashMap<Fauna, ArrayList<Animal>> population) {
        return population.get(typeOfAnimal).size();
    }

    public static void createCemetery() {
        for (Fauna typeOfAnimal : Fauna.values()) {
            int countOfCorpses = 0;
            for (Animal animal : World.populations.get(typeOfAnimal)) {
                if (!animal.isAlive()) {
                    countOfCorpses++;
                    corpses.put(typeOfAnimal, countOfCorpses);
                }
            }
        }
    }

    public static Animal randomAnimalForAction(Fauna typeOfAnimal, int x, int y) {
        var animalsInSector = populations.get(typeOfAnimal).stream()
                .filter(animal -> animal.getX() == x && animal.getY() == y && animal.isAlive())
                .toList();
        if (animalsInSector.size() == 0) {
            return null;
        }
        int indexOfAnimal = RandomNumber.get(animalsInSector.size());
        return animalsInSector.get(indexOfAnimal);
    }

    public static Animal randomAnimalForAction(Fauna typeOfAnimal, int x, int y, Animal self) {
        var animalsInSector = populations.get(typeOfAnimal).stream()
                .filter(animal -> animal.getX() == x && animal.getY() == y && animal.isAlive() && !animal.equals(self))
                .toList();
        if (animalsInSector.size() == 0) {
            return null;
        }
        int indexOfAnimal = RandomNumber.get(animalsInSector.size());
        return animalsInSector.get(indexOfAnimal);
    }

}
