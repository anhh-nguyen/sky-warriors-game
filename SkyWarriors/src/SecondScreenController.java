package the.SkyWarriors;
// import Player.java;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Alert;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SecondScreenController {
    @FXML
    private AnchorPane root;
    @FXML
    private VBox vbox;
    @FXML
    private HBox nameBox;
    @FXML
    private HBox diffBox;
    @FXML
    private Button submitBtn;
    @FXML
    private ComboBox diffCombo;
    @FXML
    private Label diffLabel;
    @FXML
    private TextField nameField;
    @FXML
    private Label nameLabel;

    private Player player;
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player playerNew) {
        player = playerNew;
    }
    @FXML
    protected void onSubmitButtonClick(ActionEvent event) throws IOException {
        if (nameField.getText().isEmpty()
                || nameField.getCharacters().toString().trim().length() == 0) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error");
            a.setHeaderText("Invalid Name");
            a.setContentText("Name cannot be empty or all white space");
            a.showAndWait();
        } else {
            if (diffCombo.getValue().equals("Easy")) {
                player = new Player("Easy");
                Parent thirdScreenParent =
                        FXMLLoader.load(getClass().getResource("thirdScreenEasy.fxml"));
                Scene thirdScreenScene = new Scene(thirdScreenParent, 891, 660);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setUserData(player);
                appStage.setScene(thirdScreenScene);
                appStage.setResizable(false);
                appStage.show();
            } else if (diffCombo.getValue().equals("Medium")) {
                player = new Player("Medium");
                Parent thirdScreenParent =
                        FXMLLoader.load(getClass().getResource("thirdScreenMedium.fxml"));
                Scene thirdScreenScene = new Scene(thirdScreenParent, 891, 660);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setUserData(player);
                appStage.setScene(thirdScreenScene);
                appStage.setResizable(false);
                appStage.show();
            } else if (diffCombo.getValue().equals("Hard")) {
                player = new Player("Hard");
                Parent thirdScreenParent =
                        FXMLLoader.load(getClass().getResource("thirdScreenHard.fxml"));
                Scene thirdScreenScene = new Scene(thirdScreenParent, 891, 660);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setUserData(player);
                appStage.setScene(thirdScreenScene);
                appStage.setResizable(false);
                appStage.show();
            }
        }
    }

    @FXML
    public void initialize() {
        diffCombo.getItems().removeAll(diffCombo.getItems());
        diffCombo.getItems().addAll("Easy", "Medium", "Hard");
        diffCombo.getSelectionModel().select("Easy");
    }

}