package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.*;
import ru.javarush.maxzaharov.animal_island.animals.herbivore.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Sector {
    int x;
    int y;
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
    public static int currentCountOfPlants;

    HashMap<FloraAndFauna, Integer> maxCountsOfAnimal = new HashMap<>() {{
        put(FloraAndFauna.WOLF, MAX_COUNT_OF_WOLVES);
        put(FloraAndFauna.FOX, MAX_COUNT_OF_FOXES);
        put(FloraAndFauna.EAGLE, MAX_COUNT_OF_EAGLES);
        put(FloraAndFauna.BOA, MAX_COUNT_OF_BOAS);
        put(FloraAndFauna.BEAR, MAX_COUNT_OF_BEARS);
        put(FloraAndFauna.BOAR, MAX_COUNT_OF_BOARS);
        put(FloraAndFauna.BUFFALO, MAX_COUNT_OF_BUFFALOES);
        put(FloraAndFauna.CATERPILLAR, MAX_COUNT_OF_CATERPILLARS);
        put(FloraAndFauna.DEER, MAX_COUNT_OF_DEER);
        put(FloraAndFauna.DUCK, MAX_COUNT_OF_DUCKS);
        put(FloraAndFauna.GOAT, MAX_COUNT_OF_GOATS);
        put(FloraAndFauna.HORSE, MAX_COUNT_OF_HORSES);
        put(FloraAndFauna.MOUSE, MAX_COUNT_OF_MOUSES);
        put(FloraAndFauna.RABBIT, MAX_COUNT_OF_RABBITS);
        put(FloraAndFauna.SHEEP, MAX_COUNT_OF_SHEEP);
    }};
    HashMap<FloraAndFauna, Integer> currentCountsOfAnimal = new HashMap<>();

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


    public Sector(int x, int y, HashMap<FloraAndFauna, ArrayList<Animal>> populations) {
        this.x = x;
        this.y = y;
        createPlant(this);
//        CreateAnimal(x, y, Fauna.WOLF, populations);
//        CreateAnimal(x, y, Fauna.RABBIT, populations);
        for (FloraAndFauna animal : FloraAndFauna.values()) {
            CreateAnimal(x, y, animal, populations);

        }
    }

    private void createPlant(Sector sector) {
        currentCountOfPlants = RandomNumber.get(MAX_COUNT_OF_PLANTS);
    }

    private void CreateAnimal(int x, int y, FloraAndFauna typeOfAnimal, HashMap<FloraAndFauna, ArrayList<Animal>> populations) {
        currentCountsOfAnimal.put(typeOfAnimal, RandomNumber.get(maxCountsOfAnimal.get(typeOfAnimal)));
        for (int i = 0; i < currentCountsOfAnimal.get(typeOfAnimal); i++) {
            switch (typeOfAnimal) {
                case WOLF -> populations.get(typeOfAnimal).add(new Wolf(x, y));
//                case BEAR -> populations.get(typeOfAnimal).add(new Bear(x, y));
//                case BOA -> populations.get(typeOfAnimal).add(new Boa(x, y));
//                case EAGLE -> populations.get(typeOfAnimal).add(new Eagle(x, y));
//                case FOX -> populations.get(typeOfAnimal).add(new Fox(x, y));
//                case BOAR -> populations.get(typeOfAnimal).add(new Boar(x, y));
//                case BUFFALO -> populations.get(typeOfAnimal).add(new Buffalo(x, y));
//                case CATERPILLAR -> populations.get(typeOfAnimal).add(new Caterpillar(x, y));
//                case DEER -> populations.get(typeOfAnimal).add(new Deer(x, y));
//                case DUCK -> populations.get(typeOfAnimal).add(new Duck(x, y));
//                case GOAT -> populations.get(typeOfAnimal).add(new Goat(x, y));
//                case HORSE -> populations.get(typeOfAnimal).add(new Horse(x, y));
//                case MOUSE -> populations.get(typeOfAnimal).add(new Mouse(x, y));
                case RABBIT -> populations.get(typeOfAnimal).add(new Rabbit(x, y));
                case SHEEP -> populations.get(typeOfAnimal).add(new Sheep(x, y));
            }
        }
    }

    public boolean checkFreeSpace(FloraAndFauna typeOfAnimal) {
        return currentCountsOfAnimal.get(typeOfAnimal) < maxCountsOfAnimal.get(typeOfAnimal);
    }

    public void changeCountOfAnimal(FloraAndFauna typeOfAnimal, int different) {
        currentCountsOfAnimal.
                put(typeOfAnimal, currentCountsOfAnimal.get(typeOfAnimal) + different);
    }
}
