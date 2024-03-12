public class Rocket implements SpaceShip {

    private int cost;
    private int weight;
    private int maxWeight;
    private int currentWeight;
    private double chanceOfExplosion;
    private double chanceOfLandingFailure;

    // methods


    public boolean launch () {

        return true;

    }

    public  boolean land (){

        return true;
    }

    public  boolean canCarry (Item item) {

        return true;

    }

    public  void carry (Item item) {

    }

    // getters and setters in order to assign values in U1/U2

    public void setCost (int cost) {

        this.cost = cost;

    }

    public int getCost() {
        return cost;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;

    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setCurrentWeight (int currenWeight) {
        this.currentWeight = currenWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }













}
