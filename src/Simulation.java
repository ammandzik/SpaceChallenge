import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Simulation {


    // creating arraylist of items from text file

    ArrayList<Item> loadItems() throws FileNotFoundException {

        ArrayList<Item> items = new ArrayList<>();

        Scanner itemsFile1 = new Scanner(new File("/home/amanda/IdeaProjects/SpaceChallenge/Phase_1"));

        while (itemsFile1.hasNext()) {

            Item item = new Item();

            // splitting text file and assigning values to itrm

            String separateLine = itemsFile1.nextLine();
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

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {

        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket rocket = new U1();

        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);

            } else {
                rockets.add(new Rocket());
                rocket.setCurrentWeight(10000);
            }


        }

        return rockets;
    }


//    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
//
//        ArrayList<Rocket> rockets = new ArrayList<>();
//        Rocket rocket = new U2();
//
//        for (Item item : items) {
//            if (rocket.canCarry(item)) {
//                rocket.carry(item);
//
//            } else {
//                rockets.add(new Rocket());
//                rocket.setCurrentWeight(18000);
//            }
//        }
//
//        return rockets;
//    }


    public  int runSimulation (ArrayList<Rocket> rockets) {

        int rocketsInTotal = 0;
        Rocket rocket = new U1();


        for (int r = 0; r < rockets.size(); r++) {
            rocket.launch();
            rocket.land();
            if (!rocket.launch() || (!rocket.land())) {
                r--;
                rocketsInTotal++;

            } else {
                rocketsInTotal++;
            }

        }


        return rocket.getCost() * rocketsInTotal;

    }

}
