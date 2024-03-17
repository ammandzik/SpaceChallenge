import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Simulation spaceShipSimulation = new Simulation();


        ArrayList <Item> phase1 = new ArrayList<>();
        ArrayList <Item> phase2 = new ArrayList<>();

        phase1 = spaceShipSimulation.loadItems("/home/amanda/IdeaProjects/SpaceChallenge/Phase_1");
        phase2 = spaceShipSimulation.loadItems("/home/amanda/IdeaProjects/SpaceChallenge/Phase_2");

        ArrayList <Rocket> rocketU1PhaseOne = spaceShipSimulation.loadU1(phase1);
        ArrayList <Rocket> rocketU2PhaseOne = spaceShipSimulation.loadU2(phase1);
        ArrayList <Rocket> rocketU1PhaseTwo = spaceShipSimulation.loadU1(phase2);
        ArrayList <Rocket> rocketU2PhaseTwo = spaceShipSimulation.loadU2(phase2);



        int totalBudgetForU1 = 0;
        int totalBudgetForU2 = 0;




        totalBudgetForU1 += spaceShipSimulation.runSimulation(rocketU1PhaseOne);

        totalBudgetForU2 += spaceShipSimulation.runSimulation(rocketU2PhaseOne);

        totalBudgetForU1 += spaceShipSimulation.runSimulation(rocketU1PhaseTwo);

        totalBudgetForU2 += spaceShipSimulation.runSimulation(rocketU2PhaseTwo);



        System.out.println("Total budget for U1 rockets is " + totalBudgetForU1+"mln $"+ " and for U2 rockets " + totalBudgetForU2+"mln $");

        Rocket rocketX = new U1();
        System.out.println(rocketX.land());










    }


}
