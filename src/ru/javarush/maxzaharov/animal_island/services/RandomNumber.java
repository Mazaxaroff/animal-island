package ru.javarush.maxzaharov.animal_island.services;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static final int HUNDRED_PERCENT = 100;
    public static final int WAY_OF_EATING = 2;
    public static int get(int border){
           return ThreadLocalRandom.current().nextInt(0, border);
    }
}
