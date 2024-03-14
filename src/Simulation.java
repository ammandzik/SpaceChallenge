import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Simulation {


    // creating arraylist of items from text file

    ArrayList <Item> loadItems () throws FileNotFoundException {

        ArrayList <Item> items = new ArrayList<>();

        Scanner itemsFile1 = new Scanner(new File("/home/amanda/Desktop/Phase_1"));

        while(itemsFile1.hasNext()) {

            Item item = new Item();

            String separateLine = itemsFile1.nextLine();
            String [] singleItem = separateLine.split("=");
            item.setName(singleItem[0]);
            item.setWeight(Integer.parseInt(singleItem[1]));


            items.add(item);

            // test items in ArrayList
            System.out.println(item.getWeight());
            System.out.println(item.getName());



        }

        return items;
    }

    public ArrayList <Rocket> loadU1 (ArrayList <Item> items) {

        ArrayList <Rocket> rockets = new ArrayList<>();
        Rocket rocketU1 = new U1();

        


        return rockets;
    }


    public ArrayList <Rocket> loadU2 (ArrayList <Item> items) {

        ArrayList <Rocket> rockets = new ArrayList<>();

        return rockets;

    }

    public  void runSimulation (ArrayList<Rocket> rockets) {


    }

    }
