package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Wolf;
import ru.javarush.maxzaharov.animal_island.island.Island;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wolf> wolves = new ArrayList<>();
        //[Fauna.WOLF, Fauna.DUCK] - все виды
        //[Fauna.WOLF => wolves, Fauna.DUCK => ducks] - все виды
        Sector[][] island = Island.create(wolves);
        Sector firstSector = island[0][0];
        //Arrays.stream(Island.create()).map(Arrays::toString).forEach(System.out::println);
       //System.out.println(firstSector.plants);

       //Arrays.stream(island).map(Arrays::toString).forEach(System.out::println);

        //wolves.forEach(wolf -> System.out.println(wolf.getX()));

       // wolves.forEach(wolf -> wolf.move());


        System.out.println(wolves.get(1).getX() + " " + wolves.get(1).getY() + "Начальная позиция");
        wolves.get(1).move(island);
        System.out.println(wolves.get(1).getX() + " " + wolves.get(1).getY() + "конечная позиция");


    }
}
