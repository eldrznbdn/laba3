
import seaAnimals.seaAnimals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Realization {
    private List<animals> seaAnimal = new ArrayList<>();
    private String name;

    Realization(String name){
        this.name = name;
    }


    public void sortMaxYearOfLife(boolean temp){
        if(temp)
            seaAnimal.sort((o1, o2) -> o2.getMaxYearOfLife() - o1.getMaxYearOfLife());
        else
            seaAnimal.sort(Comparator.comparingInt(seaAnimals::getMaxYearOfLife));
    }

    public void sortBySizeOfAquarium(boolean temp){
        if(temp)
            seaAnimal.sort((o1, o2) -> (int) (o2.getSizeOfAquarium() - o1.getSizeOfAquarium()));
        else
            seaAnimal.sort((o1, o2) -> (int) (o1.getSizeOfAquarium() - o2.getSizeOfAquarium()));
    }

    public void add(animals seaAnimals){

        seaAnimal.add(seaAnimals);
    }

    @Override
    public String toString() {
        return "seaAnimals name:" + name + "\nseaAnimal =" +
                seaAnimal.stream().flatMap(a -> Stream.of(a.toString()))
                        .collect(Collectors.joining(" \n "," [ "," ] ")) + '}';
    }

}

