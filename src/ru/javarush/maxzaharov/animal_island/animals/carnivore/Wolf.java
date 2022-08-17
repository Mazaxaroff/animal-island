package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

public class Wolf extends Carnivorous {
    private int speed = 3;
    private int maxAnimalThisTypeOnTheField = 30;
    private double weight = 50;
    private double maxSatiety = 8;
    private double currentSatiety = 8;

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

