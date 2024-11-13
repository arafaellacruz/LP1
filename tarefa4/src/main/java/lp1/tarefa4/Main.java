package lp1.tarefa4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {@Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/lp1/tarefa4/MenuView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Tarefa 4 - Linguagem de Programação I");

        stage.setMaximized(false);
        stage.setResizable(false);

        Image logo = new Image(getClass().getResourceAsStream("/lp1/tarefa4/assets/computer.png"));
        stage.getIcons().add(logo);

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
