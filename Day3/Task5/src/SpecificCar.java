public class SpecificCar extends Car {
    public String carName;
    public int maxSpeed;
    public int maxGear;

    public SpecificCar(String carName, String carType, int maxSpeed){
        super(carType, maxSpeed);
        this.carName = carName;
        this.maxSpeed = maxSpeed;
        this.maxGear = maxSpeed / 20 + 1;
    }

    @Override
    public String toString() {
        return "Car Name: " + this.carName + ", " + super.toString();
    }
}

