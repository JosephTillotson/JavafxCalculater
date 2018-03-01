package Controller;

import com.jfoenix.controls.JFXHamburger;

import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AnimationAssets  extends Application implements Initializable {
    public static void main(String[] args) {
        Application.launch(AnimationAssets.class,args);
    }
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/Resources/sample.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Material Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @FXML
    private JFXHamburger ham;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        HamburgerSlideCloseTransition transition = new HamburgerSlideCloseTransition(ham);
        transition.setRate(-1);
        ham.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
            transition.setRate(transition.getRate()*-1);
            transition.play();
        });
    }






}

