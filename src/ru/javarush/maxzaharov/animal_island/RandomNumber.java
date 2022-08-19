package ru.javarush.maxzaharov.animal_island;

import java.util.Random;

public class RandomNumber {
    public static int get(int border){
        Random random = new Random();
        return random.nextInt(border);
    }
}
