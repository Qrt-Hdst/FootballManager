package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;

import java.io.IOException;

/**
 * Controler okna nowej gry
 */
public class NewGameScreenController {

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
    private VBox vboxSetTrainer;

    /**
     * Przycisk do przejscia do kolejnego okna
     */
    @FXML
    private Button nextButton;

    /**
     * Przycisk powrotu
     */
    @FXML
    private Button backButton;


    public void initialize(){

        //setColorVBox();

    }


    /**
     *  ustawia kolor VBox
     */
    public void setColorVBox() {
        vboxSetTrainer.setAlignment(Pos.TOP_LEFT);

        vboxSetTrainer.setStyle("-fx-background-color: #FFFFFF;");
        vboxSetTrainer.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
    }


    /**
     * Metoda przejścia do kolejnego okna
     * @param event
     */
    @FXML
    void nextMethod(ActionEvent event) {

    }


    /**
     * Powrót do okna menu wejściowego
     * @param event
     */
    @FXML
    void backMethod(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/StartScreen.fxml"));
        Pane pane =null;
        try {
            pane = loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }

        StartScreenController startScreenController = loader.getController();
        startScreenController.setMainController(mainController);
        mainController.setScreen(pane);
    }




}
