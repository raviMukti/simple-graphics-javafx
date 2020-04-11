package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ShowcaseController implements Initializable {
    @FXML
    private AnchorPane panelBackground;

    @FXML
    private ImageView imgSunLight;

    @FXML
    private Label labelTitle;

    @FXML
    private ToggleButton btnCliclMe;

    @FXML
    private ImageView imgMoonLight;

    @FXML
    void btnCliclMeAction(ActionEvent event) {
        if (btnCliclMe.isSelected()) {
            imgMoonLight.setVisible(true);
            imgSunLight.setVisible(false);
            labelTitle.setText("Dark Mode");
            labelTitle.setStyle("-fx-font-family: Arial");
            labelTitle.setStyle("-fx-font-color: #ffffff");
            panelBackground.setStyle("-fx-background-color: #000000");
        }else{
            imgMoonLight.setVisible(false);
            imgSunLight.setVisible(true);
            labelTitle.setText("White Mode");
            labelTitle.setStyle("-fx-font-family: Segoe-UI");
            labelTitle.setStyle("-fx-font-color: #000000");
            panelBackground.setStyle("-fx-background-color: #ffffff");
        }
    }

    public void initialize(URL location, ResourceBundle resources) {
        imgMoonLight.setVisible(false);
    }
}
