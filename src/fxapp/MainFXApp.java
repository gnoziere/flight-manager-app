package fxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.View;

public class MainFXApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/StartScreen.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private static void loadScene(View newScene) {
        FXMLLoader loader = new FXMLLoader(MainFXApp.class.getClass().getResource(newScene.getPath()));
//        Parent root = loader.load();
    }

    public void loadMainScreen() {
        MainFXApp.loadScene(View.MAIN);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
