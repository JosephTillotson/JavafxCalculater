package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import models.*;

import java.beans.EventHandler;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;


public class AnimationAssets  extends Application implements Initializable {
    public static void main(String[] args) {
        Application.launch(AnimationAssets.class, args);
    }

    private  BasicCalculater bc=new BasicCalculater();
    private Schientific s = new Schientific();

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/Resources/MaterialCalculator.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Material Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


    }








    @FXML
    private JFXDrawer LeftDrawer;



    @FXML
    private JFXTextField input;

    @FXML
    private JFXButton rightclick;

    @FXML
    private JFXHamburger ham;

    @FXML
    private Label prompt;

    @FXML


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        HamburgerSlideCloseTransition transition = new HamburgerSlideCloseTransition(ham);
        transition.setRate(-1);
        ham.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
            transition.setRate(transition.getRate() * -1);
            transition.play();

            if (LeftDrawer.isShown()) {
                LeftDrawer.close();
            } else
                LeftDrawer.open();

        });
    }

    private double fnumber;
    private double snumber;
    private String operation;

    public void decimalclick() {
        String oldvalue = input.getText();
        String set = ".";
        input.setText(oldvalue + set);
    }

    public void zeroclick() {
        String oldvalue = input.getText();
        String set = "0";
        input.setText(oldvalue + set);
    }

    public void oneclick() {
        String oldvalue = input.getText();
        String set = "1";
        input.setText(oldvalue + set);
    }

    public void twoclick() {
        String oldvalue = input.getText();
        String set = "2";
        input.setText(oldvalue + set);
    }

    public void threeclick() {
        String oldvalue = input.getText();
        String set = "3";
        input.setText(oldvalue + set);
    }

    public void fourclick() {
        String oldvalue = input.getText();
        String set = "4";
        input.setText(oldvalue + set);
    }

    public void fiveclick() {
        String oldvalue = input.getText();
        String set = "5";
        input.setText(oldvalue + set);
    }

    public void sixclick() {
        String oldvalue = input.getText();
        String set = "6";
        input.setText(oldvalue + set);
    }

    public void sevenclick() {
        String oldvalue = input.getText();
        String set = "7";
        input.setText(oldvalue + set);
    }

    public void eightclick() {
        String oldvalue = input.getText();
        String set = "8";
        input.setText(oldvalue + set);
    }

    public void nineclick() {
        String oldvalue = input.getText();
        String set = "9";
        input.setText(oldvalue + set);
    }

    public void plusclick() {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;
        input.setText("");
        prompt.setText(value + "+");
        operation = "+";


    }

    public void minusclick() {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;
        input.setText("");
        prompt.setText(value + "-");
        operation = "-";
    }

    public void multiplyclick() {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;
        input.setText("");
        prompt.setText(value + "x");
        operation = "x";
    }

    public void divideclick() {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;
        input.setText("");
        prompt.setText(value + "/");
        operation = "/";
    }


   public void Sineclick() {
       String value = input.getText();

       double valuenumber = Double.parseDouble(value);
       this.fnumber = valuenumber;

      double system = s.mySin(fnumber);
       input.setText(String.valueOf(system));
       prompt.setText("Sin(" + value + ")");

    }


    public void Cscclick() {
        String value = input.getText();

        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;

        double system = s.mycsc(fnumber);
        input.setText(String.valueOf(system));
        prompt.setText("Csc(" + value + ")");

    }


    public void Cosclick() {
        String value = input.getText();

        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;

        double system = s.myCos(fnumber);
        input.setText(String.valueOf(system));
        prompt.setText("Cos(" + value + ")");

    }


    public void Tanclick() {
        String value = input.getText();

        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;

        double system = s.myTan(fnumber);
        input.setText(String.valueOf(system));
        prompt.setText("Tan(" + value + ")");

    }


    public void LPclick() {
        String oldvalue = input.getText();
        String set = "(";
        input.setText(oldvalue + set);

    }


    public void Piclick() {
        String oldvalue = input.getText();
        String set = "3.14";
        input.setText(oldvalue + set);

    }


    public void Secclick() {
        String value = input.getText();

        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;

        double system = s.mySec(fnumber);
        input.setText(String.valueOf(system));
        prompt.setText("Sec(" + value + ")");

    }


    public void RPclick() {
        String oldvalue = input.getText();
        String set = ")";
        input.setText(oldvalue + set);


    }


    public void SRclick() {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;
        double system = s.squareroot(fnumber);
        input.setText(String.valueOf(system));
        prompt.setText(" √(" + value + ")");

    }


    public void Cotclick() {
        String value = input.getText();

        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;

        double system = s.myCot(fnumber);
        input.setText(String.valueOf(system));
        prompt.setText("Cot(" + value + ")");

    }


    public void Carclick() {
        String value = input.getText();
        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;
        input.setText("");
        prompt.setText(value + "^");
        operation = "^";

    }

    public void Logclick() {
        String value = input.getText();

        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;

        double system = s.mylog(fnumber);
        input.setText(String.valueOf(system));
        prompt.setText("Log(" + value + ")");

    }


    public void Lnclick() {
        String value = input.getText();

        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;

        double system = s.myln(fnumber);
        input.setText(String.valueOf(system));
        prompt.setText("Ln(" + value + ")");

    }


    public void Fclick() {
        String value = input.getText();

        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;

        double system = s.factoral(fnumber);
        input.setText(String.valueOf(system));
        prompt.setText(value + "!");

    }

    public void equalclicked() {

        switch (operation) {
            case "+":
                String value = input.getText();
                this.snumber = Double.parseDouble(value);
                double system = bc.add(fnumber,snumber);
                input.setText(String.valueOf(system));
                String oldPrompt = prompt.getText();
                prompt.setText(oldPrompt + value);
                save(system,fnumber,snumber);
                break;
            case "-":
                String valuesub = input.getText();
                this.snumber = Double.parseDouble(valuesub);
                double systemsub = bc.subtract(fnumber,snumber);
                input.setText(String.valueOf(systemsub));
                String oldPromptsub = prompt.getText();
                prompt.setText(oldPromptsub + valuesub);
                save(systemsub,fnumber, snumber);
                break;
            case "x":
                String valuemul = input.getText();
                this.snumber = Double.parseDouble(valuemul);
                double systemmul = bc.multiply(fnumber,snumber);
                input.setText(String.valueOf(systemmul));
                String oldPromptmul = prompt.getText();
                prompt.setText(oldPromptmul + valuemul);
                save(systemmul,fnumber,snumber);
                break;
            case "/":
                String valuediv = input.getText();
                this.snumber = Double.parseDouble(valuediv);
                double systemdiv = bc.devide(fnumber,snumber);
                if(snumber == 0){
                    input.setText("Undefined");
                }else
                input.setText(String.valueOf(systemdiv));
                String oldPromptdiv = prompt.getText();
                prompt.setText(oldPromptdiv + valuediv);
                save(systemdiv,fnumber,snumber);
                break;
            case "^":
                String valuecar = input.getText();
                this.snumber = Double.parseDouble(valuecar);
                double systemcar = Math.pow(fnumber,snumber);
                input.setText(String.valueOf(systemcar));
                String oldPromptcar = prompt.getText();
                prompt.setText(oldPromptcar + valuecar);
                save(systemcar,fnumber,snumber);
                break;



        }


    }
    public void clearclick(){
        input.setText("");
        prompt.setText("");
        this.fnumber = 0;
        this.snumber = 0;
    }

    private void save(double answer, double x, double y){
        try (PrintWriter out = new PrintWriter("filename.txt")) {
            out.println(x+"+"+y +"="+ answer);
        }catch (FileNotFoundException e){
            //
        }
    }
}

