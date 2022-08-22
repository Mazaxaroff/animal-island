package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.FloraAndFauna;
import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

import java.util.HashMap;

public class Wolf extends Carnivorous {
    private int speed = 3;
    private double weight = 50;
    private double maxSatiety = 8;
    private double currentSatiety = 8;
    private String emoji = "\uD83D\uDC3A";
    FloraAndFauna typeOfAnimal = FloraAndFauna.WOLF;
    HashMap<FloraAndFauna, Integer> chanceToCatch = new HashMap<>() {{
        put(FloraAndFauna.HORSE, 10);
        put(FloraAndFauna.DEER, 15);
        put(FloraAndFauna.RABBIT, 60);
        put(FloraAndFauna.MOUSE, 80);
        put(FloraAndFauna.GOAT, 60);
        put(FloraAndFauna.SHEEP, 70);
        put(FloraAndFauna.BOAR, 15);
        put(FloraAndFauna.BUFFALO, 10);
        put(FloraAndFauna.DUCK, 40);
    }};

    public Wolf(int x, int y) {
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
