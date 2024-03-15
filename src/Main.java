import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // test

        Rocket U1 = new U1();
        System.out.println(U1.land());
        System.out.println(U1.launch());

        Simulation test = new Simulation();

        System.out.println(test.loadItems());





    }


}
