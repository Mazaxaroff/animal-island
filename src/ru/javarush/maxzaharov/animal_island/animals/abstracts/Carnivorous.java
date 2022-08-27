package ru.javarush.maxzaharov.animal_island.animals.abstracts;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.island.World;
import ru.javarush.maxzaharov.animal_island.plants.Plant;
import ru.javarush.maxzaharov.animal_island.services.RandomNumber;

public abstract class Carnivorous extends Animal {

    public Carnivorous(int x, int y) {
        super(x, y);
    }

    @Override
    public void eat(Sector[][] island) {
        if (this.getCurrentSatiety() != this.getMaxSatiety()) {
            Fauna availableTypeOfAnimal = island[getX()][getY()].getAnimalAbleToEat(this.getChanceToCatch());
            int attempt = RandomNumber.get(100);
            if (attempt <= this.getChanceToCatch().get(availableTypeOfAnimal)) {
                Animal victim = World.randomAnimalForAction(availableTypeOfAnimal, getX(), getY());
                this.setCurrentSatiety(Math.min(getCurrentSatiety() + victim.getWeight(), this.getMaxSatiety()));
                victim.die(island);
            }
        }
    }
}
