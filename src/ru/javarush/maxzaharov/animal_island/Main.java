package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Island;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.island.World;
import ru.javarush.maxzaharov.animal_island.life_cycle.LifeCycle;
import ru.javarush.maxzaharov.animal_island.services.Counters;
import ru.javarush.maxzaharov.animal_island.services.Dialog;
import ru.javarush.maxzaharov.animal_island.services.RandomNumber;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new World();
        Sector[][] island = Island.create();
        Sector firstSector = island[0][0];


        Dialog.hello();
        Dialog.printCountOfAllAnimal();
        Dialog.printCountOfAllPlants(island);
        LifeCycle.hungerForAll(island);
        LifeCycle.eatForAll(island);
        World.createCemetery();
        LifeCycle.deleteTheCorpses();
        Dialog.printCountOfAllCorpses();
        Dialog.printCountOfAllAnimal();
        Dialog.printCountOfAllPlants(island);

//        System.out.println("В секторе " + firstSector.getX() + " " + firstSector.getY() + " " +
//                firstSector.currentCountOfPlants + " травы");


    }
}

