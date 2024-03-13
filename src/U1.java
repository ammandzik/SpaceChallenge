public class U1 extends Rocket {

    U1 () {

        setCost(100000);
        setWeight(10000);
        setMaxWeight(18000);
        setCurrentWeight(10000);


    }

    public  boolean launch () {

        chanceOfExplosion = 0.05 * (double) ( (getCurrentWeight() - getWeight()) / (getMaxWeight() - getWeight()));

        return chanceOfExplosion <= Math.random() * 0.1;

    }

    public  boolean land () {

        chanceOfLandingFailure = 0.01 * (double) ( (getCurrentWeight() - getWeight()) / (getMaxWeight() - getWeight()));

        return chanceOfLandingFailure <= Math.random() * 0.1;

    }






}
