package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

public class Wolf extends Carnivorous {
    private int speed = 3;
    public static int MAX_ANIMAL_THIS_TYPE_ON_THE_FIELD = 30;
    private double weight = 50;
    private double maxSatiety = 8;
    private double currentSatiety = 8;

    public Wolf(int x, int y, Sector sector) {
        super(x, y);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("А еще я волк!");
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
        return MAX_ANIMAL_THIS_TYPE_ON_THE_FIELD;
    }

    @Override
    public void setMaxAnimalThisTypeOnTheField(int maxAnimalThisTypeOnTheField) {
        this.MAX_ANIMAL_THIS_TYPE_ON_THE_FIELD = maxAnimalThisTypeOnTheField;
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

