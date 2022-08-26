package ru.javarush.maxzaharov.animal_island.plants;


import ru.javarush.maxzaharov.animal_island.animals.abstracts.BasicUnit;


public class Plant extends BasicUnit {
    public static final double WEIGHT = 1;

    public double getWeight() {
        return WEIGHT;
    }


    public Plant(int x, int y) {
        super(x, y);
    }
}
