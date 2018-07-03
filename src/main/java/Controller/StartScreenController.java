package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXML;

import java.io.IOException;

/**
 * Klasa "controller" menu wejściowego
 */
public class StartScreenController {

    /**
     * instancja obiektu MainController, istnieje po to by móc wywowałać metode setMainController i zmienić kontroler
     */
    private MainController mainController;

    /**
     * metoda skutkująca zmianą kontrolera
     * @param mainController
     */
    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    /**
     * VBox przechowujący przyciski
     */
    @FXML
    private VBox ButtonsVBox;

    /**
     * przycisk nowej gry
     */
    @FXML
    private Button NewGameButton;

    /**
     * przycisk wczytania nowej gry
     */
    @FXML
    private Button LoadGameButton;

    /**
     * przycisk wyjścia z gry
     */
    @FXML
    private Button ExitButton;

    /**
     * Metoda, odpowiadająca za przejście do okna nowej gry
     * @param event
     */
    @FXML
    void openNewGame(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/NewGameScreen.fxml"));
        Pane pane =null;
        try {
            pane = loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }

        //zalaczenie zawartosci kontrolera z NewGameScreen
        NewGameScreenController newGameScreenController = loader.getController();
        //ustawienie kontrolera "zassanego" z fxml-a kontrolera.
        newGameScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }

    /**
     * Metoda, odpowiadająca za przejście do okna "wczytania gry"
     * @param event
     */
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

    /**
     * Metoda, odpowiadająca za wyjście
     * @param event
     */
    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }
}

