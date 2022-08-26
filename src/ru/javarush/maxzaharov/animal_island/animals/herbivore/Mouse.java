package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

import java.util.HashMap;

public class Mouse extends Herbivorous {
    private int speed = 1;
    private double weight = 0.05;
    private double maxSatiety = 0.01;
    private double currentSatiety = 0.01;
    private String emoji = "\uD83D\uDC01";
    Fauna typeOfAnimal = Fauna.MOUSE;
    HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
        put(Fauna.CATERPILLAR, 90);
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

    public Mouse(int x, int y) {
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
