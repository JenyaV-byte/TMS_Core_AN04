package Lesson4.HomeWork;

public class CarCreatingRunning {
    public static void main(String[] args) {
        CarCreating carCreating = new CarCreating();
        carCreating.setFuel(10);
        carCreating.getEngine();
        carCreating.cantRunning();
        carCreating.setDistance(0);
        carCreating.startEngine();
        carCreating.run();
        carCreating.engineTurnedOff();
        Integer fuel = carCreating.getFuel();
        Integer distance = carCreating.getDistance();
        System.out.println(carCreating.getFuel());
        System.out.println("Covered distance " + carCreating.getDistance());
        carCreating.startEngine();
        carCreating.run();
        carCreating.setFuel(20);
        carCreating.engineTurnedOff();
        System.out.println(carCreating.getFuel());
        System.out.println("Covered distance " + carCreating.getDistance());
        int sumDistance = carCreating.getDistance();
        System.out.println("Total distance covered " + sumDistance);
        int sumfuel = carCreating.getFuel();
        System.out.println("Fuel residue " + sumfuel);






    }
}
