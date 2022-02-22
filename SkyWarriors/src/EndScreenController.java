package the.SkyWarriors;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.stage.Window;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EndScreenController {

    @FXML
    private Rectangle rectangle;

    @FXML
    private Button exitBtn;

    @FXML
    private Label staticMoney;

    @FXML
    private Label staticEnemies;



    @FXML
    private Label staticTowers;

    @FXML
    private Label enemieskilledLabel;



    @FXML
    private Label leftmoneyLabel;

    @FXML
    private Label towerplacedLabel;

    @FXML
    private Rectangle rec;


    private Player player;


    @FXML
    void initialize() {
        List<Window> open = Stage.getWindows().stream().filter(Window::isShowing).collect(Collectors.toList());
        staticMoney.setVisible(true);
        staticTowers.setVisible(true);
        rec.setVisible(true);
        staticEnemies.setVisible(true);

        enemieskilledLabel.setVisible(true);
        leftmoneyLabel.setVisible(true);

        towerplacedLabel.setVisible(true);
        player = (Player) open.get(0).getUserData();
        towerplacedLabel.setText("" + player.getTowers().size());
        leftmoneyLabel.setText("" + player.getMoney());
        enemieskilledLabel.setText("" + player.getEnemiesKilled());
    }


    @FXML
    protected void onStartBtn(ActionEvent event) throws IOException {
        Parent secondScreenParent = FXMLLoader.load(getClass().getResource("firstScreen.fxml"));
        Scene secondScreenScene = new Scene(secondScreenParent, 825, 660);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(secondScreenScene);
        appStage.setResizable(false);
        appStage.show();
    }
    @FXML
    protected void onExitBtn(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        stage.close();
    }
}
