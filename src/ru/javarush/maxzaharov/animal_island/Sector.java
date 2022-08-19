package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Wolf;
import ru.javarush.maxzaharov.animal_island.plants.Plant;

import java.util.ArrayList;

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

    public static int getCurrentCountOfWolves() {
        return currentCountOfWolves;
    }

    public static void setCurrentCountOfWolves(int currentCountOfWolves) {
        Sector.currentCountOfWolves = currentCountOfWolves;
    }

    public static int getCurrentCountOfFoxes() {
        return currentCountOfFoxes;
    }

    public static void setCurrentCountOfFoxes(int currentCountOfFoxes) {
        Sector.currentCountOfFoxes = currentCountOfFoxes;
    }

    public static int getCurrentCountOfEagles() {
        return currentCountOfEagles;
    }

    public static void setCurrentCountOfEagles(int currentCountOfEagles) {
        Sector.currentCountOfEagles = currentCountOfEagles;
    }

    public static int getCurrentCountOfBoas() {
        return currentCountOfBoas;
    }

    public static void setCurrentCountOfBoas(int currentCountOfBoas) {
        Sector.currentCountOfBoas = currentCountOfBoas;
    }

    public static int getCurrentCountOfBears() {
        return currentCountOfBears;
    }

    public static void setCurrentCountOfBears(int currentCountOfBears) {
        Sector.currentCountOfBears = currentCountOfBears;
    }

    public static int getCurrentCountOfBoars() {
        return currentCountOfBoars;
    }

    public static void setCurrentCountOfBoars(int currentCountOfBoars) {
        Sector.currentCountOfBoars = currentCountOfBoars;
    }

    public static int getCurrentCountOfBuffaloes() {
        return currentCountOfBuffaloes;
    }

    public static void setCurrentCountOfBuffaloes(int currentCountOfBuffaloes) {
        Sector.currentCountOfBuffaloes = currentCountOfBuffaloes;
    }

    public static int getCurrentCountOfCaterpillars() {
        return currentCountOfCaterpillars;
    }

    public static void setCurrentCountOfCaterpillars(int currentCountOfCaterpillars) {
        Sector.currentCountOfCaterpillars = currentCountOfCaterpillars;
    }

    public static int getCurrentCountOfDeer() {
        return currentCountOfDeer;
    }

    public static void setCurrentCountOfDeer(int currentCountOfDeer) {
        Sector.currentCountOfDeer = currentCountOfDeer;
    }

    public static int getCurrentCountOfDucks() {
        return currentCountOfDucks;
    }

    public static void setCurrentCountOfDucks(int currentCountOfDucks) {
        Sector.currentCountOfDucks = currentCountOfDucks;
    }

    public static int getCurrentCountOfGoats() {
        return currentCountOfGoats;
    }

    public static void setCurrentCountOfGoats(int currentCountOfGoats) {
        Sector.currentCountOfGoats = currentCountOfGoats;
    }

    public static int getCurrentCountOfHorses() {
        return currentCountOfHorses;
    }

    public static void setCurrentCountOfHorses(int currentCountOfHorses) {
        Sector.currentCountOfHorses = currentCountOfHorses;
    }

    public static int getCurrentCountOfMouses() {
        return currentCountOfMouses;
    }

    public static void setCurrentCountOfMouses(int currentCountOfMouses) {
        Sector.currentCountOfMouses = currentCountOfMouses;
    }

    public static int getCurrentCountOfRabbits() {
        return currentCountOfRabbits;
    }

    public static void setCurrentCountOfRabbits(int currentCountOfRabbits) {
        Sector.currentCountOfRabbits = currentCountOfRabbits;
    }

    public static int getCurrentCountOfSheep() {
        return currentCountOfSheep;
    }

    public static void setCurrentCountOfSheep(int currentCountOfSheep) {
        Sector.currentCountOfSheep = currentCountOfSheep;
    }

    public static int getCurrentCountOfPlants() {
        return currentCountOfPlants;
    }

    public static void setCurrentCountOfPlants(int currentCountOfPlants) {
        Sector.currentCountOfPlants = currentCountOfPlants;
    }

    ArrayList<Plant> plants;
    ArrayList<Animal> animals;

    public Sector(int x, int y, ArrayList<Wolf> wolves) {
        this.x = x;
        this.y = y;
        createPlant(this);
        CreateAnimal(this, wolves);

    }

    private void createPlant(Sector sector) {
        currentCountOfPlants=RandomNumber.get(MAX_COUNT_OF_PLANTS);
        }

    private void CreateAnimal(Sector sector, ArrayList<Wolf> wolves) {
        this.currentCountOfWolves = RandomNumber.get(MAX_COUNT_OF_WOLVES);
        for (int i = 0; i < this.currentCountOfWolves; i++) {
            wolves.add(new Wolf(this));
        }
    }
}
