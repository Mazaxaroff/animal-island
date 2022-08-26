package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

import java.util.HashMap;

public class Fox extends Carnivorous {
    private int speed = 2;
    private double weight = 8;
    private double maxSatiety = 2;
    private double currentSatiety = 2;
    private String emoji = "\uD83E\uDD8A";
    Fauna typeOfAnimal = Fauna.FOX;
    HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
        put(Fauna.RABBIT, 70);
        put(Fauna.MOUSE, 90);
        put(Fauna.DUCK, 60);
        put(Fauna.CATERPILLAR, 40);
    }};

    public Fox(int x, int y) {
        super(x, y);
    }

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
