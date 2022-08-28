package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;
import ru.javarush.maxzaharov.animal_island.island.World;
import ru.javarush.maxzaharov.animal_island.services.RandomNumber;

import java.util.HashMap;

public class Duck extends Herbivorous {
    private double currentSatiety = 0.15;
    private int speed = 4;
    private int maxChild = 7;
    private double weight = 1;
    private double maxSatiety = 0.15;
    private String emoji = "\uD83E\uDD86";
    Fauna typeOfAnimal = Fauna.DUCK;
    HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
        put(Fauna.CATERPILLAR, 90);
    }};

    public Duck(int x, int y) {
        super(x, y);
    }

    @Override
    public HashMap<Fauna, Integer> getChanceToCatch() {
        HashMap<Fauna, Integer> chanceToCatch = new HashMap<>() {{
            put(Fauna.CATERPILLAR, 90);
        }};
        return chanceToCatch;
    }

    @Override
    public String getEmoji() {
        return "\uD83E\uDD86";
    }

    @Override
    public Fauna getTypeOfAnimal() {
        return Fauna.DUCK;
    }

    @Override
    public int getSpeed() {
        return 4;
    }

    @Override
    public int getMaxChild() {
        return 7;
    }

    @Override
    public double getWeight() {
        return 1;
    }

    @Override
    public double getMaxSatiety() {
        return 0.15;
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
        if (wayOfEating==0){
            super.eat(island);
        }else {
            if (this.getCurrentSatiety() != this.getMaxSatiety()) {
                Fauna availableTypeOfAnimal = island[getX()][getY()].getAnimalAbleToEat(this.getChanceToCatch());
                int attempt = RandomNumber.get(RandomNumber.HUNDRED_PERCENT);
                if (availableTypeOfAnimal!= null && attempt <= this.getChanceToCatch().get(availableTypeOfAnimal)) {
                    Animal victim = World.randomAnimalForAction(availableTypeOfAnimal, getX(), getY());
                    this.setCurrentSatiety(Math.min(getCurrentSatiety() + victim.getWeight(), this.getMaxSatiety()));
                    victim.die(island);
                }
            }
        }
    }
}
