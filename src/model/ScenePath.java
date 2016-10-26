package model;

public enum ScenePath {

    START("../view/StartScreen.fxml"), MAIN("../view/MainScreen.fxml");

    private String path;

    ScenePath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}
