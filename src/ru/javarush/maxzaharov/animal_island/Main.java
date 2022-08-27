package ru.javarush.maxzaharov.animal_island;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.island.Island;
import ru.javarush.maxzaharov.animal_island.island.Sector;
import ru.javarush.maxzaharov.animal_island.island.World;
import ru.javarush.maxzaharov.animal_island.services.Dialog;

public class Main {
    public static void main(String[] args) {
        new World();
        Sector[][] island = Island.create();
        Sector firstSector = island[0][0];


        Dialog.hello();
        Dialog.printCountOfAllAnimal();
        World.populations.get(Fauna.BOAR).forEach(animal -> animal.move(island));
        Dialog.printCountOfAllAnimal();
       // Dialog.printCountOfAllCorpses();



//        for (Fauna typeOfAnimal : Fauna.values()) {
//            System.out.println(firstSector.currentCountsOfAnimal.get(typeOfAnimal) +
//                    Population.populations.get(typeOfAnimal).get(0).getEmoji());
//        }
//
//        for (Fauna typeOfAnimal : Population.populations.keySet()) {
//            System.out.println("В секторе " + firstSector.getX() + " " + firstSector.getY() +
//                    " было " + firstSector.currentCountsOfAnimal.get(typeOfAnimal) + " " + typeOfAnimal.toString());
//        }
        //for (Fauna typeOfAnimal : populations.keySet()) {
        //fixme eat
        //fixme multyply
//            populations.get(typeOfAnimal).get(0).move(island);
//        }
//        for (Fauna typeOfAnimal : populations.keySet()) {
//            System.out.println("В секторе " + firstSector.getX() + " " + firstSector.getY() +
//                    " стало " + firstSector.currentCountsOfAnimal.get(typeOfAnimal) + " " + typeOfAnimal.toString());
//        }

//        System.out.println("В секторе " + firstSector.getX() + " " + firstSector.getY() + " " +
//                firstSector.currentCountOfPlants + " травы");
//
//
//        for (Fauna type : Fauna.values()) {
//            System.out.println(Population.populations.get(type).get(0).getTypeOfAnimal().toString() +
//                    " живо? = " + Population.populations.get(type).get(0).isAlive());
//        }
//            for (Fauna typeOfAnimal : Population.populations.keySet()) {
//                Population.populations.get(typeOfAnimal).get(0).die(island);
//            }
//
//        for (Fauna type : Fauna.values()) {
//            System.out.println(Population.populations.get(type).get(0).getTypeOfAnimal().toString() +
//                    " живо? = " +Population.populations.get(type).get(0).isAlive());
//
//        }

        // Population.populations.get(Fauna.BOA).get(0).eat(island);


    }
}

