import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Simulation {


    // creating arraylist of items from text file

    ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {

        ArrayList<Item> items = new ArrayList<>();
        File file = new File(fileName);
        Scanner itemsFile = new Scanner(file);

        while (itemsFile.hasNext()) {

            Item item = new Item();

            // splitting text file and assigning values to item's name and weight

            String separateLine = itemsFile.nextLine();
            String[] singleItem = separateLine.split("=");
            item.setName(singleItem[0]);
            item.setWeight(Integer.parseInt(singleItem[1]));


            items.add(item);

             // test items in ArrayList
//            System.out.println(item.getWeight());
//            System.out.println(item.getName());


        }

        return items;
    }

    public ArrayList<Rocket> loadU1 (ArrayList<Item> items) {

        ArrayList<Rocket> rocketsU1 = new ArrayList<>();
        Rocket rocketU1 = new U1();

        for (Item item : items) {
            if (rocketU1.canCarry(item)) {
                rocketU1.carry(item);

            } else {
                rocketsU1.add(rocketU1);
                rocketU1 = new U1();
                rocketU1.carry(item);
            }
        }
        if (rocketU1.getCurrentWeight() > 10000 && rocketU1.getCurrentWeight() < 18000) {
            rocketsU1.add(rocketU1);
        }

        return rocketsU1;
    }


    public ArrayList<Rocket> loadU2 (ArrayList<Item> items) {

        ArrayList<Rocket> rocketsU2 = new ArrayList<>();
        Rocket rocketU2 = new U2();

        for (Item item : items) {
            if (rocketU2.canCarry(item)) {
                rocketU2.carry(item);

            } else {
                rocketsU2.add(rocketU2);
                rocketU2 = new U2();
                rocketU2.carry(item);
            }
        }
        if (rocketU2.getCurrentWeight() > 18000 && rocketU2.getCurrentWeight() < 29000) {
            rocketsU2.add(rocketU2);

        }
        return rocketsU2;
    }

// loop through all items in ArrayList rockets
    public  int runSimulation (ArrayList<Rocket> rockets) {

        int totalBudget = 0;
        int crashed =0;

        for (Rocket rocket : rockets) {

            if (!rocket.launch() || (!rocket.land())) {

                totalBudget += rocket.getCost() *2 ;

            } else {

                totalBudget += rocket.getCost();
            }

        }
        return totalBudget;

    }

}
