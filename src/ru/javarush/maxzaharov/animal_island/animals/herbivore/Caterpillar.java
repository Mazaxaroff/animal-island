package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

public class Caterpillar extends Herbivorous {
    private double currentSatiety = 0;
    private int speed = 0;
    private int maxChild = 10;
    private double weight = 0.01;
    private double maxSatiety = 0;
    private String emoji = "\uD83D\uDC1B";
    Fauna typeOfAnimal = Fauna.CATERPILLAR;

    public Caterpillar(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmoji() {
        return "\uD83D\uDC1B";
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.CATERPILLAR;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public int getMaxChild() {
        return 20;
    }

    @Override
    public double getWeight() {
        return 0.01;
    }

    @Override
    public double getMaxSatiety() {
        return 0;
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

    @Override
    public void hunger(Sector[][] island) {
    }
}
