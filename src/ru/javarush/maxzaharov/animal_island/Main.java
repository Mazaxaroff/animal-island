package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.island.Island;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Fauna, ArrayList<Animal>> populations = new HashMap<>() {{
            for (Fauna typeOfAnimal : Fauna.values()) {
                put(typeOfAnimal, new ArrayList<>());
            }
        }};
        Sector[][] island = Island.create(populations);

        Sector firstSector = island[0][0];
//        for (Fauna typeOfAnimal : Fauna.values()) {
//            System.out.println(firstSector.currentCountsOfAnimal.get(typeOfAnimal) +
//                    populations.get(typeOfAnimal).get(0).getEmoji());
//        }

//        for (Fauna typeOfAnimal : populations.keySet()) {
//            System.out.println("В секторе " + firstSector.getX() + " " + firstSector.getY() +
//                    " было " + firstSector.currentCountsOfAnimal.get(typeOfAnimal) + " " + typeOfAnimal.toString());
//        }
//        for (Fauna typeOfAnimal : populations.keySet()) {
        //fixme if (animal.alive):
        //fixme eat
        //fixme multyply
//            populations.get(typeOfAnimal).get(0).move(island);
//        }
//        for (Fauna typeOfAnimal : populations.keySet()) {
//            System.out.println("В секторе " + firstSector.getX() + " " + firstSector.getY() +
//                    " стало " + firstSector.currentCountsOfAnimal.get(typeOfAnimal) + " " + typeOfAnimal.toString());
//        }

        System.out.println("В секторе " + firstSector.getX() + " " + firstSector.getY() + " " +
                firstSector.currentCountOfPlants + " травы");


        for (Fauna type : Fauna.values()) {
            System.out.println(populations.get(type).get(0).getTypeOfAnimal().toString() +
                    " живо? = " + populations.get(type).get(0).isAlive());
        }
            for (Fauna typeOfAnimal : populations.keySet()) {
                populations.get(typeOfAnimal).get(0).die(island);
            }

        for (Fauna type : Fauna.values()) {
            System.out.println(populations.get(type).get(0).getTypeOfAnimal().toString() +
                    " живо? = " +populations.get(type).get(0).isAlive());

        }



    }
}

