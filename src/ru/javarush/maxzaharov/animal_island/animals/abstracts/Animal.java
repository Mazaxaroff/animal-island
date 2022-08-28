package ru.javarush.maxzaharov.animal_island.animals.abstracts;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.World;
import ru.javarush.maxzaharov.animal_island.life_cycle.LifeCycle;
import ru.javarush.maxzaharov.animal_island.services.RandomNumber;
import ru.javarush.maxzaharov.animal_island.interfases.*;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.island.Island;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Animal extends BasicUnit implements Moveable, Eatable, Fertile, Hunger, Die {
    private int speed;
    private int maxChild;
    private double weight;
    private double maxSatiety;
    private double currentSatiety;
    private boolean isCanMultiply = true;
    private boolean isCanMove = true;
    private boolean isCanEat = true;
    private boolean isAlive = true;
    private String emoji;
    Fauna typeOfAnimal;
    private HashMap<Fauna, Integer> chanceToCatch = new HashMap<>();

    public Animal(int x, int y) {
        super(x, y);
    }

    public String getEmoji() {
        return emoji;
    }

    public int getMaxChild() {
        return maxChild;
    }

    public HashMap<Fauna, Integer> getChanceToCatch() {
        return chanceToCatch;
    }

    public Fauna getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public double getMaxSatiety() {
        return maxSatiety;
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

    public boolean isCanMove() {
        return isCanMove;
    }

    public void setCanMove(boolean canMove) {
        isCanMove = canMove;
    }

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
    public void hunger(Sector[][] island) {
        this.setCurrentSatiety(this.getCurrentSatiety()
                - (this.getMaxSatiety() / LifeCycle.MAX_COUNT_OF_DAYS_WITHOUT_FOOD));
        if (this.getCurrentSatiety() <= 0) {
            this.die(island);
        }
    }

    @Override
    public void eat(Sector[][] island) {
    }

    @Override
    public void multiply(Sector[][] island) {
        if (this.isAlive() && this.isCanMultiply()) {
            if (island[getX()][getY()].checkFreeSpace(getTypeOfAnimal())) {
                Animal pair = World.randomAnimalForAction(getTypeOfAnimal(), getX(), getY(), this);
                if (pair != null && pair.isCanMultiply()) {
                    this.setCanMultiply(false);
                    pair.setCanMultiply(false);
                    int randomNumberOfChild = RandomNumber.get(this.getMaxChild());
                    if (randomNumberOfChild > 0) {
                        int currentCountOfAnimal =
                                island[getX()][getY()].getCurrentCountsOfAnimal().get(getTypeOfAnimal());
                        int maxCountOfAnimal = island[getX()][getY()].getMaxCountsOfAnimal().get(getTypeOfAnimal());
                        if (currentCountOfAnimal + randomNumberOfChild > maxCountOfAnimal) {
                            randomNumberOfChild = maxCountOfAnimal - currentCountOfAnimal;
                        }
                        island[getX()][getY()].changeCountOfAnimal(getTypeOfAnimal(), randomNumberOfChild);
                        island[getX()][getY()].sectorFilling(
                                getTypeOfAnimal(), getX(), getY(), randomNumberOfChild, World.babiesPopulations);
                    }
                }
            }
        }
    }

    @Override
    public void die(Sector[][] island) {
        this.setAlive(false);
        island[getX()][getY()].changeCountOfAnimal(this.getTypeOfAnimal(), -1);
    }

    @Override
    public void move(Sector[][] island) {
        if (this.isAlive) {
            for (int i = 0; i < this.getSpeed(); i++) {
                ArrayList<String> directions = new ArrayList<>();
                if (getX() > 0 && island[getX() - 1][getY()].checkFreeSpace(this.getTypeOfAnimal())) {
                    directions.add("Left");
                }
                if (getX() < Island.WIDTH_OF_ISLAND - 1 && island[getX() + 1][getY()]
                        .checkFreeSpace(this.getTypeOfAnimal())) {
                    directions.add("Right");
                }
                if (getY() > 0 && island[getX()][getY() - 1].checkFreeSpace(this.getTypeOfAnimal())) {
                    directions.add("Up");
                }
                if (getY() < Island.HEIGHT_OF_ISLAND - 1 && island[getX()][getY() + 1]
                        .checkFreeSpace(this.getTypeOfAnimal())) {
                    directions.add("Down");
                }
                if (directions.size() > 0) {
                    int randomDirection = RandomNumber.get(directions.size());
                    String direction = directions.get(randomDirection);
                    switch (direction) {
                        case "Left" -> horizontalMovement(island, x, y, -1);
                        case "Right" -> horizontalMovement(island, x, y, 1);
                        case "Up" -> verticalMovement(island, x, y, -1);
                        case "Down" -> verticalMovement(island, x, y, 1);
                    }
                }
            }
        }
    }

    public void horizontalMovement(Sector[][] island, int x, int y, int shift) {
        island[x][y].changeCountOfAnimal(this.getTypeOfAnimal(), -1);
        setX(x + shift);
        island[x + shift][y].changeCountOfAnimal(this.getTypeOfAnimal(), 1);
    }

    public void verticalMovement(Sector[][] island, int x, int y, int shift) {
        island[x][y].changeCountOfAnimal(this.getTypeOfAnimal(), -1);
        setY(y + shift);
        island[x][y + shift].changeCountOfAnimal(this.getTypeOfAnimal(), 1);
    }
}
