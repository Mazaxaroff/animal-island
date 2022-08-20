package ru.javarush.maxzaharov.animal_island.plants;


import ru.javarush.maxzaharov.animal_island.Sector;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.BasicUnit;


public class Plant extends BasicUnit {
    public double weight = 1;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Plant(int x, int y) {
        super(x, y);
    }
}
