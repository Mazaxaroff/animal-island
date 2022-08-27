package ru.javarush.maxzaharov.animal_island.life_cycle;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.island.Island;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.island.World;

public class LifeCycle {
    public static final int COUNT_OF_DAYS = 10;
    public static final double MAX_COUNT_OF_DAYS_WITHOUT_FOOD = 5.0;

    public static void deleteTheCorpses() {
        for (Fauna typeOfAnimal : Fauna.values()) {
            for (Animal animal : World.populations.get(typeOfAnimal)) {
                if (!animal.isAlive()) {
                    World.populations.get(typeOfAnimal).remove(animal);
                }
            }
        }
    }
    public static void hungerForAll(Sector[][] island) {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).forEach(animal -> animal.hunger(island));
        }
    }
    public static void eatForAll(Sector[][] island) {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).forEach(animal -> animal.eat(island));
        }
    }
    public static void moveForAll(Sector[][] island) {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).forEach(animal -> animal.move(island));
        }
    }
    public static void multiplyForAll() {
        for (Fauna typeOfAnimal : Fauna.values()) {
            World.populations.get(typeOfAnimal).forEach(animal -> animal.multiply());
        }
    }
    public static void getStatistic(){

    }


    public static void start(Sector[][] island) {
        deleteTheCorpses();
        hungerForAll(island);
        moveForAll(island);
        eatForAll(island);
        multiplyForAll();
        getStatistic();

    }
}
