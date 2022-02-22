package the.SkyWarriors.test;
import java.util.concurrent.TimeUnit;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import the.SkyWarriors.Application;
import the.SkyWarriors.ExtremeTower;
import the.SkyWarriors.NormalTower;
import the.SkyWarriors.Player;
import the.SkyWarriors.SimpleTower;
import the.SkyWarriors.Tower;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(ApplicationExtension.class)
public class M3Test extends ApplicationTest {

    private FxRobot robot = new FxRobot();

    @BeforeEach
    public void setup() throws Exception {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(Application.class);
    }

    @Test public void moneyBelowZero() {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        Stage stage = (Stage) robot.window(0);
        Player player = (Player) stage.getUserData();
        player.setMoney(100);
        stage.setUserData(player);
        robot.drag("#towerTwo").dropTo(1000, 500);
        assertTrue(((Player) stage.getUserData()).getMoney() >= 0);
    }

    @Test public void dropTowerOnPath() throws Exception {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        Stage stage = (Stage) robot.window(0);
        robot.drag("#towerTwo").dropTo(1000, 500);
        Tower tower = ((Player) stage.getUserData()).getTowers().get(0);
        TimeUnit.SECONDS.sleep(2);
    }

    @Test public void towerMoneyReduced() {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        int preMoney = user.getMoney();
        robot.drag("#towerTwo").dropTo(1000, 500);
        int postMoney = user.getMoney();
        assertTrue(preMoney > postMoney);
    }

    @Test public void easyTowerCosts() {

        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        SimpleTower tower0 = new SimpleTower();
        NormalTower tower1 = new NormalTower();
        ExtremeTower tower2 = new ExtremeTower();

        assertEquals(tower0.getPrice(user.getDifficulty()), 100);
        assertEquals(tower1.getPrice(user.getDifficulty()), 150);
        assertEquals(tower2.getPrice(user.getDifficulty()), 500);
    }

    @Test public void mediumTowerCosts() {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#diffCombo");
        robot.clickOn("Medium");
        robot.clickOn("#submitBtn");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        SimpleTower tower0 = new SimpleTower();
        NormalTower tower1 = new NormalTower();
        ExtremeTower tower2 = new ExtremeTower();

        assertEquals(tower0.getPrice(user.getDifficulty()), 250);
        assertEquals(tower1.getPrice(user.getDifficulty()), 350);
        assertEquals(tower2.getPrice(user.getDifficulty()), 600);
    }

    @Test public void hardTowerCosts() {
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#diffCombo");
        robot.clickOn("Hard");
        robot.clickOn("#submitBtn");
        Stage stage = (Stage) robot.window(0);
        Player user = ((Player) stage.getUserData());
        SimpleTower tower0 = new SimpleTower();
        NormalTower tower1 = new NormalTower();
        ExtremeTower tower2 = new ExtremeTower();

        assertEquals(tower0.getPrice(user.getDifficulty()), 350);
        assertEquals(tower1.getPrice(user.getDifficulty()), 450);
        assertEquals(tower2.getPrice(user.getDifficulty()), 700);
    }

    @Test public void threeTowers() {
        Tower tower0 = new SimpleTower();
        Tower tower1 = new NormalTower();
        Tower tower2 = new ExtremeTower();
    }

    @Test public void nameNotBlank() {
        SimpleTower sTower = new SimpleTower();
        NormalTower nTower = new NormalTower();
        ExtremeTower eTower = new ExtremeTower();

        String sTowerName = sTower.getName();
        assertTrue(!sTowerName.isEmpty());

        String nTowerName = nTower.getName();
        assertTrue(!nTowerName.isEmpty());

        String eTowerName = eTower.getName();
        assertTrue(!eTowerName.isEmpty());
    }

    @Test public void descriptionNonBlank() {
        SimpleTower sTower = new SimpleTower();
        NormalTower nTower = new NormalTower();
        ExtremeTower eTower = new ExtremeTower();
        String sTowerDesc = sTower.getDescription();
        assertTrue(!sTowerDesc.isEmpty());
        String nTowerDesc = nTower.getDescription();
        assertTrue(!nTowerDesc.isEmpty());
        String eTowerDesc = eTower.getDescription();
        assertTrue(!eTowerDesc.isEmpty());
    }

    @Test public void towerDescription() {
        SimpleTower sTower = new SimpleTower();
        NormalTower nTower = new NormalTower();
        ExtremeTower eTower = new ExtremeTower();
        String sTowerDesc = sTower.getDescription();
        String nTowerDesc = nTower.getDescription();
        String eTowerDesc = eTower.getDescription();
        assertTrue(!sTowerDesc.equals(nTowerDesc)
                && !sTowerDesc.equals(eTowerDesc) && !nTowerDesc.equals(eTowerDesc));

    }
}