package the.SkyWarriors;

import javafx.animation.Transition;

import java.awt.*;
import java.util.ArrayList;

public class Player {

    private int money;
    private int health;
    private ArrayList<Tower> towers;
    private ArrayList<Enemy> enemies;
    private ArrayList<Transition> transitions;
    private String difficulty;
    private boolean animationStarted;
    private int enemiesKilled = 0;
    private int timeTaken = 0;
    private int leftoverMoney = 0;
    private int numtowersPlaced = 0;



    public int getEnemiesKilled() {
        return enemiesKilled;
    }

    public void setEnemiesKilled(int enemiesKilled) {
        this.enemiesKilled = enemiesKilled;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }

    public int getLeftoverMoney() {
        return leftoverMoney;
    }

    public void setLeftoverMoney(int leftoverMoney) {
        this.leftoverMoney = leftoverMoney;
    }

    public int getNumtowersPlaced() {
        return numtowersPlaced;
    }

    public void setNumtowersPlaced(int numtowersPlaced) {
        this.numtowersPlaced = numtowersPlaced;
    }

    public Player(String difficulty) {
        this.towers = new ArrayList<Tower>();
        this.difficulty = difficulty;
        if (difficulty.equals("Easy")) {
            this.money = 2000;
            this.health = 150;
        } else if (difficulty.equals("Medium")) {
            this.money = 1200;
            this.health = 100;
        } else {
            this.money = 500;
            this.health = 50;
        }
    }

    public String getDifficulty() {

        return difficulty;
    }

    public void buyTower(Tower tower) {
        if (tower.getPrice(difficulty) <= money) {
            this.towers.add(tower);
            this.money -= tower.getPrice(difficulty);
        } /* else {
            //show error box
        } */
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public int getHealth() {

        return health;
    }

    public boolean getAnimationStarted() {

        return animationStarted;
    }

    public void setAnimationStarted(boolean animationStarted) {

        this.animationStarted = animationStarted;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int newMoney) {
        this.money = newMoney;
    }

    public ArrayList<Tower> getTowers() {
        return towers;
    }
    public void setTowers(ArrayList<Tower> towers) {
        this.towers = towers;
    }
    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }
    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }
    public ArrayList<Transition> getTransitions() {
        return transitions;
    }
    public void setTransitions(ArrayList<Transition> transitions) {
        this.transitions = transitions;
    }

    public void takeAttack(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        /*
        if (enemy.getType().equals("Simple")) {
            this.health--;
        } else if (enemy.getType().equals("Normal")) {
            this.health -= 2;
        } else if (enemy.getType().equals("Extreme")) {
            this.health -= 3;
        }*/
    }
}