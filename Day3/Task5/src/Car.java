public class Car extends Vehicle {
    public String carType;
    public int maxSpeed;
    public int maxGear;

    public Car(String carType, int maxSpeed){
        super();
        this.carType = carType;
        this.maxSpeed = maxSpeed;
        this.maxGear = maxSpeed / 20 + 1;

    }

    public void Start() {
        if (!GetStartEngine()) {
            GearUp();
            SetStartEngine(true);
            System.out.println("Engine has been started");
        } else {
            System.out.println("Engine already has been started");
        }
    }
    public void SpeedUpCar() {
        if (GetStartEngine()) {
            GearUp();
            SpeedUp();
            if (GetSpeed() >= this.maxSpeed) {
                System.out.println("You have reached maximum speed");
                SetSpeed(this.maxSpeed);
                SetGear(this.maxGear);
            }
        } else {
            System.out.println("Engine is not started. Please start the engine");
        }
    }

    public void SpeedDownCar() {
        if (GetStartEngine()) {
            GearDown();
            SpeedDown();
            if (GetSpeed() <= 0) {
                System.out.println("Your speed is null. Please stop the engine");
                SetSpeed(0);
                SetGear(1);
            }
        } else {
            System.out.println("Engine is not started. Please start the engine");
        }
    }

    public void Stop() {
        if (GetStartEngine()) {
            SetSpeed(0);
            SetGear(0);
            SetStartEngine(false);
            System.out.println("Engine has been stopped");
        } else {
            System.out.println("Engine already has been stopped");
        }
    }

    @Override
    public String toString() {
        return "Car Type: " + this.carType + ", Max Speed: " + this.maxSpeed + ", Max Gear: " + this.maxGear + "\n" + super.toString();
    }
}
