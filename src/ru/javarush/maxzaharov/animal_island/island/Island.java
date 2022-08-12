package ru.javarush.maxzaharov.animal_island.island;

import lombok.Data;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Wolf;
import java.util.ArrayList;

@Data
public class Island {
    public static int widthOfIsland = 20;
    public static int heightOfIsland = 100;

    @Override
    public String toString() {
        return "Island{}";
    }

    public static ArrayList<Animal>[][] createIsland(){
        return new ArrayList[widthOfIsland][heightOfIsland];
    }

    public static ArrayList<Animal>[][] fill(ArrayList<Animal>[][] island){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                island[i][j] = new ArrayList<>();;
                island[i][j].add(new Wolf());
            }
        }
        return island;
    }

    public void run(Animal animal){

    }

}
