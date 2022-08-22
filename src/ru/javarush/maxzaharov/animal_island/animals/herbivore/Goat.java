package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.FloraAndFauna;
import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

import java.util.HashMap;


public class Goat extends Herbivorous {
    private int speed = 3;
    private double weight = 60;
    private double maxSatiety = 10;
    private double currentSatiety = 10;
    private String emoji = "\uD83D\uDC10";
    FloraAndFauna typeOfAnimal = FloraAndFauna.GOAT;
    HashMap<FloraAndFauna, Integer> chanceToCatch = new HashMap<>() {{
        // put(FloraAndFauna.PLANT,100);
    }};

    @Override
    public String getEmoji() {
        return emoji;
    }

    @Override
    public HashMap<FloraAndFauna, Integer> getChanceToCatch() {
        return chanceToCatch;
    }

    @Override
    public FloraAndFauna getTypeOfAnimal() {
        return typeOfAnimal;
    }

    @Override
    public void move(Sector[][] island) {
        super.move(island);
    }

    public Goat(int x, int y) {
        super(x, y);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getMaxSatiety() {
        return maxSatiety;
    }

    @Override
    public double getCurrentSatiety() {
        return currentSatiety;
    }

    @Override
    public void setCurrentSatiety(double currentSatiety) {
        this.currentSatiety = currentSatiety;
    }
}
