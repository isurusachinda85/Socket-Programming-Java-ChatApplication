package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(LoginFormController.class.getResource("../view/Client01.fxml"))));
        stage.close();
        stage.setTitle("Chat Application");
//        stage.getIcons().add(new Image("assest/camera.png"));
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
}
