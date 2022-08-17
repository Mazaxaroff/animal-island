package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

public class Caterpillar extends Herbivorous {
    private int speed = 0;
    private int maxAnimalThisTypeOnTheField = 1000;
    private double weight = 0.01;
    private double maxSatiety = 0;
    private double currentSatiety = 0;
}
