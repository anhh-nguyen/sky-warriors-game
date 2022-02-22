//package SkyWarriors;
//
//import SkyWarriors.Enemy;
//
//public class Monument {
//    private int health;
//
//    public Monument() {
//        this("Super Easy");
//    }
//
//    public Monument(String difficulty) {
//        if (difficulty.equals("Super Easy")) {
//            this.health = 10;
//        } else if (difficulty.equals("Easy")) {
//            this.health = 150;
//        } else if (difficulty.equals("Medium")) {
//            this.health = 100;
//        } else {
//            this.health = 50;
//        }
//    }
//
//    public int getHealth() {
//        return health;
//    }
//
//    public void takeAttack(Enemy enemy) {
//        if (enemy.getType().equals("Simple")) {
//            health--;
//        } else if (enemy.getType().equals("Normal")) {
//            health -= 2;
//        } else if (enemy.getType().equals("Extreme")) {
//            health -= 3;
//        }
//
//        if (health == 0) {
//            //trigger lose state
//        }
//    }
//}