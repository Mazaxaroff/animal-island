package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;


public class Goat extends Herbivorous {
    private double currentSatiety = 10;
    private int speed = 3;
    private double weight = 60;
    private double maxSatiety = 10;
    private String emoji = "\uD83D\uDC10";
    Fauna typeOfAnimal = Fauna.GOAT;

    public Goat(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmoji() {
        return "\uD83D\uDC10";
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.GOAT;
    }

    @Override
    public int getSpeed() {
        return 3;
    }

    @Override
    public double getWeight() {
        return 60;
    }

    @Override
    public double getMaxSatiety() {
        return 10;
    }

    @Override
    public double getCurrentSatiety() {
        return currentSatiety;
    }

    @Override
    public void setCurrentSatiety(double currentSatiety) {
        this.currentSatiety = currentSatiety;
    }

    @Override
    public void move(Sector[][] island) {
        super.move(island);
    }
}
