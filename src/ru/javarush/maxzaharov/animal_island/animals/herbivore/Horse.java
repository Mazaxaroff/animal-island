package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;


public class Horse extends Herbivorous {
    private double currentSatiety = 60;

    public Horse(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmoji() {
        return "\uD83D\uDC0E";
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.HORSE;
    }

    @Override
    public int getSpeed() {
        return 4;
    }

    @Override
    public double getWeight() {
        return 400;
    }

    @Override
    public double getMaxSatiety() {
        return 60;
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
