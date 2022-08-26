package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

public class Buffalo extends Herbivorous {
    private int speed = 3;
    private double weight = 700;
    private double maxSatiety = 100;
    private double currentSatiety = 100;
    private String emoji = "\uD83D\uDC03";
    Fauna typeOfAnimal = Fauna.BUFFALO;

    @Override
    public String getEmoji() {
        return emoji;
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public Buffalo(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(Sector[][] island) {
        super.move(island);
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
