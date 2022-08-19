package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

public class Buffalo extends Herbivorous {
    private int speed = 3;
    private int maxAnimalThisTypeOnTheField = 10;
    private double weight = 700;
    private double maxSatiety = 100;
    private double currentSatiety = 100;

    public Buffalo(int x, int y) {
        super(x, y);
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getMaxAnimalThisTypeOnTheField() {
        return maxAnimalThisTypeOnTheField;
    }

    @Override
    public void setMaxAnimalThisTypeOnTheField(int maxAnimalThisTypeOnTheField) {
        this.maxAnimalThisTypeOnTheField = maxAnimalThisTypeOnTheField;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getMaxSatiety() {
        return maxSatiety;
    }

    @Override
    public void setMaxSatiety(double maxSatiety) {
        this.maxSatiety = maxSatiety;
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
