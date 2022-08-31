package ru.javarush.maxzaharov.animal_island.animals.carnivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Carnivorous;

import java.util.HashMap;

public class Boa extends Carnivorous {
    private double currentSatiety = 3;
    private int speed = 1;
    private int maxChild = 3;
    private double weight = 15;
    private double maxSatiety = 3;
    private String emoji = "\uD83D\uDC0D";
    Fauna typeOfAnimal = Fauna.BOA;
    HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
        put(Fauna.FOX, 15);
        put(Fauna.RABBIT, 20);
        put(Fauna.MOUSE, 40);
        put(Fauna.DUCK, 10);
    }};

    public Boa(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmoji() {
        return "\uD83D\uDC0D";
    }

    @Override
    public HashMap<Fauna, Integer> getChanceToCatch() {
        HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
            put(Fauna.FOX, 15);
            put(Fauna.RABBIT, 20);
            put(Fauna.MOUSE, 40);
            put(Fauna.DUCK, 10);
        }};
        return chanceToCatch;
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.BOA;
    }

    @Override
    public int getMaxChild() {
        return 3;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public double getWeight() {
        return 15;
    }

    @Override
    public double getMaxSatiety() {
        return 3;
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
