package models;

import Exceptions.ImagenaryNumberException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Equations {

   private BasicCalculater bc=new BasicCalculater();
   private Schientific sc= new Schientific();

    /**
     * the standartd equasion
     * @param a A value
     * @param x another value
     * @param b another value
     * @param y another value
     * @return return the answer
     */
    public double standardeq(double a, double x, double b, double y){
        double answer=(a*x)+(b*y);
        save("("+a+"*"+x+") + ("+b+"*"+y+") = "+answer);
        return answer;
    }

    /**
     * Will sonve for y
     * @param m slope
     * @param x x cordanent
     * @param b y intercpt
     * @return return the answer
     */
    public double slopeIntercept(double m, double x, double b){
        double answer=m*x+b;
        save(m+"*"+x+"+"+b+" = "+answer);
        return answer;
    }

    /**
     * solve for slope
     * @param y2 Y value
     * @param y1 another y value
     * @param x2 a X value
     * @param x1 another x value
     * @return will return the slope
     */
    public double slope(double y2, double y1, double x2, double x1){
        double answer =(y2-y1)/(x2-x1);
        save("("+y2+"-"+y1+") / ("+x2+"-"+x1+") = "+answer);
        return answer;
    }

    /**
     * will solve the distance between two points
     * @param x2 the first x value
     * @param x1 the second x value
     * @param y2 teh first y value
     * @param y1 teh second y value
     * @return Return the distance
     */
    public double DistanceFormula(double x2, double x1, double y2, double y1){
        double answer;
        double xanswer;
        double yanswer;
        xanswer= x2-x1;
        xanswer=bc.exponents(xanswer, 2);
        yanswer=y2-y1;
        yanswer=bc.exponents(yanswer, 2);
        answer=xanswer+yanswer;
        double finalanswer=sc.squareroot(answer);
        save("√(("+x2+"-"+x1+")+("+y2+"-"+y1+"))"+" = "+"√("+xanswer+"+"+yanswer+") = "+"√("+answer+") = "+finalanswer);
        return finalanswer;
    }

    /**
     * Solve for the midpoint
     * @param x1 the first x value
     * @param x2 the second x value
     * @param y1 the first y value
     * @param y2 the second y value
     * @return will return the midpoint
     */
    public String midpointFormula(double x1, double x2, double y1, double y2){
        String answer="("+(x1+x2)/2+","+(y1+y2)/2+")";
        save("( ("+x1+"+"+x2+")/2 , ("+y1+"+"+y2+")/2  ) = "+answer);
        return answer;
    }

    /**
     * Will solve the quadratic Formula
     * @param a the a value
     * @param b the b value
     * @param c the c value
     * @return return the values of the answer
     */
    public double[] QuadraticFormula(double a,double b, double c){
        double[] answer= new double[2];
        double square1;
        double square;
        double plus;
        double minus;
        square1= bc.exponents(b,2)-(4*a*c);
        if (square1<0){
            throw new ImagenaryNumberException("cant squareroot a imagenary number");
        }
        double a2=2*a;
        square=sc.squareroot(square1);
        answer[0]=(-b+square)/(2*a);
        answer[1]=(-b-square)/(2*a);
        save(-b+"+/-"+"√( "+b+"^2 - 4*"+a+"*"+c+")/("+"2*"+a+") = "+-b+"+/-"+"√( "+square1+") / "+a2+" = "+-b+"+"+square+"/"+a2+" = "+answer[0]+-b+"-"+square+"/"+a2+" = "+answer[1]);
        return answer;
    }

    /**
     * Will solve the equation of a circle
     * @param x the x value
     * @param h the height
     * @param y the y value
     * @param k the k value
     * @return return the size of the circle
     */
    public double equationCircle(double x, double h, double y, double k){
        double square;
        double square1;
        double answer;
        double square2;
        double square12;
        square= x-h;
        square2=bc.exponents(square,2);
        square1=y-k;
        square12=bc.exponents(square1,2);
        answer=square2+square12;
        double answerfinal=sc.squareroot(answer);
        save("√( ("+x+"-"+h+")^2+("+y+"-"+k+")^2 )"+" = "+"√( "+square+"^2"+square1+"^2 ) = √( "+square2+"+"+square12+" ) = √( "+answer+" ) = "+answerfinal);
        return answerfinal;
    }
    private void save(String answer) {
        try (PrintWriter out = new PrintWriter("filename.txt")) {
            out.println(answer);
        } catch (FileNotFoundException e) {
            //
        }
    }
}
