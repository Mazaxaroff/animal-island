package ru.javarush.maxzaharov.animal_island;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static int get(int border){
           return ThreadLocalRandom.current().nextInt(0, border);
    }
}
