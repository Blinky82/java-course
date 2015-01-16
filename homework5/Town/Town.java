package Random;

/**
 * Created by blinky on 09.01.15.
 */
public class Town {

    private String name;
    private String country;
    private int population;

public Town(String name, String country, int population) {

    this.name = name;
    this.country = country;
    this.population = population;
}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object one) {
        if (this == one)
            return true;
        if (one == null)
            return false;
        if (getClass() != one.getClass())
            return false;
        Town another = (Town) one;
        if (country == null) {
            if (another.country != null)
                return false;
        } else if (!country.equals(another.country))
            return false;
        if (name == null) {
            if (another.name != null)
                return false;
        } else if (!name.equals(another.name))
            return false;
        if (population != another.population)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Town [name=" + name + ", country=" + country + ", population="
                + population + "]";
    }
}
