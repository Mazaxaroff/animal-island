package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.Fauna;
import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

import java.util.HashMap;

public class Sheep extends Herbivorous {
    private int speed = 3;
    private double weight = 70;
    private double maxSatiety = 15;
    private double currentSatiety = 15;
    private String emoji = "\uD83D\uDC11";
    Fauna typeOfAnimal = Fauna.SHEEP;
    HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
        // put(FloraAndFauna.PLANT,100);
    }};

    @Override
    public String getEmoji() {
        return emoji;
    }

    @Override
    public HashMap<Fauna, Integer> getChanceToCatch() {
        return chanceToCatch;
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public Sheep(int x, int y) {
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
