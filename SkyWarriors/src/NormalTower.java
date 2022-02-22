package the.SkyWarriors;

public class NormalTower extends Tower {
    private int easyPrice;
    private int mediumPrice;
    private int hardPrice;
    private String name;
    private String description;
    public NormalTower() {
        this.easyPrice = 150;
        this.mediumPrice = 350;
        this.hardPrice = 450;
        this.name = "Mop";
        this.description = "Reduce enemy health by 20";
        this.powerValue = 2;
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