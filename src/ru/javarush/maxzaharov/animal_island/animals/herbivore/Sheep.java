package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

public class Sheep extends Herbivorous {
    private double currentSatiety = 15;

    public Sheep(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmoji() {
        return "\uD83D\uDC11";
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.SHEEP;
    }

    @Override
    public int getSpeed() {
        return 3;
    }

    @Override
    public double getWeight() {
        return 70;
    }

    @Override
    public double getMaxSatiety() {
        return 15;
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
