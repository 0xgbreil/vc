public abstract class Vehicle {
    protected String id;
    protected int speed;
    protected String fuelType;
    protected double fuelLevel;
    protected String vehicleType;
    protected String brand;
    protected int modelYear;
    protected double engineCapacity;
    protected int seatingCapacity;
    protected String color;
    protected double price;
    protected boolean isElectric;
    protected double mileage;
    protected double weight;
    protected boolean hasABS;
    protected boolean hasAirbags;
    protected String transmission;
    protected String fuelEfficiency;
    protected String location;
    protected boolean isAvailable;
    protected String owner;
    protected String registrationNumber;
    protected boolean isInsured;
    protected String serviceHistory;

    public Vehicle(String id, int speed, String fuelType, double fuelLevel, String vehicleType,
                   String brand, int modelYear, double engineCapacity, int seatingCapacity,
                   String color, double price, boolean isElectric, double mileage, double weight,
                   boolean hasABS, boolean hasAirbags, String transmission, String fuelEfficiency,
                   String location, boolean isAvailable, String owner, String registrationNumber,
                   boolean isInsured, String serviceHistory) {
        this.id = id;
        this.speed = speed;
        this.fuelType = fuelType;
        this.fuelLevel = fuelLevel;
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.modelYear = modelYear;
        this.engineCapacity = engineCapacity;
        this.seatingCapacity = seatingCapacity;
        this.color = color;
        this.price = price;
        this.isElectric = isElectric;
        this.mileage = mileage;
        this.weight = weight;
        this.hasABS = hasABS;
        this.hasAirbags = hasAirbags;
        this.transmission = transmission;
        this.fuelEfficiency = fuelEfficiency;
        this.location = location;
        this.isAvailable = isAvailable;
        this.owner = owner;
        this.registrationNumber = registrationNumber;
        this.isInsured = isInsured;
        this.serviceHistory = serviceHistory;
    }

    public abstract void move();

    public void showDetails() {
        String[] properties = {
                "Vehicle ID", this.id,
                "Vehicle Type", this.vehicleType,
                "Brand", this.brand,
                "Model Year", String.valueOf(this.modelYear),
                "Engine Capacity", this.engineCapacity + "L",
                "Seating Capacity", String.valueOf(this.seatingCapacity) + " persons",
                "Color", this.color,
                "Price", "$" + this.price,
                "Electric Vehicle", (this.isElectric ? "Yes" : "No"),
                "Mileage", this.mileage + " km",
                "Weight", this.weight + " kg",
                "ABS", (this.hasABS ? "Yes" : "No"),
                "Airbags", (this.hasAirbags ? "Yes" : "No"),
                "Transmission", this.transmission,
                "Fuel Efficiency", this.fuelEfficiency,
                "Location", this.location,
                "Available for use", (this.isAvailable ? "Yes" : "No"),
                "Owner", this.owner,
                "Registration Number", this.registrationNumber,
                "Insured", (this.isInsured ? "Yes" : "No"),
                "Service History", this.serviceHistory,
                "Speed", this.speed + " km/h",
                "Fuel Level", this.fuelLevel + "%"
        };

        for (int i = 0; i < properties.length; i += 2) {
            System.out.println(properties[i] + ": " + properties[i + 1]);
        }
    }
}
