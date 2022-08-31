package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.island.Island;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.island.World;
import ru.javarush.maxzaharov.animal_island.life_cycle.LifeCycle;

public class Main {
    public static void main(String[] args) {
        Sector[][] island = Island.create();

        LifeCycle.start(island);

    }
}

