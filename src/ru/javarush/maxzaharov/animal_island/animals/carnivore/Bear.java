package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

import java.util.HashMap;

public class Bear extends Carnivorous {
    private int speed = 2;
    private double weight = 500;
    private double maxSatiety = 80;
    private double currentSatiety = 80;
    private String emoji = "\uD83D\uDC3B";
    Fauna typeOfAnimal = Fauna.BEAR;
    HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
        put(Fauna.BOA, 80);
        put(Fauna.HORSE, 40);
        put(Fauna.DEER, 80);
        put(Fauna.RABBIT, 80);
        put(Fauna.MOUSE, 90);
        put(Fauna.GOAT, 70);
        put(Fauna.SHEEP, 70);
        put(Fauna.BOAR, 50);
        put(Fauna.BUFFALO, 20);
        put(Fauna.DUCK, 10);
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
