package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

import java.util.HashMap;

public class Eagle extends Carnivorous {
    private int speed = 3;
    private double weight = 6;
    private double maxSatiety = 1;
    private double currentSatiety = 1;
    private String emoji = "\uD83E\uDD85";
    Fauna typeOfAnimal = Fauna.EAGLE;
    HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
        put(Fauna.FOX, 10);
        put(Fauna.RABBIT, 90);
        put(Fauna.MOUSE, 90);
        put(Fauna.DUCK, 80);
    }};

    public Eagle(int x, int y) {
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
