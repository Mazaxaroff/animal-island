package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Wolf;
import ru.javarush.maxzaharov.animal_island.animals.herbivore.Rabbit;
import ru.javarush.maxzaharov.animal_island.plants.Plant;

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

    HashMap<String, Integer> maxCountsOfAnimal = new HashMap<>() {{
        put(Fauna.WOLF.toString(), MAX_COUNT_OF_WOLVES);
        put(Fauna.FOX.toString(), MAX_COUNT_OF_FOXES);
        put(Fauna.EAGLE.toString(), MAX_COUNT_OF_EAGLES);
        put(Fauna.BOA.toString(), MAX_COUNT_OF_BOAS);
        put(Fauna.BEAR.toString(), MAX_COUNT_OF_BEARS);
        put(Fauna.BOAR.toString(), MAX_COUNT_OF_BOARS);
        put(Fauna.BUFFALO.toString(), MAX_COUNT_OF_BUFFALOES);
        put(Fauna.CATERPILLAR.toString(), MAX_COUNT_OF_CATERPILLARS);
        put(Fauna.DEER.toString(), MAX_COUNT_OF_DEER);
        put(Fauna.DUCK.toString(), MAX_COUNT_OF_DUCKS);
        put(Fauna.GOAT.toString(), MAX_COUNT_OF_GOATS);
        put(Fauna.HORSE.toString(), MAX_COUNT_OF_HORSES);
        put(Fauna.MOUSE.toString(), MAX_COUNT_OF_MOUSES);
        put(Fauna.RABBIT.toString(), MAX_COUNT_OF_RABBITS);
        put(Fauna.SHEEP.toString(), MAX_COUNT_OF_SHEEP);
    }};
    HashMap<String, Integer> currentCountsOfAnimal = new HashMap<>();

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



    public Sector(int x, int y, HashMap<String, ArrayList<Animal>> populations) {
        this.x = x;
        this.y = y;
        createPlant(this);
        CreateAnimal(x, y, Fauna.WOLF.toString(), populations);
        CreateAnimal(x, y, Fauna.RABBIT.toString(), populations);

    }

    private void createPlant(Sector sector) {
        currentCountOfPlants = RandomNumber.get(MAX_COUNT_OF_PLANTS);
    }

    private void CreateAnimal(int x, int y, String typeOfAnimal, HashMap<String, ArrayList<Animal>> populations) {
        currentCountsOfAnimal.put(typeOfAnimal, RandomNumber.get(maxCountsOfAnimal.get(typeOfAnimal)));
        for (int i = 0; i < currentCountsOfAnimal.get(typeOfAnimal); i++) {
            if (typeOfAnimal.equals(Fauna.WOLF.toString())) {
                populations.get(typeOfAnimal).add(new Wolf(x, y));
            }
            if (typeOfAnimal.equals(Fauna.RABBIT.toString())) {
                populations.get(typeOfAnimal).add(new Rabbit(x, y));
            }
        }
    }

    public boolean checkFreeSpace(String typeOfAnimal) {
        return currentCountsOfAnimal.get(typeOfAnimal) < maxCountsOfAnimal.get(typeOfAnimal);
    }

    public void changeCountOfAnimal(String typeOfAnimal, int different) {
        currentCountsOfAnimal.
                put(typeOfAnimal, currentCountsOfAnimal.get(typeOfAnimal) + different);
    }
}
