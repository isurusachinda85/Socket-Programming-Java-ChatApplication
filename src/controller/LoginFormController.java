package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public JFXTextField txtUserName;
    public static String name;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        name=txtUserName.getText();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(LoginFormController.class.getResource("../view/Client01.fxml"))));
        stage.close();
        stage.setTitle("Chat Application");
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
}
