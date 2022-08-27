package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

import java.util.HashMap;

public class Mouse extends Herbivorous {
    private double currentSatiety = 0.01;

    public Mouse(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmoji() {
        return "\uD83D\uDC01";
    }

    @Override
    public HashMap<Fauna, Integer> getChanceToCatch() {
        HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
            put(Fauna.CATERPILLAR, 90);
        }};
        return chanceToCatch;
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.MOUSE;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public double getWeight() {
        return 0.05;
    }

    @Override
    public double getMaxSatiety() {
        return 0.01;
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
