package ru.javarush.maxzaharov.animal_island.animals.abstracts;

import ru.javarush.maxzaharov.animal_island.RandomNumber;
import ru.javarush.maxzaharov.animal_island.interfases.Eatable;
import ru.javarush.maxzaharov.animal_island.interfases.Fertile;
import ru.javarush.maxzaharov.animal_island.interfases.Moveable;
import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.island.Island;

import java.util.ArrayList;

public abstract class Animal extends BasicUnit implements Moveable, Eatable, Fertile {
    private int speed;
    private double weight;
    private double maxSatiety;
    private double currentSatiety;
    private boolean isCanMultiply = true;
    private boolean isCanMove = true;
    private boolean isCanEat = true;
    private boolean isAlive = true;
    private String typeOfAnimal;

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public Animal(int x, int y) {
        super(x, y);
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
    public void eat() {

    }

    @Override
    public void reproduction() {

    }

    @Override
    public void move(Sector[][] island) {
        for (int i = 0; i < this.getSpeed(); i++) {
            ArrayList<String> directions = new ArrayList<>();
            if (getX() > 0 && island[getX() - 1][getY()].checkFreeSpace(this.getTypeOfAnimal())) {
                directions.add("Left");
            }
            if (getX() < Island.WIDTH_OF_ISLAND - 1 && island[getX() + 1][getY()].checkFreeSpace(this.getTypeOfAnimal())) {
                directions.add("Right");
            }
            if (getY() > 0 && island[getX()][getY() - 1].checkFreeSpace(this.getTypeOfAnimal())) {
                directions.add("Up");
            }
            if (getY() < Island.HEIGHT_OF_ISLAND - 1 && island[getX()][getY() + 1].checkFreeSpace(this.getTypeOfAnimal())) {
                directions.add("Down");
            }
            int randomDirection = RandomNumber.get(directions.size());
            String direction = directions.get(randomDirection);
            System.out.println(direction);
            switch (direction) {
                case "Left" -> horizontalMovement(island, x, y, -1);
                case "Right" -> horizontalMovement(island, x, y, 1);
                case "Up" -> verticalMovement(island, x, y, -1);
                case "Down" -> verticalMovement(island, x, y, 1);
            }
        }
    }
    public void horizontalMovement(Sector[][] island, int x, int y, int shift){
        island[x][y].changeCountOfAnimal(this.getTypeOfAnimal(),-1);
        setX(x+shift);
        island[x+shift][y].changeCountOfAnimal(this.getTypeOfAnimal(),1);
    }
    public void verticalMovement(Sector[][] island, int x, int y, int shift){
        island[x][y].changeCountOfAnimal(this.getTypeOfAnimal(),-1);
        setY(y+shift);
        island[x][y+shift].changeCountOfAnimal(this.getTypeOfAnimal(),1);
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


