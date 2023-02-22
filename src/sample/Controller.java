package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button decrement;

    @FXML
    private Button increament;

    @FXML
    private Label resultsLable;

    int count=0;

    @FXML
    void add(ActionEvent event) {
      resultsLable.setText(String.valueOf(count++));
    }

    @FXML
    void clearOnAction(ActionEvent event) {
     resultsLable.setText(null);
    }

    @FXML
    void subtract(ActionEvent event) {
        resultsLable.setText(String.valueOf(count--));
    }
    @FXML
    private void leavepage(ActionEvent event) {
        System.exit(0);
        Platform.exit();
    }

}
