package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

public class Deer extends Herbivorous {
    private double currentSatiety = 50;
    private int speed = 4;
    private int maxChild = 3;
    private double weight = 300;
    private double maxSatiety = 50;
    private String emoji = "\uD83E\uDD8C";
    Fauna typeOfAnimal = Fauna.DEER;

    public Deer(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmoji() {
        return "\uD83E\uDD8C";
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.DEER;
    }

    @Override
    public int getSpeed() {
        return 4;
    }

    @Override
    public int getMaxChild() {
        return 3;
    }

    @Override
    public double getWeight() {
        return 300;
    }

    @Override
    public double getMaxSatiety() {
        return 50;
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
