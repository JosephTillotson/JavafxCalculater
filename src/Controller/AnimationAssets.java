package Controller;

import com.jfoenix.controls.*;

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
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.stage.Popup;
import javafx.stage.Stage;
import models.*;

import java.beans.EventHandler;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;


public class AnimationAssets  extends Application {
    public static void main(String[] args) {
        Application.launch(AnimationAssets.class, args);
    }

    private BasicCalculater bc = new BasicCalculater();
    private Schientific s = new Schientific();
    private Physics p = new Physics();
    private Equations e = new Equations();


    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/Resources/MaterialCalculator.fxml"));
        Parent popup = FXMLLoader.load(this.getClass().getResource("/Resources/Popup.fxml"));
        Scene scene = new Scene(root);
        Scene Pop = new Scene(popup);
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
    public Label prompt;

    @FXML
    private JFXPopup popup;

    private Label label;

    private double pv1 = 0;
    private double pv2 = 0;
    private double pv3 = 0;
    private double pv4 = 0;


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


    public void Facclick() {
        String value = input.getText();

        double valuenumber = Double.parseDouble(value);
        this.fnumber = valuenumber;

        double system = s.factoral(fnumber);
        input.setText(String.valueOf(system));
        prompt.setText(value + "!");

    }

    @FXML
    void Fclick(ActionEvent event) {
        double m1 = 0;
        double m2 = 0;
        double r = 0;

        Force1();
        Force2();
        Force3();
        m1 = pv1;
        m2 = pv2;
        r = pv3;
      Double ans =  p.force(m1,m2,r);
      input.setText(String.valueOf(ans));
      pv1 = 0;
      pv2 = 0;
      pv3 = 0;



    }

    @FXML
    void Vclick(ActionEvent event) {
        double x1 = 0;
        double x2 = 0;
        double t = 0;
        Velocity1();
        Velocity2();
        Velocity3();

        x1 = pv1;
        x2 = pv2;
        t = pv3;
       Double ans = p.velocity(x1,x2,t);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;
        pv3 = 0;

    }

    @FXML
    void Aclick(ActionEvent event) {
        double v1 = 0;
        double v2 = 0;
        double t1 = 0;
        double t2 = 0;
        Acceleration();
        Acceleration2();
        Acceleration3();
        Acceleration4();
        v1 = pv1;
        v2 = pv2;
        t1 = pv3;
        t2 = pv4;
        double ans = p.acceleration(v1,v2,t1,t2);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;
        pv3 = 0;
        pv4 = 0;


    }


    @FXML
    void Wclick(ActionEvent event) {
        double force = 0;
        double Distance = 0;
        Work();
        Work2();
        force = pv1;
        Distance = pv2;
        double ans = p.work(force,Distance);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;

    }

    @FXML
    void FEclick(ActionEvent event) {
        double ei = 0;
        double work = 0;
        FinalE();
        FinalE2();
        ei = pv1;
        work = pv2;
        double ans = p.ef(ei,work);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;

    }

    @FXML
    void KEclick(ActionEvent event) {
        double mass = 0;
        double velocity = 0;
        KineticE();
        KineticE2();
        mass = pv1;
        velocity = pv2;
        double ans = p.KE(mass,velocity);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;


    }

    @FXML
    void PEclick(ActionEvent event) {
        double mass = 0;
        double height = 0;
        PotentialE();
        PotentialE2();
        mass = pv1;
        height = pv2;
        double ans = p.PEG(mass,height);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;

    }

    @FXML
    void FMclick(ActionEvent event) {
        double IM = 0;
        double Imp = 0;
        FinalMomentum();
        FinalMomentum2();
        IM = pv1;
        Imp = pv2;
        double ans = p.pf(IM,Imp);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;

    }

    @FXML
    void Mclick(ActionEvent event) {
        double mass = 0;
        double velocity = 0;
        Momentum();
        Momentum2();
        mass = pv1;
        velocity = pv2;
        double ans = p.P(mass,velocity);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;


    }

    @FXML
    void Iclick(ActionEvent event) {
        double force = 0;
        double Time = 0;
        Impulse();
        Impulse2();
        force = pv1;
        Time = pv2;
        double ans = p.impulse(force,Time);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;

    }

    @FXML
    void Pclick(ActionEvent event) {
double work = 0;
double time = 0;
Power();
Power2();
work = pv1;
time = pv2;
double ans = p.power(work,time);
input.setText(String.valueOf(ans));
    }

    @FXML
    void LEclick(ActionEvent event) {
        double a = 0;
        double x = 0;
        double b = 0;
        double y = 0;
        LEquation();
        LEquation2();
        LEquation3();
        LEquation4();
        a = pv1;
        x = pv2;
        b = pv3;
        y = pv4;
        double ans = e.standardeq(a,x,b,y);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;
        pv3 = 0;
        pv4 = 0;
    }

    @FXML
    void SIclick(ActionEvent event) {
        double slope =0;
        double xcor=0;
        double yint=0;
        Slopeintercept();
        Slopeintercept2();
        Slopeintercept3();
        slope = pv1;
        xcor = pv2;
        yint = pv3;
        double ans = e.slopeIntercept(slope,xcor,yint);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;
        pv3 = 0;


    }

    @FXML
    void Sclick(ActionEvent event) {
        double y2 = 0;
        double y1 = 0;
        double x2 = 0;
        double x1 = 0;
        Slope();
        Slope2();
        Slope3();
        Slope4();
        y2 = pv1;
        y1 = pv2;
        x2 = pv3;
        x1 = pv4;
        double ans = e.slope(y2,y1,x2,x1);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;
        pv3 = 0;
        pv4 = 0;
    }

    @FXML
    void Dclick(ActionEvent event) {
        double x2 = 0;
        double x1 = 0;
        double y2 = 0;
        double y1 = 0;
        Slope3();
        Slope4();
        Slope();
        Slope2();
        x2 = pv3;
        x1 = pv4;
        y2 = pv1;
        y1 = pv2;
        double ans = e.DistanceFormula(x2,x1,y2,y1);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;
        pv3 = 0;
        pv4 = 0;
    }

    @FXML
    void MPClick(ActionEvent event) {

        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        Slope4();
        Slope3();
        Slope2();
        Slope();
        x1 = pv4;
        x2 = pv3;
        y1 = pv2;
        y2 = pv1;
        String ans = e.midpointFormula(x1,x2,y1,y2);
        input.setText(ans);
        pv1 = 0;
        pv2 = 0;
        pv3 = 0;
        pv4 = 0;

    }

    @FXML
    void CClick(ActionEvent event) {
        double x = 0;
        double h = 0;
        double y = 0;
        double k = 0;
        Circle();
        Circle2();
        Circle3();
        Circle4();
        x = pv1;
        h = pv2;
        y = pv3;
        k = pv4;
        double ans = e.equationCircle(x,h,y,k);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;
        pv3 = 0;
        pv4 = 0;



    }
    @FXML
    void QClick(ActionEvent event){
        double a =0;
        double b=0;
        double c=0;
        Q();
        Q2();
        Q3();
        pv1 = a;
        pv2 = b;
        pv3 = c;
        double[] ans = e.QuadraticFormula(a,b,c);
        input.setText(String.valueOf(ans));
        pv1 = 0;
        pv2 = 0;
        pv3 = 0;
    }

    public void equalclicked() {

        switch (operation) {
            case "+":
                String value = input.getText();
                this.snumber = Double.parseDouble(value);
                double system = bc.add(fnumber, snumber);
                input.setText(String.valueOf(system));
                String oldPrompt = prompt.getText();
                prompt.setText(oldPrompt + value);
                save(system, fnumber, snumber);
                break;
            case "-":
                String valuesub = input.getText();
                this.snumber = Double.parseDouble(valuesub);
                double systemsub = bc.subtract(fnumber, snumber);
                input.setText(String.valueOf(systemsub));
                String oldPromptsub = prompt.getText();
                prompt.setText(oldPromptsub + valuesub);
                save(systemsub, fnumber, snumber);
                break;
            case "x":
                String valuemul = input.getText();
                this.snumber = Double.parseDouble(valuemul);
                double systemmul = bc.multiply(fnumber, snumber);
                input.setText(String.valueOf(systemmul));
                String oldPromptmul = prompt.getText();
                prompt.setText(oldPromptmul + valuemul);
                save(systemmul, fnumber, snumber);
                break;
            case "/":
                String valuediv = input.getText();
                this.snumber = Double.parseDouble(valuediv);
                double systemdiv = bc.devide(fnumber, snumber);
                if (snumber == 0) {
                    input.setText("Undefined");
                } else
                    input.setText(String.valueOf(systemdiv));
                String oldPromptdiv = prompt.getText();
                prompt.setText(oldPromptdiv + valuediv);
                save(systemdiv, fnumber, snumber);
                break;
            case "^":
                String valuecar = input.getText();
                this.snumber = Double.parseDouble(valuecar);
                double systemcar = Math.pow(fnumber, snumber);
                input.setText(String.valueOf(systemcar));
                String oldPromptcar = prompt.getText();
                prompt.setText(oldPromptcar + valuecar);
                save(systemcar, fnumber, snumber);
                break;


        }


    }

    public void clearclick() {
        input.setText("");
        prompt.setText("");
        this.fnumber = 0;
        this.snumber = 0;
    }

    private void save(double answer, double x, double y) {
        try (PrintWriter out = new PrintWriter("filename.txt")) {
            out.println(x + "+" + y + "=" + answer);
        } catch (FileNotFoundException e) {
            //
        }
    }

    boolean wait = true;

    public String waitforuser() {
        String value = null;

        while (wait) {
            try {
                if (value != null) {
                    break;
                }
                value = input.getText();

            } catch (Exception ex) {

            }
        }
        return value;
    }
//Force
    public void Force1() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Mass of the 1st Object (Kilograms)");
        dialog.setContentText("m1:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V1 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V1);

        });


    }
    public void Force2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Mass of the 2nd Object (Kilograms)");
        dialog.setContentText("m2:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V2 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V2);
        });
    }
    public void Force3() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Distance between the 2 Objects (Meters)");
        dialog.setContentText("r:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv3 = Double.parseDouble(V3);
        });
        }
        //end of Force
    // Velocity
        public void Velocity1() {
            TextInputDialog dialog = new TextInputDialog("");


            dialog.setTitle("Yeet your Numbers");
            dialog.setHeaderText("Enter the Starting Point of the Object (Meters)");
            dialog.setContentText("x1:");
            Optional<String> result = dialog.showAndWait();

            result.ifPresent(name -> {
                this.prompt.setText(name);
                String V3 = this.prompt.getText();
                this.pv1 = Double.parseDouble(V3);
            });
        }
    public void Velocity2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Ending Position of the Object (Meters)");
        dialog.setContentText("x2:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    public void Velocity3() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Time Interval of the object (Seconds)");
        dialog.setContentText("t1:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv3 = Double.parseDouble(V3);
        });
    }
    //end of Velocity
    //Acceleration
    public void Acceleration() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Initial Velocity");
        dialog.setContentText("v1:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void Acceleration2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Final Velocity");
        dialog.setContentText("v2:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    public void Acceleration3() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Initial Time");
        dialog.setContentText("t1:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv3 = Double.parseDouble(V3);
        });
    }
    public void Acceleration4() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Final Time");
        dialog.setContentText("t2:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv4 = Double.parseDouble(V3);
        });
    }
    //end of acceleration
    //work
    public void Work() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Force");
        dialog.setContentText("Force:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void Work2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Distance");
        dialog.setContentText("Distance:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    //end of work
    //final energy
    public void FinalE() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Initial Energy applied");
        dialog.setContentText("IE:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void FinalE2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Amount of Work Done");
        dialog.setContentText("Work:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    //end of Energy
    //Kinetic
    public void KineticE() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Mass of the Object");
        dialog.setContentText("Mass:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void KineticE2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Velocity of the Object");
        dialog.setContentText("Velocity:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
// End of Kinetic
    //Potential
public void PotentialE() {
    TextInputDialog dialog = new TextInputDialog("");


    dialog.setTitle("Yeet your Numbers");
    dialog.setHeaderText("Enter the Mass of the Object");
    dialog.setContentText("Mass:");
    Optional<String> result = dialog.showAndWait();

    result.ifPresent(name -> {
        this.prompt.setText(name);
        String V3 = this.prompt.getText();
        this.pv1 = Double.parseDouble(V3);
    });
}
    public void PotentialE2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the height the object is from the ground");
        dialog.setContentText("Height:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    //end of Potential
    //Fin Momentum
    public void FinalMomentum() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the intial Momentum of the Object");
        dialog.setContentText("M1:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void FinalMomentum2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Impulse of the Object");
        dialog.setContentText("I:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    //End of Fin Momentum
    //momemntum
    public void Momentum() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the mass of the Object");
        dialog.setContentText("m1:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void Momentum2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the velocity of the object");
        dialog.setContentText("v:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    //end of Momentum
    //Impulse
    public void Impulse() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Force");
        dialog.setContentText("F:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void Impulse2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Time");
        dialog.setContentText("T:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    // end of impulse
    public void Power() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the amount of work done");
        dialog.setContentText("W:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void Power2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter The time interval");
        dialog.setContentText("t:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    public void LEquation() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the value for a");
        dialog.setContentText("a:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void LEquation2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the value for x");
        dialog.setContentText("x:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    public void LEquation3() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the value for b");
        dialog.setContentText("b:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv3 = Double.parseDouble(V3);
        });
    }
    public void LEquation4() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the value for y");
        dialog.setContentText("y:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv4 = Double.parseDouble(V3);
        });
    }
    //end of standard
    public void Slopeintercept() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Slope, if its a fraction, please put it in decimal form");
        dialog.setContentText("m1:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V1 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V1);

        });


    }
    public void Slopeintercept2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the X coordinant");
        dialog.setContentText("X:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V2 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V2);
        });
    }
    public void Slopeintercept3() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Y-Intercept");
        dialog.setContentText("b:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv3 = Double.parseDouble(V3);
        });
    }
    public void Slope() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the value for y2");
        dialog.setContentText("y2:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void Slope2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Value for y1");
        dialog.setContentText("y1:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    public void Slope3() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the value for x2");
        dialog.setContentText("x2:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv3 = Double.parseDouble(V3);
        });
    }
    public void Slope4() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the value for x1");
        dialog.setContentText("x1:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv4 = Double.parseDouble(V3);
        });
    }
    public void Q() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Value of a");
        dialog.setContentText("a:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V1 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V1);

        });


    }
    public void Q2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Value b");
        dialog.setContentText("b:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V2 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V2);
        });
    }
    public void Q3() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the Value of C");
        dialog.setContentText("c:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv3 = Double.parseDouble(V3);
        });
    }
    public void Circle() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the X value");
        dialog.setContentText("x:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv1 = Double.parseDouble(V3);
        });
    }
    public void Circle2() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the height");
        dialog.setContentText("h:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv2 = Double.parseDouble(V3);
        });
    }
    public void Circle3() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the value of y");
        dialog.setContentText("y:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv3 = Double.parseDouble(V3);
        });
    }
    public void Circle4() {
        TextInputDialog dialog = new TextInputDialog("");


        dialog.setTitle("Yeet your Numbers");
        dialog.setHeaderText("Enter the K value");
        dialog.setContentText("k:");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {
            this.prompt.setText(name);
            String V3 = this.prompt.getText();
            this.pv4 = Double.parseDouble(V3);
        });
    }







}

