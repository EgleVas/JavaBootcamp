public class Vehicle {
    public int speed;
    public int gear;
    public boolean startEngine;


    public Vehicle() {
        this.speed = 0;
        this.gear = 0;
        this.startEngine = false;
    }

    public int GetSpeed() {
        return this.speed;
    }

    public void SetSpeed(int speed) {
        this.speed = speed;
    }

    public void SetGear(int gear) {
        this.gear = gear;
    }

    public boolean GetStartEngine() {
        return this.startEngine;
    }

    public void SetStartEngine(boolean Engine) {
        this.startEngine = Engine;
    }

    public void SpeedUp() {
        this.speed += 20;
    }

    public void SpeedDown() {
        this.speed -= 20;
    }

    public int GearUp() {
        return this.gear++;
    }

    public void GearDown() {
        this.gear--;
    }

    public String toString() {
        return "Speed: " + this.speed + ", Gear: " + this.gear;
    }
}
