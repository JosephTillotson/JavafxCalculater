package Test;

import Exceptions.ImagenaryNumberException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.BasicCalculater;
import models.Calc;
import models.Equations;
import models.Schientific;

public class Main {

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("../Resources/sample.fxml"));
//
//        primaryStage.setTitle("answer it "+answer);
//        primaryStage.setScene(new Scene(root, 3000, 2750));
//        primaryStage.show();
//    }


    public static void main(String[] args) {
        Calc c = new Calc();
        c.drive("2x^3+23x-3");


        //launch(args);
    }
}
