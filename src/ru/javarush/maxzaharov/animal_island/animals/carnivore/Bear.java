package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.FloraAndFauna;
import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

import java.util.HashMap;

public class Bear extends Carnivorous {
    private int speed = 2;
    private double weight = 500;
    private double maxSatiety = 80;
    private double currentSatiety = 80;
    private String emoji = "\uD83D\uDC3B";
    FloraAndFauna typeOfAnimal = FloraAndFauna.BEAR;
    HashMap<FloraAndFauna, Integer> chanceToCatch = new HashMap<>() {{
        put(FloraAndFauna.BOA, 80);
        put(FloraAndFauna.HORSE, 40);
        put(FloraAndFauna.DEER, 80);
        put(FloraAndFauna.RABBIT, 80);
        put(FloraAndFauna.MOUSE, 90);
        put(FloraAndFauna.GOAT, 70);
        put(FloraAndFauna.SHEEP, 70);
        put(FloraAndFauna.BOAR, 50);
        put(FloraAndFauna.BUFFALO, 20);
        put(FloraAndFauna.DUCK, 10);
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

    public Bear(int x, int y) {
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
