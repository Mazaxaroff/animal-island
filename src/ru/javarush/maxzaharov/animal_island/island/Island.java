package ru.javarush.maxzaharov.animal_island.island;

import lombok.Data;
import ru.javarush.maxzaharov.animal_island.animals.abstracts.Animal;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Eagle;
import ru.javarush.maxzaharov.animal_island.animals.carnivore.Wolf;
import ru.javarush.maxzaharov.animal_island.animals.herbivore.Mouse;

import java.util.ArrayList;
import java.util.Arrays;

@Data
public class Island {
    public static int widthOfIsland = 4;
    public static int heightOfIsland = 3;


    public static ArrayList<Animal>[][] createIsland(){
        return new ArrayList[widthOfIsland][heightOfIsland];
    }

    public static ArrayList<Animal>[][] fill(ArrayList<Animal>[][] island){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                island[i][j] = new ArrayList<>();;
                //island[i][j].add(new Wolf());
            }
        }
        island[1][1].add(new Wolf());
        island[1][1].add(new Eagle());
        island[2][2].add(new Mouse());
        return island;
    }

    public void run(Animal animal){

    }

    public void turnRight(){

    }

}
