package ru.javarush.maxzaharov.animal_island.animals.abstracts;

public abstract class Animal extends BasicUnit {
    public int weight;
    public int speed;
    public int maxSatiety;
    public int currentSatiety;
    public boolean isCanMultiply;
    public int maxAnimalThisTypeOnTheField;
    public boolean isCanMove;
    public boolean isCanEat;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSatiety() {
        return maxSatiety;
    }

    public void setMaxSatiety(int maxSatiety) {
        this.maxSatiety = maxSatiety;
    }

    public int getCurrentSatiety() {
        return currentSatiety;
    }

    public void setCurrentSatiety(int currentSatiety) {
        this.currentSatiety = currentSatiety;
    }

    public boolean isCanMultiply() {
        return isCanMultiply;
    }

    public void setCanMultiply(boolean canMultiply) {
        isCanMultiply = canMultiply;
    }

    public int getMaxAnimalThisTypeOnTheField() {
        return maxAnimalThisTypeOnTheField;
    }

    public void setMaxAnimalThisTypeOnTheField(int maxAnimalThisTypeOnTheField) {
        this.maxAnimalThisTypeOnTheField = maxAnimalThisTypeOnTheField;
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
}


