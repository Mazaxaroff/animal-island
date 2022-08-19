package ru.javarush.maxzaharov.animal_island.animals.abstracts;

import ru.javarush.maxzaharov.animal_island.interfases.Eatable;
import ru.javarush.maxzaharov.animal_island.interfases.Fertile;
import ru.javarush.maxzaharov.animal_island.interfases.Moveable;
import ru.javarush.maxzaharov.animal_island.Sector;

public abstract class Animal extends BasicUnit implements Moveable, Eatable, Fertile {
    private int speed;
    private double weight;
    private double maxSatiety;
    private double currentSatiety;
    private boolean isCanMultiply = true;
    private boolean isCanMove = true;
    private boolean isCanEat = true;
    private boolean isAlive = true;
    int x;
    int y;
    Sector sector;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Sector getSector() {
        return sector;
    }

    @Override
    public void setSector(Sector sector) {
        this.sector = sector;
    }

    @Override
    public void eat() {

    }

    @Override
    public void reproduction() {

    }

    @Override
    public void move() {
        }

    public Animal(Sector sector) {
        super(sector);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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


