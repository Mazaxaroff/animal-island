package ru.javarush.maxzaharov.animal_island.animals.abstracts;

import ru.javarush.maxzaharov.animal_island.island.Sector;

public abstract class Carnivorous extends Animal {


    public Carnivorous(int x, int y) {
        super(x, y);
    }

    @Override
    public void eat(Sector[][] island) { //todo распечатать результат
        island[getX()][getY()].getAnimalAbleToEat(this.getChanceToCatch());
    }
}
