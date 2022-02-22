package the.SkyWarriors;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader =
                new FXMLLoader(Application.class.getResource("firstScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 825, 625);
        stage.setTitle("T.H.E Tower Defense");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}