package be.intecbrussel.cars;

public class ElectricalCar extends Car{
    private double batteryPercentage;

    public double getBatteryPercentage() {
        return batteryPercentage;
    }

    public void charge() {
        while (batteryPercentage<100){
            batteryPercentage++;
            System.out.println("Battery:"+batteryPercentage);
        }
        System.out.println("Car is charging."+batteryPercentage);
    }

    @Override
    public void accelerate(){
        System.out.println("batery is going lower");

    }

    @Override
    public void decelerate() {
        System.out.println("batery slowing down");
    }
}
