package ru.javarush.maxzaharov.animal_island.animals.abstracts;

import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.plants.Plant;

public abstract class Herbivorous extends Animal {

    public Herbivorous(int x, int y) {
        super(x, y);
    }

    @Override
    public void eat(Sector[][] island) {
        if (this.getCurrentSatiety() != this.getMaxSatiety() &&
                island[this.getX()][this.getY()].currentCountOfPlants > 0) {
            this.setCurrentSatiety(Math.min(getCurrentSatiety() + Plant.WEIGHT, this.getMaxSatiety()));
            island[this.getX()][this.getY()].currentCountOfPlants =
                    island[this.getX()][this.getY()].currentCountOfPlants - 1;
        }
    }
}
