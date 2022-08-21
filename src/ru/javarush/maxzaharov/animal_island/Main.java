package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.island.Island;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList> populations = new HashMap<>() {{
            put(Fauna.WOLF.toString(), new ArrayList<>());
            put(Fauna.RABBIT.toString(), new ArrayList<>());
        }};
        Sector[][] island = Island.create(populations);

        Sector firstSector = island[0][0];
        System.out.println(firstSector.currentCountsOfAnimal.get(Fauna.WOLF.toString()) + " волков");
        System.out.println(firstSector.currentCountsOfAnimal.get(Fauna.RABBIT.toString()) + " кроликов");

        for (String type : populations.keySet()) {
            populations.get(type).get(1);
        }
//        for (String key : populations.keySet()) {
//            populations.get(key).forEach(animals -> {for (Animal animal : animals) {
//                animal.move(island);
//            }});
//
//        }
    }
}
//        System.out.println(wolves.get(130).getX() + " " + wolves.get(130).getY() + " Начальная позиция");
//        System.out.println("В секторе было " + firstSector.currentCountsOfAnimal.get(wolves.get(130).getTypeOfAnimal()) + " волков");
//        wolves.get(130).move(island);
//        System.out.println(wolves.get(130).getX() + " " + wolves.get(130).getY() + " конечная позиция");
//        System.out.println("В секторе стало " + firstSector.currentCountsOfAnimal.get(wolves.get(130).getTypeOfAnimal()) + " волков");

