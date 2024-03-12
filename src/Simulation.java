import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Simulation {


    public static void loadItems () throws FileNotFoundException {

        List <String> phase1 = new ArrayList<>();


        Scanner itemsFile1 = new Scanner(new File("/home/amanda/Desktop/Phase_1"));


        while (itemsFile1.hasNext()) {
            phase1.add(itemsFile1.nextLine());
            System.out.println(itemsFile1.nextLine());

        }




    }

    public static void loadU1 (){

    }

    public static void loadU2 () {

    }

    public static void runSimulation () {

    }


}
