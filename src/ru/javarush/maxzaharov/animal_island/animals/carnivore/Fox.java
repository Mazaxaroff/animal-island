package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.FloraAndFauna;
import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

import java.util.HashMap;

public class Fox extends Carnivorous {
    private int speed = 2;
    private double weight = 8;
    private double maxSatiety = 2;
    private double currentSatiety = 2;
    private String emoji = "\uD83E\uDD8A";
    FloraAndFauna typeOfAnimal = FloraAndFauna.FOX;
    HashMap<FloraAndFauna, Integer> chanceToCatch = new HashMap<>() {{
        put(FloraAndFauna.RABBIT, 70);
        put(FloraAndFauna.MOUSE, 90);
        put(FloraAndFauna.DUCK, 60);
        put(FloraAndFauna.CATERPILLAR, 40);
    }};

    public Fox(int x, int y) {
        super(x, y);
    }

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
