package ru.javarush.maxzaharov.animal_island.actions.move;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.BasicUnit;

import java.util.ArrayList;

public class Move {

    public static void stepRight(ArrayList<BasicUnit>[][] island) {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length - 1; j++) {
                for (BasicUnit animal : island[i][j]) {
                    if (animal instanceof Animal) {
                        if (((Animal) animal).isCanMove()) {
                            if (island[i][j].contains(animal)) {
                                island[i][j + 1].add(animal);
                                island[i][j].remove(animal);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void stepLeft(ArrayList<BasicUnit>[][] island) {
        for (int i = 0; i < island.length; i++) {
            for (int j = 1; j < island[i].length; j++) {
                for (BasicUnit animal : island[i][j]) {
                    if (animal instanceof Animal) {
                        if (((Animal) animal).isCanMove()) {
                            if (island[i][j].contains(animal)) {
                                island[i][j - 1].add(animal);
                                island[i][j].remove(animal);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void stepDown(ArrayList<BasicUnit>[][] island) {
        for (int i = 0; i < island.length - 1; i++) {
            for (int j = 0; j < island[i].length; j++) {
                for (BasicUnit animal : island[i][j]) {
                    if (animal instanceof Animal) {
                        if (((Animal) animal).isCanMove()) {
                            if (island[i][j].contains(animal)) {
                                island[i + 1][j].add(animal);
                                island[i][j].remove(animal);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void stepUp(ArrayList<BasicUnit>[][] island) {
        for (int i = 1; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                for (BasicUnit animal : island[i][j]) {
                    if (animal instanceof Animal) {
                        if (((Animal) animal).isCanMove()) {
                            if (island[i][j].contains(animal)) {
                                island[i - 1][j].add(animal);
                                island[i][j].remove(animal);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
