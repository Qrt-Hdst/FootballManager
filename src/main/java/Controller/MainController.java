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

    /**
     * zmienna przechowująca StackPane (rame okienka)
    * */
    @FXML
    private StackPane mainStackPane;

    /**
     * Metoda inicjalizująca, o ile w konstruktorach controlera elementy JavaFX mogą jeszcze nie zdążyć się zainicjalizować
     * ,dlatego też powstała metoda initialize, która wystepuje zaraz po konstruktorze, w momencie gdy wszystkie elementy
     * JavaFX są już zinicjalizowane i gotowe do życia
     */
    @FXML
    public void initialize(){

        //laduje zawartość fxml z pliku StartScreen.fxml
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/StartScreen.fxml"));
        //element JavaFX pane
        Pane pane = null;
        try {
            pane = loader.load(); //ładuje do pane zawartość pliku StartScreen
        } catch(IOException e){
            e.printStackTrace();
        }

        //w loaderze jest zaladowany plik fxml, a teraz przekazujemy getem jego kontroler(tego fxml-a)
        StartScreenController startScreenController = loader.getController();
        startScreenController.setMainController(this);
        setScreen(pane);
    }

    /**
     * usuniecie starej  i włozenienowej zawartości nowe  zawartości  do"pane"
     * @param pane
     */
    public void setScreen(Pane pane) {
        mainStackPane.getChildren().clear();
        mainStackPane.getChildren().add(pane);

    }

}
