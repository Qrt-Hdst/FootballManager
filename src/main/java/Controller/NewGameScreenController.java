package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXML;

import java.io.IOException;

public class NewGameScreenController {

    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
    @FXML
    private VBox vboxSetTrainer;

    @FXML
    private Button dalejButton;

    @FXML
    private Button powrotButton;

    @FXML
    void nextMethod(ActionEvent event) {

    }

    @FXML
    void powrotMethod(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/StartScreen.fxml"));
        Pane pane =null;
        try {
            pane = loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }

        StartScreenController startScreenController = loader.getController();
        startScreenController.setMainController(mainController);
        //StartScreenController startScreenController = loader.getController();
        //startScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }




}
