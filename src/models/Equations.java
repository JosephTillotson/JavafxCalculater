package models;

import Exceptions.ImagenaryNumberException;

public class Equations {

   private BasicCalculater bc=new BasicCalculater();
   private Schientific sc= new Schientific();

    public double standardeq(double a, double x, double b, double y){

        return a*x+b*y;
    }

    public double slopeIntercept(double m, double x, double b){
        return m*x+b;
    }

    public double slope(double y2, double y1, double x2, double x1){
        return (y2-y1)/(x2-x1);
    }

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

    public String midpointFormula(double x1, double x2, double y1, double y2){
        return "("+(x1+x2)/2+","+(y1+y2)/2+")";
    }

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
