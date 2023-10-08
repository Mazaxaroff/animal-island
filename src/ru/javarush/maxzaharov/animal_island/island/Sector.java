package ru.javarush.maxzaharov.animal_island.island;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.services.RandomNumber;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.*;
import ru.javarush.maxzaharov.animal_island.animals.herbivore.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Sector {
    public static final int MAX_COUNT_OF_WOLVES = 30;
    public static final int MAX_COUNT_OF_FOXES = 30;
    public static final int MAX_COUNT_OF_EAGLES = 20;
    public static final int MAX_COUNT_OF_BOAS = 30;
    public static final int MAX_COUNT_OF_BEARS = 5;
    public static final int MAX_COUNT_OF_BOARS = 5;
    public static final int MAX_COUNT_OF_BUFFALOES = 10;
    public static final int MAX_COUNT_OF_CATERPILLARS = 1000;
    public static final int MAX_COUNT_OF_DEER = 20;
    public static final int MAX_COUNT_OF_DUCKS = 200;
    public static final int MAX_COUNT_OF_GOATS = 140;
    public static final int MAX_COUNT_OF_HORSES = 20;
    public static final int MAX_COUNT_OF_MOUSES = 500;
    public static final int MAX_COUNT_OF_RABBITS = 150;
    public static final int MAX_COUNT_OF_SHEEP = 140;
    public static final int MAX_COUNT_OF_PLANTS = 200;
    public int currentCountOfPlants;
    public int x;
    public int y;
    HashMap<Fauna, Integer> maxCountsOfAnimal = new HashMap<>() {{
        put(Fauna.WOLF, MAX_COUNT_OF_WOLVES);
        put(Fauna.FOX, MAX_COUNT_OF_FOXES);
        put(Fauna.EAGLE, MAX_COUNT_OF_EAGLES);
        put(Fauna.BOA, MAX_COUNT_OF_BOAS);
        put(Fauna.BEAR, MAX_COUNT_OF_BEARS);
        put(Fauna.BOAR, MAX_COUNT_OF_BOARS);
        put(Fauna.BUFFALO, MAX_COUNT_OF_BUFFALOES);
        put(Fauna.CATERPILLAR, MAX_COUNT_OF_CATERPILLARS);
        put(Fauna.DEER, MAX_COUNT_OF_DEER);
        put(Fauna.DUCK, MAX_COUNT_OF_DUCKS);
        put(Fauna.GOAT, MAX_COUNT_OF_GOATS);
        put(Fauna.HORSE, MAX_COUNT_OF_HORSES);
        put(Fauna.MOUSE, MAX_COUNT_OF_MOUSES);
        put(Fauna.RABBIT, MAX_COUNT_OF_RABBITS);
        put(Fauna.SHEEP, MAX_COUNT_OF_SHEEP);
    }};
    HashMap<Fauna, Integer> currentCountsOfAnimal = new HashMap<>();

    public Sector(int x, int y) {
        this.x = x;
        this.y = y;
        for (Fauna typeOfAnimal : Fauna.values()) {
            CreateAnimal(x, y, typeOfAnimal);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public HashMap<Fauna, Integer> getCurrentCountsOfAnimal() {
        return currentCountsOfAnimal;
    }

    public void createPlant() {
        currentCountOfPlants = RandomNumber.get(MAX_COUNT_OF_PLANTS);
    }

    public HashMap<Fauna, Integer> getMaxCountsOfAnimal() {
        return maxCountsOfAnimal;
    }

    private void CreateAnimal(int x, int y, Fauna typeOfAnimal) {
        currentCountsOfAnimal.put(typeOfAnimal, RandomNumber.get(maxCountsOfAnimal.get(typeOfAnimal)));
        sectorFilling(typeOfAnimal, x, y, currentCountsOfAnimal.get(typeOfAnimal), World.populations);
    }

    public void sectorFilling(Fauna typeOfAnimal, int x, int y, int count, HashMap<Fauna, ArrayList<Animal>> population) {
        HashMap<Fauna, ArrayList<Animal>> populations = population;
        for (int i = 0; i < count; i++) {
            switch (typeOfAnimal) {
                case WOLF -> populations.get(typeOfAnimal).add(new Wolf(x, y));
                case BEAR -> populations.get(typeOfAnimal).add(new Bear(x, y));
                case BOA -> populations.get(typeOfAnimal).add(new Boa(x, y));
                case EAGLE -> populations.get(typeOfAnimal).add(new Eagle(x, y));
                case FOX -> populations.get(typeOfAnimal).add(new Fox(x, y));
                case BOAR -> populations.get(typeOfAnimal).add(new Boar(x, y));
                case BUFFALO -> populations.get(typeOfAnimal).add(new Buffalo(x, y));
                case CATERPILLAR -> populations.get(typeOfAnimal).add(new Caterpillar(x, y));
                case DEER -> populations.get(typeOfAnimal).add(new Deer(x, y));
                case DUCK -> populations.get(typeOfAnimal).add(new Duck(x, y));
                case GOAT -> populations.get(typeOfAnimal).add(new Goat(x, y));
                case HORSE -> populations.get(typeOfAnimal).add(new Horse(x, y));
                case MOUSE -> populations.get(typeOfAnimal).add(new Mouse(x, y));
                case RABBIT -> populations.get(typeOfAnimal).add(new Rabbit(x, y));
                case SHEEP -> populations.get(typeOfAnimal).add(new Sheep(x, y));
            }
        }
    }

    public boolean checkFreeSpace(Fauna typeOfAnimal) {
        return currentCountsOfAnimal.get(typeOfAnimal) < maxCountsOfAnimal.get(typeOfAnimal);
    }

    public void changeCountOfAnimal(Fauna typeOfAnimal, int different) {
        currentCountsOfAnimal.
                put(typeOfAnimal, currentCountsOfAnimal.get(typeOfAnimal) + different);
    }

    public Fauna getAnimalAbleToEat(HashMap<Fauna, Integer> chanceToCatch) {
        var faunaList = World.populations.keySet().stream().
                filter(type -> chanceToCatch.containsKey(type) && (currentCountsOfAnimal.get(type) > 0)).toList();
        if (faunaList.size() == 0) {
            return null;
        }
        int indexTypeOfAnimal = RandomNumber.get(faunaList.size());
        return faunaList.get(indexTypeOfAnimal);
    }
}
