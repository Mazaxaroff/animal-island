package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

public class Horse extends Herbivorous {
    private int speed = 4;
    private int maxAnimalThisTypeOnTheField = 20;
    private double weight = 400;
    private double maxSatiety = 60;
    private double currentSatiety = 60;

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
