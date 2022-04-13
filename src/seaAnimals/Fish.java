package seaAnimals;

public class Fish extends seaAnimals {
    private String name;
    private int yearOfLife;
    private int sizeOfAquarium;
    public Fish(String name, int yearOfLife, int sizeOfAquarium) {
        super(name, yearOfLife, sizeOfAquarium);
    }

    @Override
    public int getSizeOfAquarium() {
        return sizeOfAquarium;
    }
    @Override
    public int getMaxYearOfLife(){return yearOfLife;};

    @Override
    public String toString() {
        return "Fish[" +
                "name='" + name + '\'' +
                ", yearOfLife=" + yearOfLife +
                ", sizeOfAquarium=" + sizeOfAquarium +
                ']';
    }
}
