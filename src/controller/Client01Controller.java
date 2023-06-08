package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Client01Controller implements Initializable {
    public Label userName;

    @FXML
    private TextField txtMassage;

    @FXML
    private AnchorPane loadImojiPane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userName.setText(LoginFormController.name);
    }

    @FXML
    void imgImportOnClick(MouseEvent event) {

    }

    @FXML
    void imojiOnClick(MouseEvent event) {

    }

    @FXML
    void sendOnAction(ActionEvent event) {

    }

}
