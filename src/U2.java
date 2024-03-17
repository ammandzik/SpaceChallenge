public class U2 extends Rocket {

    U2 () {

        setCost(120);
        setWeight(18000);
        setMaxWeight(29000);
        setCurrentWeight(18000);

    }


    public  boolean launch () {

        chanceOfExplosion = 0.04 * (double) ( (getCurrentWeight() - getWeight()) / (getMaxWeight() - getWeight()));


        return true;

    }

    public  boolean land () {

        chanceOfLandingFailure = 0.08 * (double) ( (getCurrentWeight() - getWeight()) / (getMaxWeight() - getWeight()));


        return true;



    }

}
