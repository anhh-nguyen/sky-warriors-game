package the.SkyWarriors;

public class SimpleTower extends Tower {
    private int easyPrice;
    private int mediumPrice;
    private int hardPrice;
    private String name;
    private String description;
    public SimpleTower() {
        this.easyPrice = 100;
        this.mediumPrice = 250;
        this.hardPrice = 350;
        this.name = "Nop";
        this.description = "Reduce enemy health by 10";
        this.powerValue = 1;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public int getPrice(String difficulty) {
        if (difficulty.equals("Easy")) {
            return easyPrice;
        } else if (difficulty.equals("Medium")) {
            return mediumPrice;
        } else {
            return hardPrice;
        }
    }
}
