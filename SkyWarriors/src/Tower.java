package the.SkyWarriors;

public abstract class Tower {
    protected int easyPrice;
    protected int mediumPrice;
    protected int hardPrice;
    abstract int getPrice(String difficulty);
    protected int radius = 150;
    protected int powerValue;
    protected boolean gameState = true;
    protected long lastAttackClock = 0;
    protected double x;
    protected double y;
    protected String name;

    public double getX() {
        return x;
    }
    public long getLastAttackClock() {
        return lastAttackClock;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setLastAttackClock(long lastAttackClock) {
        this.lastAttackClock = lastAttackClock;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setGameState(boolean gameState) {
        this.gameState = gameState;
    }
    public boolean getGameState() {
        return gameState;
    }
    public int getDamage() {return powerValue;}
    public void setDamage(int p) {this.powerValue = p;}
    public String getName() {return name;}
}
