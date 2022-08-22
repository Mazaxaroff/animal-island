package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.FloraAndFauna;
import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

import java.util.HashMap;

public class Deer extends Herbivorous {
    private int speed = 4;
    private double weight = 300;
    private double maxSatiety = 50;
    private double currentSatiety = 50;
    private String emoji = "\uD83E\uDD8C";
    FloraAndFauna typeOfAnimal = FloraAndFauna.DEER;
    HashMap<FloraAndFauna, Integer> chanceToCatch = new HashMap<>() {{
        //put(FloraAndFauna.PLANT,100);
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

    public Deer(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(Sector[][] island) {
        super.move(island);
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
