package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.Fauna;
import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

import java.util.HashMap;

public class Duck extends Herbivorous {
    private int speed = 4;
    private double weight = 1;
    private double maxSatiety = 0.15;
    private double currentSatiety = 0.15;
    private String emoji = "\uD83E\uDD86";
    Fauna typeOfAnimal = Fauna.DUCK;
    HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
        put(Fauna.CATERPILLAR, 90);
        // put(FloraAndFauna.PLANT,100);
    }};

    @Override
    public String getEmoji() {
        return emoji;
    }

    @Override
    public HashMap<Fauna, Integer> getChanceToCatch() {
        return chanceToCatch;
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return typeOfAnimal;
    }

    @Override
    public void move(Sector[][] island) {
        super.move(island);
    }

    public Duck(int x, int y) {
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
