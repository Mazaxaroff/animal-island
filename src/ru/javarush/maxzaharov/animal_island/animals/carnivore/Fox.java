package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

import java.util.HashMap;

public class Fox extends Carnivorous {
    private double currentSatiety = 2;
    private int speed = 2;
    private int maxChild = 4;
    private double weight = 8;
    private double maxSatiety = 2;
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
        return "\uD83E\uDD8A";
    }

    @Override
    public HashMap<Fauna, Integer> getChanceToCatch() {
        HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
            put(Fauna.RABBIT, 70);
            put(Fauna.MOUSE, 90);
            put(Fauna.DUCK, 60);
            put(Fauna.CATERPILLAR, 40);
        }};
        return chanceToCatch;
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.FOX;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public int getMaxChild() {
        return 4;
    }

    @Override
    public double getWeight() {
        return 8;
    }

    @Override
    public double getMaxSatiety() {
        return 2;
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
