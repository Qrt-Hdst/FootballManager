package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXML;

import java.io.IOException;


public class StartScreenController {

    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    private VBox ButtonsVBox;

    @FXML
    private Button NewGameButton;

    @FXML
    private Button LoadGameButton;

    @FXML
    private Button ExitButton;

    @FXML
    void openNewGame(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/NewGameScreen.fxml"));
        Pane pane =null;
        try {
            pane = loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }

        NewGameScreenController newGameScreenController = loader.getController();
        newGameScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }


    @FXML
    void openLoadScreen(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/LoadGameScreen.fxml"));
        Pane pane =null;
        try {
            pane = loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        mainController.setScreen(pane);
    }

    @FXML
    void exit(ActionEvent event) {

    }
}

