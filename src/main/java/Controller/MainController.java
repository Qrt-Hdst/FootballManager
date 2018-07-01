package Controller;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

/**
 * Kontroler do MainScreen.fxml ("ramy") naszego programu na której będą umieszczane elementy z poszczególnych plików fxml
 */
public class MainController {


    @FXML
    private StackPane mainStackPane;

    @FXML
    public void initialize(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/StartScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch(IOException e){
            e.printStackTrace();
        }
        StartScreenController startScreenController = loader.getController();
        startScreenController.setMainController(this);
        //NewGameScreenController newGameScreenController = loader.getController();
        //newGameScreenController.setMainController(this);
        //mainStackPane.getChildren().add(pane);
        setScreen(pane);
    }

    public void setScreen(Pane pane) {
        mainStackPane.getChildren().clear();
        mainStackPane.getChildren().add(pane);

    }

}
