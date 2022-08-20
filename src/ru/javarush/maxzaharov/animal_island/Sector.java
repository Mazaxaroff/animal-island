package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Wolf;
import ru.javarush.maxzaharov.animal_island.plants.Plant;

import java.util.ArrayList;
import java.util.HashMap;

public class Sector {
    int x;
    int y;
    public static final int MAX_COUNT_OF_WOLVES = 30;
    public static int currentCountOfWolves;
    public static final int MAX_COUNT_OF_FOXES = 30;
    public static int currentCountOfFoxes;
    public static final int MAX_COUNT_OF_EAGLES = 20;
    public static int currentCountOfEagles;
    public static final int MAX_COUNT_OF_BOAS = 30;
    public static int currentCountOfBoas;
    public static final int MAX_COUNT_OF_BEARS = 5;
    public static int currentCountOfBears;
    public static final int MAX_COUNT_OF_BOARS = 5;
    public static int currentCountOfBoars;
    public static final int MAX_COUNT_OF_BUFFALOES = 10;
    public static int currentCountOfBuffaloes;
    public static final int MAX_COUNT_OF_CATERPILLARS = 1000;
    public static int currentCountOfCaterpillars;
    public static final int MAX_COUNT_OF_DEER = 20;
    public static int currentCountOfDeer;
    public static final int MAX_COUNT_OF_DUCKS = 200;
    public static int currentCountOfDucks;
    public static final int MAX_COUNT_OF_GOATS = 140;
    public static int currentCountOfGoats;
    public static final int MAX_COUNT_OF_HORSES = 20;
    public static int currentCountOfHorses;
    public static final int MAX_COUNT_OF_MOUSES = 500;
    public static int currentCountOfMouses;
    public static final int MAX_COUNT_OF_RABBITS = 150;
    public static int currentCountOfRabbits;
    public static final int MAX_COUNT_OF_SHEEP = 140;
    public static int currentCountOfSheep;
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
    HashMap<String, Integer> currentCountsOfAnimal = new HashMap<>() {{
        put(Fauna.WOLF.toString(), currentCountOfWolves);
        put(Fauna.FOX.toString(), currentCountOfFoxes);
        put(Fauna.EAGLE.toString(), currentCountOfEagles);
        put(Fauna.BOA.toString(), currentCountOfBoas);
        put(Fauna.BEAR.toString(), currentCountOfBears);
        put(Fauna.BOAR.toString(), currentCountOfBoars);
        put(Fauna.BUFFALO.toString(), currentCountOfBuffaloes);
        put(Fauna.CATERPILLAR.toString(), currentCountOfCaterpillars);
        put(Fauna.DEER.toString(), currentCountOfDeer);
        put(Fauna.DUCK.toString(), currentCountOfDucks);
        put(Fauna.GOAT.toString(), currentCountOfGoats);
        put(Fauna.HORSE.toString(), currentCountOfHorses);
        put(Fauna.MOUSE.toString(), currentCountOfMouses);
        put(Fauna.RABBIT.toString(), currentCountOfRabbits);
        put(Fauna.SHEEP.toString(), currentCountOfSheep);
    }};

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

    ArrayList<Plant> plants;
    ArrayList<Animal> animals;

    public Sector(int x, int y, ArrayList<Wolf> wolves) {
        this.x = x;
        this.y = y;
        createPlant(this);
        CreateAnimal(x, y, wolves);

    }

    private void createPlant(Sector sector) {
        currentCountOfPlants = RandomNumber.get(MAX_COUNT_OF_PLANTS);
    }

    private void CreateAnimal(int x, int y, ArrayList<Wolf> wolves) {
        this.currentCountOfWolves = RandomNumber.get(MAX_COUNT_OF_WOLVES);
        for (int i = 0; i < this.currentCountOfWolves; i++) {
            wolves.add(new Wolf(x, y));
        }
    }

    public boolean checkFreeSpace(String typeOfAnimal) {
        return currentCountsOfAnimal.get(typeOfAnimal) < maxCountsOfAnimal.get(typeOfAnimal);
    }
}
