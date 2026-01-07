public class Engine {

    private double engineCapacity;
    private String fuelType;

    public Engine(double engineCapacity, String fuelType) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }
}
