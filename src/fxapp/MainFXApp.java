package fxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ScenePath;

import java.io.IOException;

public class MainFXApp extends Application {

    private static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ScenePath.START.getPath()));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private static void loadScene(ScenePath newScene) {
        try {
            FXMLLoader loader = new FXMLLoader(MainFXApp.class.getClass().getResource(newScene.getPath()));
            Parent root = loader.load();
            mainStage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadStartScreen() {
        MainFXApp.loadScene(ScenePath.START);
    }

    private void loadMainScreen() {
        MainFXApp.loadScene(ScenePath.MAIN);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
