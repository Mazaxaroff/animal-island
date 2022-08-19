package ru.javarush.maxzaharov.animal_island.plants;


import ru.javarush.maxzaharov.animal_island.animals.abstracts.BasicUnit;


public class Plant extends BasicUnit {
    public double weight = 1;
    public static final int MAX_PLANT_ON_THE_FIELD = 200;

    public Plant(int x, int y) {
        super(x, y);
    }

    public int getMaxPlantOnTheField() {
        return MAX_PLANT_ON_THE_FIELD;
    }



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
