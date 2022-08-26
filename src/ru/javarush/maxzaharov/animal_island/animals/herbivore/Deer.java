package ru.javarush.maxzaharov.animal_island.animals.herbivore;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Herbivorous;

public class Deer extends Herbivorous {
    private double currentSatiety = 50;
    Fauna typeOfAnimal = Fauna.DEER;


    @Override
    public String getEmoji() {
        String emoji = "\uD83E\uDD8C";
        return emoji;
    }


    @Override
    public Fauna getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public Deer(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(Sector[][] island) {
        super.move(island);
    }

      @Override
    public int getSpeed() {
          int speed = 4;
          return speed;
    }

    @Override
    public double getWeight() {
        double weight = 300;
        return weight;
    }

    @Override
    public double getMaxSatiety() {
        double maxSatiety = 50;
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
