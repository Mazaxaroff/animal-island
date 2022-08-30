package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;
import ru.javarush.maxzaharov.animal_island.island.World;
import ru.javarush.maxzaharov.animal_island.services.RandomNumber;

import java.util.HashMap;

public class Boar extends Herbivorous {
    private double currentSatiety = 50;
    private int speed = 2;
    private int maxChild = 5;
    private double weight = 400;
    private double maxSatiety = 50;
    private String emoji = "\uD83D\uDC17";
    Fauna typeOfAnimal = Fauna.BOAR;
    HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
        put(Fauna.MOUSE, 50);
        put(Fauna.CATERPILLAR, 90);
    }};

    public Boar(int x, int y) {
        super(x, y);
    }

    @Override
    public HashMap<Fauna, Integer> getChanceToCatch() {
        HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
            put(Fauna.MOUSE, 50);
            put(Fauna.CATERPILLAR, 90);
        }};
        return chanceToCatch;
    }

    @Override
    public String getEmoji() {
        return "\uD83D\uDC17";
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.BOAR;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public int getMaxChild() {
        return 5;
    }

    @Override
    public double getWeight() {
        return 400;
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

    @Override
    public void eat(Sector[][] island) {
        int wayOfEating = RandomNumber.get(RandomNumber.WAY_OF_EATING);
        if (wayOfEating == 0) {
            super.eat(island);
        } else {
            if (this.getCurrentSatiety() != this.getMaxSatiety()) {
                Fauna availableTypeOfAnimal = island[getX()][getY()].getAnimalAbleToEat(this.getChanceToCatch());
                int attempt = RandomNumber.get(RandomNumber.HUNDRED_PERCENT);
                if (availableTypeOfAnimal != null && attempt <= this.getChanceToCatch().get(availableTypeOfAnimal)) {
                    Animal victim = World.randomAnimalForAction(availableTypeOfAnimal, getX(), getY());
                    this.setCurrentSatiety(Math.min(getCurrentSatiety() + victim.getWeight(), this.getMaxSatiety()));
                    victim.die(island);
                }
            }
        }
    }
}
