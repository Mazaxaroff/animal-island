package ru.javarush.maxzaharov.animal_island.animals.abstracts;

import ru.javarush.maxzaharov.animal_island.Sector;

public abstract class Herbivorous extends Animal {

    @Override
    public void eat(Sector[][] island) {
        if (this.getCurrentSatiety()!=this.getMaxSatiety() && island[this.getX()][this.getY()].currentCountOfPlants>0){
            this.setCurrentSatiety(Math.min(getCurrentSatiety() + 1, this.getMaxSatiety()));
            island[this.getX()][this.getY()].currentCountOfPlants=island[this.getX()][this.getY()].currentCountOfPlants-1;
        }
    }

    public Herbivorous(int x, int y) {
        super(x, y);
    }
}
