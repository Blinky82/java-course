package Random;

import java.util.HashSet;

/**
 * Created by blinky on 09.01.15.
 */
public class HashSetExample {

    public static void main(String[] args) {

        Town sofia = new Town("Sofia", "Bulgaria", 1281580);
        Town varna = new Town("Varna", "Bulgaria", 348527);
        Town burgas = new Town("Burgas", "Bulgaria", 199364);
        Town plovdiv = new Town("Plovdiv", "Bulgaria", 338153);
        Town turnovo = new Town("Turnovo", "Bulgaria", 88417);

        HashSet<Town> town = new HashSet<Town>();

        town.add(sofia);
        town.add(varna);
        town.add(burgas);
        town.add(plovdiv);
        town.add(turnovo);

        System.out.println(town);


        System.out.println(town.contains(sofia));
        town.remove(turnovo);
        System.out.println(town);

    }
}
