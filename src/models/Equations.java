package models;

import Exceptions.ImagenaryNumberException;

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

        return (a*x)+(b*y);
    }

    /**
     * Will sonve for y
     * @param m slope
     * @param x x cordanent
     * @param b y intercpt
     * @return return the answer
     */
    public double slopeIntercept(double m, double x, double b){
        return m*x+b;
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
        return (y2-y1)/(x2-x1);
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
        return sc.squareroot(answer);
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
        return "("+(x1+x2)/2+","+(y1+y2)/2+")";
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
        double square;
        double plus;
        double minus;
        square= bc.exponents(b,2)-4*a*c;
        if (square<0){
            throw new ImagenaryNumberException("cant squareroot a imagenary number");
        }
        square=sc.squareroot(square);
        answer[0]=(-b+square)/(2*a);
        answer[1]=(-b-square)/(2*a);
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
        square= x-h;
        square=bc.exponents(square,2);
        square1=y-k;
        square1=bc.exponents(square1,2);
        answer=square+square1;
        return sc.squareroot(answer);
    }
}
