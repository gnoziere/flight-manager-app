package model;

public enum View {

    START("../view/StartScreen.fxml"), MAIN("../view/MainScreen.fxml");

    private String path;

    View(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}
