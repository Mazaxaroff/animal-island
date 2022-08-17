package ru.javarush.maxzaharov.animal_island.animals.abstracts;

public abstract class Animal extends BasicUnit {
    private int speed;
    private int maxAnimalThisTypeOnTheField;
    private double weight;
    private double maxSatiety;
    private double currentSatiety;
    private boolean isCanMultiply = true;
    private boolean isCanMove = true;
    private boolean isCanEat = true;
    private boolean isAlive = true;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxAnimalThisTypeOnTheField() {
        return maxAnimalThisTypeOnTheField;
    }

    public void setMaxAnimalThisTypeOnTheField(int maxAnimalThisTypeOnTheField) {
        this.maxAnimalThisTypeOnTheField = maxAnimalThisTypeOnTheField;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }

    public void setMaxSatiety(double maxSatiety) {
        this.maxSatiety = maxSatiety;
    }

    public double getCurrentSatiety() {
        return currentSatiety;
    }

    public void setCurrentSatiety(double currentSatiety) {
        this.currentSatiety = currentSatiety;
    }

    public boolean isCanMultiply() {
        return isCanMultiply;
    }

    public void setCanMultiply(boolean canMultiply) {
        isCanMultiply = canMultiply;
    }

    public boolean isCanMove() {
        return isCanMove;
    }

    public void setCanMove(boolean canMove) {
        isCanMove = canMove;
    }

    public boolean isCanEat() {
        return isCanEat;
    }

    public void setCanEat(boolean canEat) {
        isCanEat = canEat;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}


