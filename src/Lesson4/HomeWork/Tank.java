package Lesson4.HomeWork;

public class Tank {
    private Integer currentAmount;
    private final Integer maxAmount;

    public Tank(Integer maxAmount) {
        this.maxAmount = maxAmount;
        this.currentAmount = 0;
    }
    public void fill( int amount){
        if (currentAmount + amount <= maxAmount){
            currentAmount += amount;
        }
        else {
            System.out.println("Бензобак переаолнен");
        }
    }

    public Integer getCurrentAmount() {
        return currentAmount;
    }

    public Integer getMaxAmount() {
        return maxAmount;
    }
    public void wastedFuel ( int amout) {
        currentAmount -= amout;
    }
}
