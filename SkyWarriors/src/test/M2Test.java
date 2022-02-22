package the.SkyWarriors.test;

import the.SkyWarriors.*;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.matcher.control.LabeledMatchers;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(ApplicationExtension.class)
public class M2Test {

    private FxRobot robot = new FxRobot();
    @BeforeEach
    public void setup() throws Exception {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(Application.class);
    }

    @Test public void emptyName() {
        FxAssert.verifyThat("#startBtn", LabeledMatchers.hasText("Start Game"));
        robot.clickOn("#startBtn");
        robot.clickOn("#submitBtn");
        Node dialogPane = robot.lookup(".dialog-pane").query();
        robot.from(dialogPane).lookup((Text t) -> t.getText().startsWith("Name cannot be"));
        robot.clickOn("OK");
    }

    @Test public void numDifficultyOptions() {
        FxAssert.verifyThat("#startBtn", LabeledMatchers.hasText("Start Game"));
        robot.clickOn("#startBtn");
        ComboBox<String> comboBox = robot.lookup("#diffCombo").query();
        assertTrue(comboBox.getItems().size() >= 3);
    }

    @Test public void easyScreenAccess() {
        FxAssert.verifyThat("#startBtn", LabeledMatchers.hasText("Start Game"));
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#submitBtn");
        FxAssert.verifyThat("#health", LabeledMatchers.hasText("♥ 150"));
        FxAssert.verifyThat("#money", LabeledMatchers.hasText("$ 2000"));
    }

    @Test public void mediumScreenAccess() {
        FxAssert.verifyThat("#startBtn", LabeledMatchers.hasText("Start Game"));
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#diffCombo");
        robot.clickOn("Medium");
        robot.clickOn("#submitBtn");
        FxAssert.verifyThat("#health", LabeledMatchers.hasText("♥ 100"));
        FxAssert.verifyThat("#money", LabeledMatchers.hasText("$ 1200"));
    }

    @Test public void hardScreenAccess() {
        FxAssert.verifyThat("#startBtn", LabeledMatchers.hasText("Start Game"));
        robot.clickOn("#startBtn");
        robot.write("test");
        robot.clickOn("#diffCombo");
        robot.clickOn("Hard");
        robot.clickOn("#submitBtn");
        FxAssert.verifyThat("#health", LabeledMatchers.hasText("♥ 50"));
        FxAssert.verifyThat("#money", LabeledMatchers.hasText("$ 500"));
    }

}