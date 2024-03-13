import java.io.FileNotFoundException;
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

            String line = itemsFile1.nextLine();
            String [] singleItem = line.split("=");
            items.add(new Item(singleItem[0], Integer.valueOf(singleItem[1])));
        }


        return items;
    }

    public  void loadU1 (){


    }

    public  void loadU2 () {

    }

    public  void runSimulation () {

    }


}
