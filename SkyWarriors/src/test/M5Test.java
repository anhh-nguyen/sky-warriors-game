package the.SkyWarriors.test;

import javafx.animation.Transition;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import the.SkyWarriors.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(ApplicationExtension.class)
public class M5Test extends ApplicationTest {

    private FxRobot robot = new FxRobot();

    @BeforeEach
    public void setup() throws Exception {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(Application.class);
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
    }

    @Test public void enemySpeedEasy() {
        SimpleEnemy e = new SimpleEnemy();
        assertEquals(e.getTimeToMonument(), 9);
    }

    @Test public void enemySpeedMedium() {
        NormalEnemy e = new NormalEnemy();
        assertEquals(e.getTimeToMonument(), 7);
    }

    @Test public void enemySpeedHard() {
        ExtremeEnemy e = new ExtremeEnemy();
        assertEquals(e.getTimeToMonument(), 5);
    }

    @Test public void towerStrengthEasy() {
        SimpleTower t = new SimpleTower();
        assertEquals(t.getDamage(), 1);
    }

    @Test public void towerStrengthMedium() {
        NormalTower t = new NormalTower();
        assertEquals(t.getDamage(), 2);
    }

    @Test public void towerStrengthHard() {
        ExtremeTower t = new ExtremeTower();
        assertEquals(t.getDamage(), 3);
    }

    @Test public void deadEnemyMovement() throws InterruptedException {
        robot.drag("#towerThree").dropTo(400, 400);
        robot.clickOn("#startCombat");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        TimeUnit.SECONDS.sleep(5);
        ArrayList<Enemy> enemies = user.getEnemies();
        ArrayList<Transition> transitions = user.getTransitions();
        for (int i = 0; i < transitions.size(); i++) {
            Enemy enemy = enemies.get(i);
            Transition transition = transitions.get(i);
            if (enemy.getHealth() == 0) {
                if (transition.getRate() == 0) {
                    break;
                }
            }
        }
    }

    @Test public void enemyLoseHealthHit() throws InterruptedException {
        robot.drag("#towerThree").dropTo(400, 400);
        robot.clickOn("#startCombat");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        TimeUnit.SECONDS.sleep(6);
        ArrayList<Enemy> enemies = user.getEnemies();
        ArrayList<Transition> transitions = user.getTransitions();
        for (int i = 0; i < transitions.size(); i++) {
            Enemy enemy = enemies.get(i);
            Transition transition = transitions.get(i);
            if (enemy.getHealth() == 0) {
                break;
            }
        }
    }

    @Test public void deadEnemyIncreaseMoney() throws InterruptedException {
        robot.drag("#towerThree").dropTo(400, 400);
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        int money = user.getMoney();
        robot.clickOn("#startCombat");
        TimeUnit.SECONDS.sleep(3);
        assertTrue(user.getMoney() > money);
    }

    @Test public void proximity() throws InterruptedException {
        robot.drag("#towerThree").dropTo(1000, 500);
        robot.clickOn("#startCombat");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        TimeUnit.SECONDS.sleep(3);
        ArrayList<Enemy> enemies = user.getEnemies();
        ArrayList<Transition> transitions = user.getTransitions();
        int totalHealth = 0;
        for (int i = 0; i < transitions.size(); i++) {
            Enemy enemy = enemies.get(i);
            totalHealth += enemy.getHealth();
        }
        assertTrue(totalHealth > 0);
    }
}