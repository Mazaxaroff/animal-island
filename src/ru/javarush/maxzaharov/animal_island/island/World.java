package ru.javarush.maxzaharov.animal_island.island;

import ru.javarush.maxzaharov.animal_island.animals.Fauna;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.services.RandomNumber;

import java.util.ArrayList;
import java.util.HashMap;

public class World {
   public static HashMap<Fauna, ArrayList<Animal>> populations = new HashMap<>() {{
        for (Fauna typeOfAnimal : Fauna.values()) {
            put(typeOfAnimal, new ArrayList<>());
        }
    }};
    public static HashMap<Fauna, Integer> corpses = new HashMap<>();
    public static int getPopulationsSize(Fauna typeOfAnimal){
        return populations.get(typeOfAnimal).size();
    }

    public static void createCemetery(){
        for (Fauna typeOfAnimal : Fauna.values()) {
            int countOfCorpses=0;
            for (Animal animal : World.populations.get(typeOfAnimal)) {
                if (!animal.isAlive()){
                    countOfCorpses++;
                    corpses.put(typeOfAnimal,countOfCorpses);
                }
            }
        }
    }

    public World() {
        this.populations = populations;
    }

    public HashMap<Fauna, ArrayList<Animal>> getPopulations() {
        return populations;
    }

    public ArrayList<Fauna> setOfAnimals(){
        return (ArrayList<Fauna>) populations.keySet();
    }


    public static Animal randomAnimalForAction (Fauna typeOfAnimal, int x, int y){
        var animalsInSector= populations.get(typeOfAnimal).stream().filter(animal -> animal.getX()==x && animal.getY()==y).toList();
        int indexOfAnimal = RandomNumber.get(animalsInSector.size());
        return animalsInSector.get(indexOfAnimal);
    }

}
