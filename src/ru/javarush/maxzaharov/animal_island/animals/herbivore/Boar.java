package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

import java.util.HashMap;

public class Boar extends Herbivorous {
    private double currentSatiety = 50;

    public Boar(int x, int y) {
        super(x, y);
    }

    @Override
    public HashMap<Fauna, Integer> getChanceToCatch() {
        HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
            put(Fauna.MOUSE, 50);
            put(Fauna.CATERPILLAR, 90);
        }};
        return chanceToCatch;
    }

    @Override
    public String getEmoji() {
        return "\uD83D\uDC17";
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.BOAR;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public double getWeight() {
        return 400;
    }

    @Override
    public double getMaxSatiety() {
        return 50;
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
