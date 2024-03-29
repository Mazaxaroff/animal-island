package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

public class Rabbit extends Herbivorous {
    private double currentSatiety = 0.45;
    private int speed = 2;
    private int maxChild = 5;
    private double weight = 2;
    private double maxSatiety = 0.45;
    private String emoji = "\uD83D\uDC07";
    Fauna typeOfAnimal = Fauna.RABBIT;

    public Rabbit(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmoji() {
        return "\uD83D\uDC07";
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.RABBIT;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public int getMaxChild() {
        return 8;
    }

    @Override
    public double getWeight() {
        return 2;
    }

    @Override
    public double getMaxSatiety() {
        return 0.45;
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
