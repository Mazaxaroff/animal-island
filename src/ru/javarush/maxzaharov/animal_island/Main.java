package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.BasicUnit;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Wolf;
import ru.javarush.maxzaharov.animal_island.island.Island;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ArrayList<BasicUnit>[][] island = Island.fill(Island.createIsland());
        Arrays.stream(island).map(Arrays::toString).forEach(System.out::println);

        System.out.println();

        Animal wolf = new Wolf();

    }
}
