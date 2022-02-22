package the.SkyWarriors.test;

import javafx.animation.Transition;
import javafx.scene.Node;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.matcher.control.LabeledMatchers;
import the.SkyWarriors.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testfx.matcher.base.NodeMatchers.isVisible;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

@ExtendWith(ApplicationExtension.class)
public class M6Test extends ApplicationTest {

    private FxRobot robot = new FxRobot();

    @BeforeEach
    public void setup() throws Exception {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(Application.class);
        robot.clickOn("#startBtn");
        robot.clickOn("#nameField");
        robot.write("test");
        robot.clickOn("#submitBtn");
    }

    @Test public void finalBossDifferent() {
        SimpleEnemy e = new SimpleEnemy();
        int eHealth = e.getHealth();
        NormalEnemy e1 = new NormalEnemy();
        int e1Health = e1.getHealth();
        ExtremeEnemy e2 = new ExtremeEnemy();
        int e2Health = e2.getHealth();
        FinalBoss b = new FinalBoss();
        int bHealth = b.getHealth();
        assertTrue((bHealth != eHealth) && (bHealth != e1Health) && (bHealth != e2Health));
    }

    @Test public void upgradeReduceMoney() {
        robot.drag("#towerOne").dropTo(400, 400);
        robot.clickOn("#startCombat");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        int preMoney = user.getMoney();
        robot.clickOn("#upgrade");
        int postMoney = user.getMoney();
        assertTrue(preMoney != postMoney);

    }

    @Test public void upgradeChangeAttribute() {
        robot.drag("#towerOne").dropTo(400, 400);
        robot.clickOn("#startCombat");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        int preDamage = user.getTowers().get(0).getDamage();
        robot.clickOn("#upgrade");
        int postDamage = user.getTowers().get(0).getDamage();
        assertTrue(preDamage != postDamage);
    }

    @Test public void finalBossNotBeginning() throws InterruptedException{
        robot.drag("#towerOne").dropTo(400, 400);
        robot.clickOn("#startCombat");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        TimeUnit.SECONDS.sleep(2);
        assertTrue((user.getTransitions().get(user.getTransitions().size()-1).getDelay().toSeconds()-2) > 0);
    }

    @Test public void finalBossVisuallyDistinct() throws InterruptedException{
        robot.clickOn("#startCombat");
        TimeUnit.SECONDS.sleep(9);
    }

    @Test public void finalBossToWinScreen() throws InterruptedException{
        robot.drag("#towerThree").dropTo(400, 400);
        robot.clickOn("#startCombat");
        TimeUnit.SECONDS.sleep(10);
    }

    @Test public void winScreenToNewGame() throws InterruptedException {
        robot.drag("#towerThree").dropTo(400, 400);
        robot.clickOn("#startCombat");
        TimeUnit.SECONDS.sleep(5);
        robot.clickOn("#startBtn");
        FxAssert.verifyThat("#startBtn", hasText("Start Game"));
    }

    @Test public void winScreenExit() throws InterruptedException {
        robot.drag("#towerThree").dropTo(400, 400);
        robot.clickOn("#startCombat");
        TimeUnit.SECONDS.sleep(10);
        robot.clickOn("#exitBtn");
    }

    @Test public void winScreenStatistics() throws InterruptedException {
        robot.drag("#towerThree").dropTo(400, 400);
        robot.clickOn("#startCombat");
        TimeUnit.SECONDS.sleep(10);
        FxAssert.verifyThat("#enemieskilledLabel", isVisible());
        FxAssert.verifyThat("#leftmoneyLabel", isVisible());
        FxAssert.verifyThat("#towerplacedLabel", isVisible());
    }

    @Test public void endScreenStatistics() throws InterruptedException {
        robot.clickOn("#startCombat");
        TimeUnit.SECONDS.sleep(12);
        FxAssert.verifyThat("#enemieskilledLabel", isVisible());
        FxAssert.verifyThat("#leftmoneyLabel", isVisible());
        FxAssert.verifyThat("#towerplacedLabel", isVisible());
    }
}