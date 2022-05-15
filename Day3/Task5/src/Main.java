public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);
        vehicle.SpeedUp();
        vehicle.GearUp();
        System.out.println(vehicle);
        vehicle.SpeedDown();
        vehicle.GearDown();
        System.out.println(vehicle);
        System.out.println();

        Car car = new Car("truck", 25);
        System.out.println(car);
        car.SpeedUpCar();
        car.SpeedDownCar();
        System.out.println(car);
        car.Start();
        car.Start();
        System.out.println(car);
        car.SpeedUpCar();
        System.out.println(car);
        car.SpeedUpCar();
        System.out.println(car);
        car.SpeedDownCar();
        System.out.println(car);
        car.SpeedDownCar();
        System.out.println(car);
        car.Stop();
        car.Stop();
        System.out.println(car);
        car.SpeedUpCar();
        System.out.println(car);
        System.out.println();

        SpecificCar bmw = new SpecificCar("BMW", "car", 240);
        System.out.println(bmw);
        bmw.SpeedUpCar();
        System.out.println(bmw);
        bmw.Start();
        bmw.Start();
        for (int i = 1; i <= 15; i++)
        {
            bmw.SpeedUpCar();
        }
        System.out.println(bmw);
        bmw.SpeedDownCar();
        System.out.println(bmw);
        bmw.Stop();
        System.out.println(bmw);
    }
}