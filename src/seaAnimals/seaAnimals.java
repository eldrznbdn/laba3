package seaAnimals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class seaAnimals implements animals {
    private String name;
    private int yearOfLife;
    private int sizeOfAquarium;

    public seaAnimals(String name,int yearOfLife,int sizeOfAquarium) {
        this.name = name;
        this.yearOfLife = yearOfLife;
        this.sizeOfAquarium = sizeOfAquarium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfLife() {
        return yearOfLife;
    }

    public void setYearOfLife(int yearOfLife) {
        this.yearOfLife = yearOfLife;
    }
    @Override
    public int getSizeOfAquarium() {
        return sizeOfAquarium;
    }
    @Override
    public int getMaxYearOfLife(){return yearOfLife;};


    public void setSizeOfAquarium(int sizeOfAquarium) {
        this.sizeOfAquarium = sizeOfAquarium;
    }

    @Override
    public String toString() {
        return "seaAnimals[" +
                "name='" + name + '\'' +
                ", yearOfLife=" + yearOfLife +
                ", sizeOfAquarium=" + sizeOfAquarium +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        seaAnimals that = (seaAnimals) o;
        return yearOfLife == that.yearOfLife && sizeOfAquarium == that.sizeOfAquarium && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfLife, sizeOfAquarium);
    }

}
