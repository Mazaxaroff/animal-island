package ru.javarush.maxzaharov.animal_island.life_cycle;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.island.World;

public class LifeCycle {
    public static final int COUNT_OF_DAYS = 10;
    public static final double MAX_COUNT_OF_DAYS_WITHOUT_FOOD = 5.0;

    public static void deleteTheCorpses() {
        for (Fauna typeOfAnimal : Fauna.values()) {
            for (Animal animal : World.populations.get(typeOfAnimal)) {
                if (!animal.isAlive()){
                    World.populations.get(typeOfAnimal).remove(animal);
                }
            }
        }
    }


}
