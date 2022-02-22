package the.SkyWarriors;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.IOException;


public class FirstScreenController {

    @FXML
    private Button startBtn;

    @FXML
    private Button exitBtn;

    @FXML
    protected void onStartBtn(ActionEvent event) throws IOException {
        Parent secondScreenParent = FXMLLoader.load(getClass().getResource("secondScreen.fxml"));
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
