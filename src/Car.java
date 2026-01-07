public class Car extends Vehicle {

    private Engine engine;

    public Car(
            String id,
            int speed,
            String fuelType,
            double fuelLevel,
            String vehicleType,
            String brand,
            int modelYear,
            double engineCapacity,
            int seatingCapacity,
            String color,
            double price,
            boolean isElectric,
            double mileage,
            double weight,
            boolean hasABS,
            boolean hasAirbags,
            String transmission,
            String fuelEfficiency,
            String location,
            boolean isAvailable,
            String owner,
            String registrationNumber,
            boolean isInsured,
            String serviceHistory,
            Engine engine
    ) {
        super(
            id, speed, fuelType, fuelLevel, vehicleType, brand, modelYear,
            engineCapacity, seatingCapacity, color, price, isElectric,
            mileage, weight, hasABS, hasAirbags, transmission,
            fuelEfficiency, location, isAvailable, owner,
            registrationNumber, isInsured, serviceHistory
        );

        this.engine = engine;
    }

    @Override
    public void move() {
        System.out.println(
            "Car is moving with engine capacity "
            + engine.getEngineCapacity()
            + "L at speed "
            + speed + " km/h"
        );
    }
}
