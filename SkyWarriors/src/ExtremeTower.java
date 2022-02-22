package the.SkyWarriors;

public class ExtremeTower extends Tower {
    private int easyPrice;
    private int mediumPrice;
    private int hardPrice;
    private String name;
    private String description;
    public ExtremeTower() {
        this.easyPrice = 500;
        this.mediumPrice = 600;
        this.hardPrice = 700;
        this.name = "Lop";
        this.description = "Reduce enemy health by 40";
        this.powerValue = 3;

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