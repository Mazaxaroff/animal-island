package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

import java.util.HashMap;

public class Wolf extends Carnivorous {
    private double currentSatiety = 8;
    private int speed = 3;
    private double weight = 50;
    private double maxSatiety = 8;
    private String emoji = "\uD83D\uDC3A";
    Fauna typeOfAnimal = Fauna.WOLF;
    HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
        put(Fauna.HORSE, 10);
        put(Fauna.DEER, 15);
        put(Fauna.RABBIT, 60);
        put(Fauna.MOUSE, 80);
        put(Fauna.GOAT, 60);
        put(Fauna.SHEEP, 70);
        put(Fauna.BOAR, 15);
        put(Fauna.BUFFALO, 10);
        put(Fauna.DUCK, 40);
    }};


    public Wolf(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmoji() {
        return "\uD83D\uDC3A";
    }

    @Override
    public HashMap<Fauna, Integer> getChanceToCatch() {
        HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
            put(Fauna.HORSE, 10);
            put(Fauna.DEER, 15);
            put(Fauna.RABBIT, 60);
            put(Fauna.MOUSE, 80);
            put(Fauna.GOAT, 60);
            put(Fauna.SHEEP, 70);
            put(Fauna.BOAR, 15);
            put(Fauna.BUFFALO, 10);
            put(Fauna.DUCK, 40);
        }};
        return chanceToCatch;
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.WOLF;
    }

    @Override
    public int getSpeed() {
        return 3;
    }

    @Override
    public double getWeight() {
        return 50;
    }

    @Override
    public double getMaxSatiety() {
        return 8;
    }

    @Override
    public double getCurrentSatiety() {
        return currentSatiety;
    }

    @Override
    public void setCurrentSatiety(double currentSatiety) {
        this.currentSatiety = currentSatiety;
    }

    @Override
    public void move(Sector[][] island) {
        super.move(island);
    }

}
