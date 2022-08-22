package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.FloraAndFauna;
import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

import java.util.HashMap;

public class Boa extends Carnivorous {
    private int speed = 1;
    private double weight = 15;
    private double maxSatiety = 3;
    private double currentSatiety = 3;
    private String emoji = "\uD83D\uDC0D";
    FloraAndFauna typeOfAnimal = FloraAndFauna.BOA;
    HashMap<FloraAndFauna, Integer> chanceToCatch = new HashMap<>() {{
        put(FloraAndFauna.FOX, 15);
        put(FloraAndFauna.RABBIT, 20);
        put(FloraAndFauna.MOUSE, 40);
        put(FloraAndFauna.DUCK, 10);
    }};

    public Boa(int x, int y) {
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
