/**
 * Created by Lawrence on 10/17/15.
 */
public class CoffeeBrewer extends Product{
    private String model;
    private String waterSupply;
    private int numberOfCups;

    public CoffeeBrewer(String initialCode, String initialDescription, double initialPrice, String initialModel, String initialWaterSupply, int initialNumberOfCups) {
        super(initialCode, initialDescription, initialPrice);
        model = initialModel;
        waterSupply = initialWaterSupply;
        numberOfCups = initialNumberOfCups;
    }
    public String getModel() {
        return model;
    }

    public String getWaterSupply() {
        return waterSupply;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    @Override
    public String toString() {
        return super.toString() + "_" + model + "_" + waterSupply + "_" + numberOfCups;
    }
}
