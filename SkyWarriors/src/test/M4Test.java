package the.SkyWarriors.test;

import the.SkyWarriors.*;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.matcher.control.LabeledMatchers;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(ApplicationExtension.class)
public class M4Test extends ApplicationTest {

    private FxRobot robot = new FxRobot();

    @BeforeEach
    public void setup() throws Exception {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(Application.class);
    }

    @Test public void playButtonVisible() {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        FxAssert.verifyThat("#startCombat", LabeledMatchers.hasText("Start Combat"));
    }

    @Test public void enemiesNotVisibleStart() {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
    }

    @Test public void playButtonStartsAnimation() throws Exception {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        assertTrue(!user.getAnimationStarted());
        robot.clickOn("#startCombat");
        assertTrue(user.getAnimationStarted());
    }

    @Test public void enemyMovement() {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        robot.clickOn("#startCombat");
    }

    @Test public void enemyReducesHealth() throws InterruptedException {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        int health = user.getHealth();
        robot.clickOn("#startCombat");
        TimeUnit.SECONDS.sleep(4);
        assertTrue(user.getHealth() < health);
    }

    @Test public void enemiesLockOut() {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        int health = user.getHealth();
        robot.clickOn("#startCombat");
        int money = user.getMoney();
        robot.clickOn("#towerTwo");
        assertTrue(user.getMoney() < money);
    }

    @Test public void enemyMap() {
        Image background = new Image("the/SkyWarriors/mappath.png");
        PixelReader pixelReader = background.getPixelReader();
        Color pathColor = Color.web("#869595", 1.0);

        assertTrue(pixelReader.getColor(4, 330 + 15).equals(pathColor));
        assertTrue(pixelReader.getColor(265, 330 + 15).equals(pathColor));
        assertTrue(pixelReader.getColor(265, 330 - 150).equals(pathColor));
        assertTrue(pixelReader.getColor(460, 330 - 150).equals(pathColor));
        assertTrue(pixelReader.getColor(460, 330 + 150).equals(pathColor));
        assertTrue(pixelReader.getColor(660, 330 + 150).equals(pathColor));
        assertTrue(pixelReader.getColor(660, 330 - 3).equals(pathColor));
        assertTrue(pixelReader.getColor(804, 330 - 3).equals(pathColor));
    }

    @Test public void endScreenAppearsHealth0() throws InterruptedException {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        robot.clickOn("#startCombat");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        TimeUnit.SECONDS.sleep(6);
        assertEquals(user.getHealth(), 0);
    }

    @Test public void endScreenStart() throws InterruptedException {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        robot.clickOn("#startCombat");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        TimeUnit.SECONDS.sleep(6);
        robot.clickOn("#startBtn");
        FxAssert.verifyThat("#startBtn", LabeledMatchers.hasText("Start Game"));

    }

    @Test public void endScreenQuit() throws InterruptedException {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        robot.clickOn("#startCombat");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        TimeUnit.SECONDS.sleep(6);
        robot.clickOn("#exitBtn");

    }
}