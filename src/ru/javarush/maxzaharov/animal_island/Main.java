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

        for (int i = 0; i < island.length - 1; i++) {
            for (int j = 0; j < island[i].length - 1; j++) {
                for (BasicUnit animal : island[i][j]) {
                    if (island[i][j].contains(animal)) {
                        island[i][j + 1].add(animal);
                        island[i][j].remove(animal);
                        break;
                    }
                    break;
                }
                break;
            }
        }

         Arrays.stream(island).map(Arrays::toString).forEach(System.out::println);
    }
}
