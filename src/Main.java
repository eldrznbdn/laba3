import seaAnimals.seaAnimals;
import java.util.*;
import seaAnimals.*;
public class Main {
    public static void main(String[] args) {
        Realization realization = new Realization("aquaZoo");
        animals dolphin = new Dolphin("blackDolphin",8,10);
        animals shark = new Shark("carp",6,23);
        animals fish = new Fish("smag",4,1);

       /* realization.add(dolphin);
        realization.add(shark);
        realization.add(fish);*/

        /*seaAnimals dolphins1 = new Dolphin("blackDolphin",8,10);
        seaAnimals dolphins2 = new Dolphin("blueDolphin",5,15);
        seaAnimals dolphins3 = new Dolphin("whiteDolphin",10,11);
        seaAnimals fish1 = new Fish("smag",4,1);
        seaAnimals fish2 = new Fish("gigi",5,3);
        seaAnimals fish3 = new Fish("squet",3,2);
        seaAnimals shark1 =new Shark("carp",6,23);
        seaAnimals shark2 =new Shark("whiteShark",8,14);
        seaAnimals shark3 =new Shark("weely",4,20);

        realization.add(dolphins1);
        realization.add(dolphins2);
        realization.add(dolphins3);
        realization.add(fish1);
        realization.add(fish2);
        realization.add(fish3);
        realization.add(shark1);
        realization.add(shark2);
        realization.add(shark3);*/

        System.out.println("\nSorted by size of aquarium : \n"+realization);
        realization.sortBySizeOfAquarium(true);
        System.out.println("\nSorted by size of aquarium : \n"+realization);
        realization.sortBySizeOfAquarium(false);
        System.out.println("\nSorted by year of life : \n"+realization);
        realization.sortMaxYearOfLife(true);
        System.out.println("\nSorted by year of life : \n"+realization);
        realization.sortMaxYearOfLife(false);
    }
}

/*Main main = new Main();
        main.sort();

    }

    public static void sort() {
        List<seaAnimals> dolphins = new ArrayList<>();
        // List<seaAnimals> dolphins1 = generateListOfDolphin();
        dolphins.add(new seaAnimals("blackDolphin",5,10));
        dolphins.add(new seaAnimals("whiteDolphin",6,8));
        dolphins.add(new seaAnimals("blueDolphin",9,12));


        dolphins.sort(new Comparator<seaAnimals>() {
            @Override
            public int compare(seaAnimals x1, seaAnimals x2) {
                return -(x1.getSizeOfAquarium() - x2.getSizeOfAquarium());
            }
        });

        for (Object o : dolphins) {
            System.out.println(o);
        }

        System.out.println("new sort:");
        dolphins.sort(new Comparator<seaAnimals>() {
            @Override
            public int compare(seaAnimals x1, seaAnimals x2) {
                return (x1.getSizeOfAquarium() - x2.getSizeOfAquarium());
            }
        });
        for (Object o : dolphins) {
            System.out.println(o);
        }
    }

    public void doMain(){
        List<seaAnimals> seaAnimals = generateListOfDolphin();

    }
    private List<seaAnimals> generateListOfDolphin() {
        List<seaAnimals> dolphins = new ArrayList<>();
        dolphins.add(new seaAnimals("blackDolphin",5,10));
        dolphins.add(new seaAnimals("whiteDolphin",4,8));
        dolphins.add(new seaAnimals("blueDolphin",9,12));

        return dolphins;
    }*/
