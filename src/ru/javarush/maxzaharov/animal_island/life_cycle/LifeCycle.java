package ru.javarush.maxzaharov.animal_island.life_cycle;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.island.World;
import ru.javarush.maxzaharov.animal_island.services.Counters;

public class LifeCycle {
    private static final int COUNT_OF_DAYS = 3;
    public static final double MAX_COUNT_OF_DAYS_WITHOUT_FOOD = 5.0;

    private static void deleteTheCorpses() {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).removeIf(animal -> !animal.isAlive());
        }
    }

    private static void hungerForAll(Sector[][] island) {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).forEach(animal -> animal.hunger(island));
        }
    }

    private static void eatForAll(Sector[][] island) {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).forEach(animal -> animal.eat(island));
        }
    }

    private static void moveForAll(Sector[][] island) {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).forEach(animal -> animal.move(island));
        }
    }

    private static void multiplyForAll(Sector[][] island) {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).forEach(animal -> animal.multiply(island));
        }
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).addAll(World.babiesPopulations.get(typeOfAnimal));

        }
    }

    private static void deleteTheBabies() {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.babiesPopulations.get(typeOfAnimal).removeAll(World.babiesPopulations.get(typeOfAnimal));
        }
    }

    private static void deathStatistic() {
        World.createCemetery();
        deleteTheCorpses();
        printCountOfAllCorpses();
    }

    private static void flagsUpdate() {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).forEach(animal -> animal.setCanMultiply(true));
        }
    }

    private static void hello() {
        System.out.println("Добро пожаловать в симуляцию острова с животными!");
    }

    private static void printCountOfAllAnimal() {
        System.out.println("На всем острове проживает:");
        Counters.currentCountsOfAllAnimal(World.populations);
        System.out.println();
    }

    private static void printCountOfAllCorpses() {
        System.out.println("На всем острове за день погибло:");
        Counters.currentCountsOfAllCorpses();
        System.out.println();
    }

    private static void printCountOfAllPlants(Sector[][] island) {
        System.out.println("На всем острове " + Counters.currentCountOfAllPlants(island) + " травы");
        System.out.println();
    }

    private static void printCountOfAllBabies() {
        System.out.println("На всем острове за день родилось:");
        Counters.currentCountsOfAllAnimal(World.babiesPopulations);
        System.out.println();
    }

    public static void start(Sector[][] island) {
        hello();
        for (int i = 1; i < COUNT_OF_DAYS+1; i++) {
            System.out.println("День " + i);
            printCountOfAllAnimal();
            printCountOfAllPlants(island);
            hungerForAll(island);
            moveForAll(island);
            eatForAll(island);
            deathStatistic();
            flagsUpdate();
            multiplyForAll(island);
            System.out.println();
            printCountOfAllBabies();
            deleteTheBabies();
        }
        System.out.println("В завершении симуляции");
        printCountOfAllAnimal();
    }
}
