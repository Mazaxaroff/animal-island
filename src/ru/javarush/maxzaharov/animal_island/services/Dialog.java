package ru.javarush.maxzaharov.animal_island.services;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.World;

public class Dialog {
    public static void hello() {
        System.out.println("Добро пожаловать в симуляцию острова с животными!");
    }

    public static void printCountOfAllAnimal() {
        System.out.println("На всем острове Штопаный лапоть проживает:");
        Counters.currentCountsOfAllAnimal();
    }
    public static void printCountOfAllCorpses(){
        System.out.println("На всем острове Штопаный лапоть за день погибло:");
        Counters.currentCountsOfAllCorpses();
    }
}
