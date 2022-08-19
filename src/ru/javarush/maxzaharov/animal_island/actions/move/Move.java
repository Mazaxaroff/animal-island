package ru.javarush.maxzaharov.animal_island.actions.move;

import ru.javarush.maxzaharov.animal_island.RandomNumber;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.BasicUnit;
import ru.javarush.maxzaharov.animal_island.island.Island;

import java.util.ArrayList;

public class Move {
    private static final int NUMBER_OF_DIRECTION = 4;


    public static void stepRight(ArrayList<BasicUnit>[][] island) {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length - 1; j++) {
                for (BasicUnit animal : island[i][j]) {
                    if (animal instanceof Animal) {
                        if (((Animal) animal).getSpeed() != 0) {
                            if (island[i][j].contains(animal)) {
                                ((Animal) animal).setSpeed(((Animal) animal).getSpeed() - 1);
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
            for (int j = 0; j < island[i].length; j++) {
                for (BasicUnit animal : island[i][j]) {
                    if (animal instanceof Animal) {
                        if (((Animal) animal).isCanMove()) {
                            int restOfSteps = ((Animal) animal).getSpeed();

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
                        if (((Animal) animal).getSpeed() != 0) {
                            if (island[i][j].contains(animal)) {
                                ((Animal) animal).setSpeed(((Animal) animal).getSpeed() - 1);
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
