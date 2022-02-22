package the.SkyWarriors;

public abstract class Enemy {
    protected String type;
    protected int health;
    protected double xPos;
    protected double yPos;
    protected double timeToMonument;
    protected double value;

    public double getTimeToMonument() {
        return timeToMonument;
    }

    public void setSpeed(double timeToMonument) {
        this.timeToMonument = timeToMonument;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    public String getType() {
        return type;
    }

    public void takeAttack(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }

        //if (health == 0) {
        //remove from map
        //}
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }
}