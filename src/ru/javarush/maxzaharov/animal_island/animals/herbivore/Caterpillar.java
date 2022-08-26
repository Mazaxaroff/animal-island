package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

public class Caterpillar extends Herbivorous {
    private int speed = 0;
    private double weight = 0.01;
    private double maxSatiety = 0;
    private double currentSatiety = 0;
    private String emoji = "\uD83D\uDC1B";
    Fauna typeOfAnimal = Fauna.CATERPILLAR;

    @Override
    public String getEmoji() {
        return emoji;
    }

       @Override
    public Fauna getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public Caterpillar(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(Sector[][] island) {
        super.move(island);
    }

    @Override
    public void hunger(Sector[][] island) {
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
