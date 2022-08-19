package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.BasicUnit;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Wolf;
import ru.javarush.maxzaharov.animal_island.island.Island;
import ru.javarush.maxzaharov.animal_island.plants.Plant;

import java.util.ArrayList;

public class Sector {
    int x;
    int y;
    int countOfWolves;
    ArrayList<Plant> plants;
    ArrayList<Animal> animals;


    public Sector(int x, int y, ArrayList<Wolf> wolves) {
        this.x = x;
        this.y = y;
        createPlant(x, y);
        CreateAnimal(x, y, wolves);

    }
    private void createPlant(int x, int y) {
        this.plants = new ArrayList<>();
        for (int i = 0; i < RandomNumber.get(Plant.MAX_PLANT_ON_THE_FIELD); i++) {
            plants.add(new Plant(x, y));
        }
    }
    private void CreateAnimal(int x, int y, ArrayList<Wolf> wolves){
        this.countOfWolves=RandomNumber.get(Wolf.MAX_ANIMAL_THIS_TYPE_ON_THE_FIELD);
        for (int i = 0; i < this.countOfWolves; i++) {
            wolves.add(new Wolf(x, y, this));
        }
    }
}
