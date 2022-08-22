package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.island.Island;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<FloraAndFauna, ArrayList<Animal>> populations = new HashMap<>() {{
            put(FloraAndFauna.WOLF, new ArrayList<>());
            put(FloraAndFauna.RABBIT, new ArrayList<>());
            put(FloraAndFauna.SHEEP, new ArrayList<>());
        }};
        Sector[][] island = Island.create(populations);

        Sector firstSector = island[0][0];
        System.out.println(firstSector.currentCountsOfAnimal.get(FloraAndFauna.WOLF) +
                populations.get(FloraAndFauna.WOLF).get(0).getEmoji());
        System.out.println(firstSector.currentCountsOfAnimal.get(FloraAndFauna.RABBIT) +
                populations.get(FloraAndFauna.RABBIT).get(0).getEmoji());
        System.out.println(firstSector.currentCountsOfAnimal.get(FloraAndFauna.SHEEP) +
                populations.get(FloraAndFauna.SHEEP).get(0).getEmoji());

        for (FloraAndFauna type : populations.keySet()) {
            System.out.println("В секторе " + firstSector.getX() + " " + firstSector.getY() +
                    " было " + firstSector.currentCountsOfAnimal.get(type) + " " + type.toString());
        }

        for (FloraAndFauna type : populations.keySet()) {
            populations.get(type).get(0).move(island);
        }
        for (FloraAndFauna type : populations.keySet()) {
            System.out.println("В секторе " + firstSector.getX() + " " + firstSector.getY() +
                    " стало " + firstSector.currentCountsOfAnimal.get(type) + " " + type.toString());
        }

    }
}
//        System.out.println(wolves.get(130).getX() + " " + wolves.get(130).getY() + " Начальная позиция");
//        System.out.println("В секторе было " + firstSector.currentCountsOfAnimal.get(wolves.get(130).getTypeOfAnimal()) + " волков");
//        wolves.get(130).move(island);
//        System.out.println(wolves.get(130).getX() + " " + wolves.get(130).getY() + " конечная позиция");
//        System.out.println("В секторе стало " + firstSector.currentCountsOfAnimal.get(wolves.get(130).getTypeOfAnimal()) + " волков");

