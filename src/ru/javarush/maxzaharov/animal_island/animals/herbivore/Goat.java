package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;


public class Goat extends Herbivorous {
    private int speed = 3;
    private double weight = 60;
    private double maxSatiety = 10;
    private double currentSatiety = 10;
    private String emoji = "\uD83D\uDC10";
    Fauna typeOfAnimal = Fauna.GOAT;

    @Override
    public String getEmoji() {
        return emoji;
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return typeOfAnimal;
    }

    @Override
    public void move(Sector[][] island) {
        super.move(island);
    }

   

    public Goat(int x, int y) {
        super(x, y);
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
